package com.tenondelabs.hack2017.ui.distrito;

import com.tenondelabs.hack2017.data.interactors.DistritoInteractor;
import com.tenondelabs.hack2017.data.model.Distritos;
import com.tenondelabs.hack2017.helpers.EventBus;

import org.greenrobot.eventbus.Subscribe;

import java.util.List;

/**
 * @author Rodrigo Garcete
 * @version 1.0
 * Clase que implementa las acciones de las pantallas UI
 * Copyright 2016 Akibusca Inc. All rights reserved
 */
public class DistritoPresenterImpl implements DistritoPresenter {

    private DistritoView distritoView;
    private DistritosInteractor distritoInteractor;
    private EventBus eventBus;

    public DistritoPresenterImpl(DistritoView distritoView, DistritosInteractor distritoInteractor, EventBus eventBus) {
        this.distritoView = distritoView;
        this.distritoInteractor = distritoInteractor;
        this.eventBus = eventBus;
    }

    @Override
    public void onResume() {
        eventBus.register(this);
    }

    @Override
    public void onPause() {
        eventBus.unregister(this);
    }

    @Override
    public void onDestroy() {
        this.distritoView = null;
    }

    @Override
    public void getDistritos() {
        if (this.distritoView != null) {
            distritoView.showProgress();
        }

        this.distritoInteractor.getDistritosList();
    }

    @Override
    public void loadDistritos() {
        if (this.distritoView != null) {
            distritoView.showProgress();
        }

        this.distritoInteractor.loadDistritosFromStorage();
    }

    @Override
    @Subscribe
    public void onEventMainThread(DistritoEvent distritoEvent) {
        String errorMsg = distritoEvent.getError();
        if (this.distritoView != null) {
            this.distritoView.hideProgress();

            if (errorMsg != null) {
                distritoView.onEntityError(errorMsg);
            } else {
                List<Distritos> items = distritoEvent.getDistritos();
                if (items != null && !items.isEmpty()) {
                    distritoView.setDistritos(items);
                }
            }
        }
    }
}

package com.tenondelabs.hack2017.di.modules;

import android.content.Context;

import com.tenondelabs.hack2017.data.interactors.GobernacionInteractor;
import com.tenondelabs.hack2017.data.interactors.impl.GobernacionInteractorImpl;
import com.tenondelabs.hack2017.data.remote.TenondeApiClient;
import com.tenondelabs.hack2017.data.repository.GobernacionRepository;
import com.tenondelabs.hack2017.data.repository.impl.GobernacionRepositoryImpl;
import com.tenondelabs.hack2017.helpers.EventBus;
import com.tenondelabs.hack2017.ui.gobernacion.GobernacionAdapter;
import com.tenondelabs.hack2017.ui.gobernacion.GobernacionPresenter;
import com.tenondelabs.hack2017.ui.gobernacion.GobernacionPresenterImpl;
import com.tenondelabs.hack2017.ui.gobernacion.GobernacionView;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * @author Rodrigo Garcete
 * @version 1.0
 * Copyright 2016 Akibusca Inc. All rights reserved
 */
@Module
public class EntidadModule {

    private EntidadView entidadView;

    public EntidadModule(EntidadView entidadView) {
        this.entidadView = entidadView;
    }

    @Provides
    @Singleton
    EntidadView provideEntidadView() {
        return this.entidadView;
    }

    @Provides
    @Singleton
    EntidadPresenter provideEntidadPresenter(EntidadView ciudadView, EntidadInteractor entidadInteractor, EventBus eventBus) {
        return new EntidadPresenterImpl(ciudadView, entidadInteractor, eventBus);
    }

    @Provides
    EntidadAdapter provideAdapter(Context context) {
        return new EntidadAdapter(context);
    }

    @Provides
    @Singleton
    EntidadInteractor provideEntidadInteractor(EntidadRepository ciudadRepository) {
        return new EntidadInteractorImpl(ciudadRepository);
    }

    @Provides
    @Singleton
    EntidadRepository provideEntidadRepository(TenondeApiClient client, EventBus eventBus, Realm realm) {
        return new EntidadRepositoryImpl(client, eventBus, realm);
    }

}

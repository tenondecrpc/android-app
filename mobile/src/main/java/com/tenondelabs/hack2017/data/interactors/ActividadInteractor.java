package com.tenondelabs.hack2017.data.interactors;

import com.tenondelabs.hack2017.data.model.Gobernacion;

import java.util.List;

/**
 * @author Rodrigo Garcete
 * @version 1.0
 * Copyright 2016 Akibusca Inc. All rights reserved
 */
public interface ActividadInteractor {
    void getActividadList();
    void loadActividadesFromStorage();
    void saveActividades(List<Actividad> actividadList);
}
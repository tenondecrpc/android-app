package com.tenondelabs.hack2017.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by tenondelabs on 08/07/17.
 */

public class Avance extends RealmObject {

    private Long id;
    @SerializedName("avanceid")
    private Long avanceId;
    private String justificacion;
    private String cantidad;
    @SerializedName("fechaavance")
    private Date fechaAvance;
    @SerializedName("fechainicio")
    private Date fechaInicio;
    @SerializedName("fechafin")
    private Date fechaFin;
    @SerializedName("entidadid")
    private Long entidadId;
    @SerializedName("entidadsigla")
    private String entidadSigla;
    @SerializedName("actividadid")
    private Long actividadId;
    @SerializedName("actividadnombre")
    private String activadaNombre;
    private int periodo;
    @SerializedName("departamentoid")
    private Long departamentoId;
    @SerializedName("departamentonombre")
    private String departamentoNombre;
    @SerializedName("distritoid")
    private Long distritoId;
    @SerializedName("distritonombre")
    private String distritoNombre;

    public Avance() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAvanceId() {
        return avanceId;
    }

    public void setAvanceId(Long avanceId) {
        this.avanceId = avanceId;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFechaAvance() {
        return fechaAvance;
    }

    public void setFechaAvance(Date fechaAvance) {
        this.fechaAvance = fechaAvance;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getEntidadSigla() {
        return entidadSigla;
    }

    public void setEntidadSigla(String entidadSigla) {
        this.entidadSigla = entidadSigla;
    }

    public Long getActividadId() {
        return actividadId;
    }

    public void setActividadId(Long actividadId) {
        this.actividadId = actividadId;
    }

    public String getActivadaNombre() {
        return activadaNombre;
    }

    public void setActivadaNombre(String activadaNombre) {
        this.activadaNombre = activadaNombre;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Long getDepartamentoId() {
        return departamentoId;
    }

    public void setDepartamentoId(Long departamentoId) {
        this.departamentoId = departamentoId;
    }

    public String getDepartamentoNombre() {
        return departamentoNombre;
    }

    public void setDepartamentoNombre(String departamentoNombre) {
        this.departamentoNombre = departamentoNombre;
    }

    public Long getDistritoId() {
        return distritoId;
    }

    public void setDistritoId(Long distritoId) {
        this.distritoId = distritoId;
    }

    public String getDistritoNombre() {
        return distritoNombre;
    }

    public void setDistritoNombre(String distritoNombre) {
        this.distritoNombre = distritoNombre;
    }

    public Long getEntidadId() {
        return entidadId;
    }

    public void setEntidadId(Long entidadId) {
        this.entidadId = entidadId;
    }
}

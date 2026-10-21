package com.programacion_mobile.api1.model

sealed class EstadoRecordatorio(val etiqueta: String) {
    object Pendiente : EstadoRecordatorio("Pendiente")
    object EnProgreso : EstadoRecordatorio("En Progreso")
    object Completado : EstadoRecordatorio("Completado")
}
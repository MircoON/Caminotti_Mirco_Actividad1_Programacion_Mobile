package com.programacion_mobile.api1.model

object DatosSimulados {
    val catTrabajo = Categoria(id = 1, nombre = "Trabajo")
    val catPersonal = Categoria(id = 2, nombre = "Personal")
    val catEstudios = Categoria(id = 3, nombre = "Estudios")
////////////////////////////////////////////////////////////
    val categoriasUnicas: Set<Categoria> = setOf(
        catTrabajo,
        catPersonal,
        catEstudios,
        catTrabajo
    )
////////////////////////////////////////////////////////////
    val coloresPorCategoria: Map<Categoria, String> = mapOf(
        catTrabajo to "#FF5722",
        catPersonal to "#4CAF50",
        catEstudios to "#2196F3"
    )
////////////////////////////////////////////////////////////
    val listaRecordatorios: List<Recordatorio> = listOf(
        Recordatorio(
            id = 1,
            titulo = "Entregar Actividad 1 de Mobile",
            descripcion = "Subir documento PDF con evidencias y enlace a GitHub",
            categoria = catEstudios,
            prioridad = Prioridad.ALTA,
            estado = EstadoRecordatorio.EnProgreso
        ),
        Recordatorio(
            id = 2,
            titulo = "Reunión de equipo semanal",
            descripcion = null,
            categoria = catTrabajo,
            prioridad = Prioridad.MEDIA,
            estado = EstadoRecordatorio.Pendiente
        ),
        Recordatorio(
            id = 3,
            titulo = "Completar rutina de ejercicios",
            descripcion = null,
            categoria = catPersonal,
            prioridad = Prioridad.BAJA,
            estado = EstadoRecordatorio.Completado
        )
    )
///////////////////////////////////////////////////////////////////////
    fun filtrarPorPrioridad(prioridad: Prioridad): List<Recordatorio> {
        return listaRecordatorios.filter { it.prioridad == prioridad }
    }
////////////////////////////////////////////////////////////////////////
    fun filtrarPorEstado(estado: EstadoRecordatorio): List<Recordatorio> {
        return listaRecordatorios.filter { it.estado == estado }
    }
}
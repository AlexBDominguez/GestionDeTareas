package com.example.gestiondetareas.model

data class Tarea(

    val id: Int,
    val tarea: String,
    val descripcion: String,
    val fecha_tope: String,
    val completado: Boolean

)
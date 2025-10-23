package com.example.gestiondetareas.viewmodel

import androidx.compose.runtime.mutableStateListOf
import com.example.gestiondetareas.data.DataSource
import com.example.gestiondetareas.model.Tarea

class TareasViewModel() {

    private val _tareas = mutableStateListOf<Tarea>()
    val tareas: List<Tarea> get()= _tareas


    init{
        cargarTareas()
    }

    private fun cargarTareas(){
        _tareas.addAll(DataSource.cargarTareasJson())
    }

    fun cambiarEstado(id: Int): Boolean {
        val index = _tareas.indexOfFirst { it.id == id }
        if (index != -1) {
            val tarea = _tareas[index]
            _tareas[index] = tarea.copy(completado = !tarea.completado)
            return true
        } else {
            return false
        }
    }


    fun tareasPendientes() = _tareas.filter { !it.completado }

}



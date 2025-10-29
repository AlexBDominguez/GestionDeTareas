package com.example.gestiondetareas.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.gestiondetareas.data.DataSource
import com.example.gestiondetareas.model.Tarea
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class TareasViewModel: ViewModel() {

    private val _tareas = mutableStateListOf<Tarea>()
    val tareas: List<Tarea> get()= _tareas

    private val _pendientesCount = MutableStateFlow(0)
    val pendientesCount: StateFlow<Int> = _pendientesCount

    init{
        cargarTareas()
        viewModelScope.launch {
            updatePendientesCount()
        }
    }

    private fun cargarTareas(){
        _tareas.addAll(DataSource.cargarTareasJson())
        updatePendientesCount()
    }


    private fun updatePendientesCount() {
        _pendientesCount.value = _tareas.count { !it.completado }
    }

    fun cambiarEstado(id: Int) {
        val index = _tareas.indexOfFirst { it.id == id }
        if (index != -1) {
            val tareaActual = _tareas[index]
            val nuevaTarea = tareaActual.copy(completado = !tareaActual.completado)
            _tareas[index] = nuevaTarea
            updatePendientesCount()
        }
    }
}


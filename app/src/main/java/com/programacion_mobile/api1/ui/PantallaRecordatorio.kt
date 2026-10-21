package com.programacion_mobile.api1.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.programacion_mobile.api1.model.DatosSimulados

@Composable
fun PantallaRecordatorios() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Lista de Recordatorios",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            items(DatosSimulados.listaRecordatorios) { recordatorio ->
                Column {
                    Text(text = "Título: ${recordatorio.titulo}", fontWeight = FontWeight.Bold)
                    Text(text = "Categoría: ${recordatorio.categoria.nombre}")
                    Text(text = "Prioridad: ${recordatorio.prioridad}")
                    Text(text = "Estado: ${recordatorio.estado.etiqueta}")

                    recordatorio.descripcion?.let { desc ->
                        Text(text = "Descripción: $desc")
                    }
                }
            }
        }
    }
}
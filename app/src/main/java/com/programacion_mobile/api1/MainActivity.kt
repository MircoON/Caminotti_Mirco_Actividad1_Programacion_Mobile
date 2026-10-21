package com.programacion_mobile.api1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.programacion_mobile.api1.ui.PantallaRecordatorios

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaRecordatorios()
        }
    }
}
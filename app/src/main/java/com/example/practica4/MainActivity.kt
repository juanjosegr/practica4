package com.example.practica4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.practica4.screens.SuperHeroViewColumns
import com.example.practica4.screens.SuperHeroViewRows
import com.example.practica4.screens.SuperHeroViewVerticalGrid
import com.example.practica4.ui.theme.Practica4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Practica4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //SuperHeroViewRows()
                    //SuperHeroViewColumns()
                    SuperHeroViewVerticalGrid()
                }
            }
        }
    }
}

@Composable
fun SimpleRecyclerView() {
    val myList = listOf("Marta", "Pepe", "Manolo", "Jaime")
    LazyColumn {
        item { Text(text = "Header") }
        items(3) {
            Text(text = "Este es el item $it")
        }
        items(myList) {
            Text(text = "Hola me llamo $it")
        }
        item { Text(text = "Footer") }
    }
}


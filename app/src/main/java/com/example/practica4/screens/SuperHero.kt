package com.example.practica4.screens

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practica4.funciones.Superhero
import com.example.practica4.funciones.getSuperHeroes


@Composable
fun SuperHeroViewColumns() {
    val context = LocalContext.current

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperHeroes()) { superhero ->
            ItemHeroColumns(superhero = superhero, onItemSelected = {
                Toast.makeText(context, it.superHeroName, Toast.LENGTH_SHORT).show()
            })
        }
    }
}


@Composable
fun ItemHeroColumns(superhero: Superhero, onItemSelected: (Superhero) -> Unit) {
    Card(
        modifier = Modifier
            .clickable { onItemSelected(superhero) }
            .fillMaxWidth(),
        border = BorderStroke(2.dp, color = Color.Red),
    ) {
        Column {
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Text(text = superhero.superHeroName, Modifier.align(Alignment.CenterHorizontally))
            Text(text = superhero.realName, Modifier.align(Alignment.CenterHorizontally))
            Text(
                text = superhero.publisher,
                Modifier
                    .align(Alignment.End)
                    .padding(end = 12.dp),
                style = TextStyle(fontSize = 10.sp)
            )
        }
    }

}



@Composable
fun SuperHeroViewRows() {
    val context = LocalContext.current

    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(getSuperHeroes()) { superhero ->
            ItemHeroRow(superhero = superhero, onItemSelected = {
                Toast.makeText(context, it.superHeroName, Toast.LENGTH_SHORT).show()
            })
        }
    }
}
@Composable
fun ItemHeroRow(superhero: Superhero, onItemSelected: (Superhero) -> Unit) {
    Card(
        modifier = Modifier
            .width(200.dp)
            .clickable { onItemSelected(superhero) },
        border = BorderStroke(2.dp, color = Color.Red),
    ) {
        Column {
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Text(text = superhero.superHeroName, Modifier.align(Alignment.CenterHorizontally))
            Text(text = superhero.realName, Modifier.align(Alignment.CenterHorizontally))
            Text(
                text = superhero.publisher,
                Modifier
                    .align(Alignment.End)
                    .padding(end = 12.dp),
                style = TextStyle(fontSize = 10.sp)
            )
        }
    }

}

@Composable
fun SuperHeroViewVerticalGrid() {
    val context = LocalContext.current

    LazyVerticalGrid(
        columns = GridCells.Adaptive(130.dp),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(horizontal = 4.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ){
        items(getSuperHeroes()) { superhero ->
            ItemHeroVerticalGrid(superhero = superhero, onItemSelected = {
                Toast.makeText(context, it.superHeroName, Toast.LENGTH_SHORT).show()
            })
        }
    }
}


@Composable
fun ItemHeroVerticalGrid(superhero: Superhero, onItemSelected: (Superhero) -> Unit) {
    Card(
        modifier = Modifier
            .clickable { onItemSelected(superhero) }
            .fillMaxWidth(),
        border = BorderStroke(2.dp, color = Color.Red),
    ) {
        Column {
            Image(
                painter = painterResource(id = superhero.photo),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
            Text(text = superhero.superHeroName, Modifier.align(Alignment.CenterHorizontally))
            Text(text = superhero.realName, Modifier.align(Alignment.CenterHorizontally))
            Text(
                text = superhero.publisher,
                Modifier
                    .align(Alignment.End)
                    .padding(end = 12.dp),
                style = TextStyle(fontSize = 10.sp)
            )
        }
    }

}
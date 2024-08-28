package br.com.fiap.myway.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController

@Composable
fun HomeScreen (modifier: Modifier = Modifier, navController: NavController) {

    Surface(
    modifier = Modifier.fillMaxSize(),
        color = Color(0xFFAE6DE6)


    ) {


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {

                navController.navigate("Map")
            }) {
                Text(text =  "Map")
                
            }



            Button(onClick = {
                navController.navigate("Login")
            }) {
                Text(text =  "Sair")

            }

        }
    }


}


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    //HomeScreen()
}
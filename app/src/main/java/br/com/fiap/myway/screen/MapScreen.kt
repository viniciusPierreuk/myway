package br.com.fiap.myway.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.myway.R

@Composable
fun MapScreen(modifier: Modifier = Modifier, navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFAE6DE6)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
                .verticalScroll(rememberScrollState()), // Permite rolagem na tela
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "My Way",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 24.dp)
            )

            Button(onClick = {
                navController.navigate("Login")
            }) {
                Text(text = "Sair")
            }

            Spacer(modifier = Modifier.height(32.dp))


            Image(
                painter = painterResource(id = R.drawable.map2_fiap),
                contentDescription = "Mapa Simulado",
                modifier = Modifier
                    .size(300.dp) // Define o tamanho da imagem
                    .padding(top = 16.dp)
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Legenda
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Legenda:", color = Color.White, fontWeight = FontWeight.Bold)

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "😊 Acessível", color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "😢 Não Acessível", color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "🛠️ Em Manutenção", color = Color.White)
                }

                Spacer(modifier = Modifier.height(8.dp))

                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(text = "🚧 Interditado", color = Color.White)
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            
            Text(text = "Regiões Registradas:", color = Color.White, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(16.dp))

            Column {
                listOf("Região 1", "Região 2", "Região 3").forEach { region ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(text = "region", color = Color.White)
                        Text(text = "Acessível", color = Color.White)
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun MapScreenPreview() {
    

}

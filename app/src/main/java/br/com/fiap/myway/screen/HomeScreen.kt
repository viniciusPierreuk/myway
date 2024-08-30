package br.com.fiap.myway.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import br.com.fiap.myway.R

@Composable
fun HomeScreen(modifier: Modifier = Modifier, navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF03A9F4)
    ) {
        Column(
            modifier = Modifier
                .verticalScroll(rememberScrollState())
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Navbar Section
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp)
                    .background(colorResource(id = R.color.vermelho_fiap))

            ) {
                Image(
                    painter = painterResource(id = R.drawable.map_fiap),
                    contentDescription = "Logo",
                    modifier = Modifier.size(30.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "MobGov",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterVertically)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Welcome Section
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "Bem-vindo ao time!",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "MobGov é um aplicativo destinado a ajudar na acessibilidade urbana, permitindo que os usuários marquem e compartilhem locais acessíveis e não acessíveis na cidade.",
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
                Image(
                    painter = painterResource(id = R.drawable.welcome_image),
                    contentDescription = "Welcome Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .padding(vertical = 20.dp)
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Main Features Section
            Column(
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.padding(20.dp)
            ) {
                Text(text = "Funcionalidades Principais", color = Color.White)
                Text(text = "• Marcar locais acessíveis e não acessíveis", color = Color.White)
                Text(text = "• Compartilhar informações com outros usuários", color = Color.White)
                Text(text = "• Buscar por locais específicos", color = Color.White)
                Text(text = "• Ver rotas e pontos de interesse próximos", color = Color.White)
            }

            Spacer(modifier = Modifier.height(20.dp))

            // Navigation Buttons
            Button(onClick = {
                navController.navigate("Map")
            }) {
                Text(text = "Map")
            }

            Spacer(modifier = Modifier.height(10.dp))

            Button(onClick = {
                navController.navigate("Login")
            }) {
                Text(text = "Sair")
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    //HomeScreen()
}

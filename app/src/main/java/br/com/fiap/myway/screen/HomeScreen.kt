
package br.com.fiap.myway.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import br.com.fiap.myway.R

@Composable
fun HomeScreen (modifier: Modifier = Modifier, navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFAE6DE6)


    ) {

// --- formulário
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 32.dp)
        ) {
            Card(
                modifier = Modifier
                    .offset(y = (-30).dp)
                    .fillMaxWidth()
                    .height(500.dp),
                colors = CardDefaults
                    .cardColors(containerColor = Color(0xfff9f6f6)),
                elevation = CardDefaults.cardElevation(4.dp)
            ) {
                Column(
                    modifier = Modifier.padding(
                        vertical = 16.dp,
                        horizontal = 32.dp
                    )
                ) {
                    Text(
                        text = "Seus dados",
                        modifier = Modifier.fillMaxWidth(),
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        color = colorResource(id = R.color.teal_700),
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.height(32.dp))
                    Text(
                        text = "Seu peso",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.teal_700)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(text = "Seu peso em Kg.")
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.purple_200),
                            focusedBorderColor = colorResource(id = R.color.purple_200)
                        ),
                        shape = RoundedCornerShape (16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Text(
                        text = "Sua altura",
                        modifier = Modifier.padding(bottom = 8.dp),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = colorResource(id = R.color.purple_200)
                    )
                    OutlinedTextField(
                        value = "",
                        onValueChange = {},
                        modifier = Modifier.fillMaxWidth(),
                        placeholder = {
                            Text(
                                text = "Sua altura em cm."
                            )
                        },
                        colors = OutlinedTextFieldDefaults.colors(
                            unfocusedBorderColor = colorResource(id = R.color.purple_500),
                            focusedBorderColor = colorResource(id = R.color.purple_500)
                        ),
                        shape = RoundedCornerShape(16.dp),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal)
                    )
                    Spacer(modifier = Modifier.height(16.dp))
                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(48.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.purple_500))
                    ) {
                        Text(
                            text = "CALCULAR",
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            fontSize = 14.sp
                        )
                    }
                }
            }
        }













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
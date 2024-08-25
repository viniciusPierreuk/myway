package br.com.fiap.myway.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun LoginScreen (modifier: Modifier = Modifier) {
   Surface(
       modifier = Modifier
           .fillMaxSize()
           .background(Color.Blue)


   ) {


       Column(modifier = Modifier.padding(top = 16.dp, start = 32.dp))

                   
                {
           Column {
               Text(
                   text = "Login",
                   fontSize = 48.sp,
                   fontWeight = FontWeight.Bold,
                   color = Color.Yellow

               )
                Text(text = "Efetue a sua autentificação")

           }
      Column(
           modifier = Modifier.fillMaxWidth()
      ) {
          OutlinedTextField(value = "",
               onValueChange ={},
               label = {
                   Text(text = "E-mail")
               },

              modifier = Modifier.fillMaxWidth()


              )
      }

       }

   }



    }


@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun LoginScreenPreview() {
    LoginScreen()
}

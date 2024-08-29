package br.com.fiap.myway.screen



import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
fun MapScreen (modifier: Modifier = Modifier, navController: NavController) {

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFAE6DE6)


    ) {


        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {


            navController.navigate(("Login"))

            /*TODO*/ }) {
                Text(text =  "Sair")

            }




            Text(
                text = "My Way",
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(top = 12.dp, bottom = 24.dp)


            )



        }

        Image(
            painter = painterResource(id = R.drawable.map2_fiap),
            contentDescription = "Logo",
            modifier = Modifier
                .size(60.dp)
                .padding(top = 16.dp)
        )







    }


}




@Preview(showBackground = true,  showSystemUi = true)
@Composable
private fun MapScreenPreview() {
    //MapScreen()
}
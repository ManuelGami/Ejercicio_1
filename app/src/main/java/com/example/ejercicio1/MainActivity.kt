package com.example.ejercicio1
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejercicio1.ui.theme.Ejercicio1Theme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejercicio1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                ) {
                    certificatecourse("Manuel Alberto Meza Gamino", number = 42, course = "ENALT")
                }
            }
        }
    }
}
@Composable
fun certificatecourse(name: String,number:Int, course:String,modifier: Modifier = Modifier) {
    Column ( // el column es para que no se amontonen los elementos
            modifier= modifier
                .fillMaxSize()
                .padding(40.dp),
            verticalArrangement=Arrangement.Top //centra de arriba a abajo
    )
    {
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxWidth()
        ) {// el box es para poner las cosas encima de otra
            Image(
                painter = painterResource(id = R.drawable.logo_1),
                contentDescription = "image",
                modifier
                    .size(50.dp, 50.dp)
                    .padding(4.dp)
                //modifier = modifier.fillMaxWidth(),
                //alpha = 0.3F //transparencia
            )
            Spacer(modifier = Modifier.size(40.dp)) // pone espaio entre los elementos
                Text(
                    text = "Stark Industries", // el signo de pesos solo se pone cuando es dentro de una cadena
                    fontSize = 20.sp,// tamaño de letra
                    fontWeight = FontWeight.Light, //negritas

                    //textAlign = TextAlign.Center,// poner en medio de izq a der
                    //modifier = modifier.fillMaxWidth()// poner en medio de izq a der
                )
            Spacer(modifier = Modifier.size(40.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_2),
                contentDescription = "image2",
                modifier
                    .size(50.dp,50.dp)
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "This certificate is presented to:",// el signo de pesos solo se pone cuando es dentro de una cadena
            fontSize = 20.sp,// tamaño de letra
            textAlign = TextAlign.Center,//poner en medio de izq a der
             modifier = modifier.fillMaxWidth()// poner en medio de izq a der
        )
        Spacer(modifier = Modifier.height(40.dp))
        Box(
            contentAlignment=Alignment.Center
        ){
            Image(
                painter = painterResource(id = R.drawable.android_logo),
                contentDescription = "image2",
                modifier
                    .size(150.dp)
                    .alpha(.4F)
                    .fillMaxWidth(),
            )
            Text(
                text = name,// el signo de pesos solo se pone cuando es dentro de una cadena
                fontSize = 30.sp,// tamaño de letra
                fontWeight = FontWeight.Bold, //negritas
                textAlign = TextAlign.Center,//poner en medio de izq a der
                modifier = modifier.fillMaxWidth()// poner en medio de izq a der
            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Text(
            text = "has completed a $number hours course on:",// el signo de pesos solo se pone cuando es dentro de una cadena
            fontSize = 20.sp,// tamaño de letra
            textAlign = TextAlign.Center,//poner en medio de izq a der
            modifier = modifier.fillMaxWidth()// poner en medio de izq a der
        )
        Text(
            text = course,
            fontSize = 30.sp,// tamaño de letra
            textAlign = TextAlign.Center,//poner en medio de izq a der
            modifier = modifier.fillMaxWidth()// poner en medio de izq a der
        )
        Spacer(modifier = Modifier.height(80.dp))
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = modifier.fillMaxWidth()
        ) {
            Column ( // el column es para que no se amontonen los elementos
                verticalArrangement=Arrangement.Center, //centra de arriba a abajo
                horizontalAlignment=Alignment.CenterHorizontally
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.firma_1),
                    contentDescription = "image2",
                    modifier
                        .size(50.dp)
                        .fillMaxSize()
                )
                Text(
                    text = "Juanito Perez",// el signo de pesos solo se pone cuando es dentro de una cadena
                    fontSize = 15.sp,// tamaño de letra
                )
            }
            Spacer(modifier = Modifier.size(100.dp))
            Column ( // el column es para que no se amontonen los elementos
                verticalArrangement=Arrangement.Center, //centra de arriba a abajo
                horizontalAlignment=Alignment.CenterHorizontally //centra de izq a derecha
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.firma_2),
                    contentDescription = "image2",
                    modifier
                        .size(50.dp)
                )
                Text(
                    text = "Emmet Brown",// el signo de pesos solo se pone cuando es dentro de una cadena
                    fontSize = 15.sp,// tamaño de letra
                )
            }
        }
    }
}
@Preview(showBackground = true)
@Composable
fun certificatecoursePreview() {
    Ejercicio1Theme {
        certificatecourse("Manuel Alberto Meza Gamino", number = 42, course="Robotica Avanzada")
    }
}
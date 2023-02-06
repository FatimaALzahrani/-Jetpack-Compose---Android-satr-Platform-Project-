package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //Greeting("fatima")
            Login()
        }
        }
        }

@Composable
fun Login(){
    Column( Modifier,Arrangement.Center,Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.mipmap.ic7_foreground), contentDescription = "اقرأ" ,Modifier.width(500.dp) .height(500.dp))
        val name = remember {
            mutableStateOf("")
        }
        Text(
            text = "مرحبا ${name.value}!",
            color = Color.Gray,
            fontWeight = FontWeight.Bold,
            fontSize = 40.sp
        )
        Text(text = "سعيده جدا بدخولك تطبيقي" +
                " اتمنى لك وقت ممتع ومفيد"
        , fontSize = 15.sp)
        OutlinedTextField(
            value = name.value,
            onValueChange = { name.value = it },
            label = { Text(text = "اسمك") })
        Button(onClick = { /*TODO*/ }) {
//            colors= ButtonDefaults.textButtonColors(),
//            colors.background.blue,
            Text(text = "دخول")


        }
    }
}
@Composable
fun Greeting(name: String) {
    Column(Modifier,Arrangement.SpaceBetween,Alignment.CenterHorizontally) {
        Text(
            text ="مرحبا "+name+"!",
            color = Color.Magenta,
            fontWeight = FontWeight(700),
            modifier = Modifier
                .background(Color.Gray, shape = CircleShape)
                .alpha(0.5f)
                .padding(12.dp)
        )
        Text(
            text = "Are you OK?", color = Color.Transparent, modifier = Modifier
                .background(color = Color.Black)
                .border(12.dp, Color.Red)
        )
        Button(onClick = { /*TODO*/ }) {
            Text(text = "اضغطني")
            Icon(imageVector = Icons.Filled.Add, contentDescription = "بحث")
        }
        Image(
            painter = painterResource(id = R.drawable.ic_background),
            contentDescription = "خلفيه"
        )
    }
}
package com.example.stvrry

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo()

    }
}

@Composable
fun Demo(){

    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current

        Text(
            text = "Welcome to Android",
            color = Color.Black,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )

        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
        ) {
            Text(text = "Next")
        }


        Text(text = "Entails developing and creating mobile applications for android devices.")

        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Types of cars",
            fontSize = 20.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold
            )

        Text(text = "1. BMW")
        Text(text = "2. Mercedes")
        Text(text = "3. Ferrari")
        Text(text = "4. Bugatti")

        Box (modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(Color.DarkGray)) {
                Text(text = "See more")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Programming",
            color = Color.Black,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold
        )

        Text(text = "People use programming languages when programming.That's pretty obvious.")

        Text(text = "Programming languages",
            fontSize = 30.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Black)
                .height(40.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )

        Text(text = "1. Kotlin")
        Text(text = "2. Python")
        Text(text = "3. PHP")
        Text(text = "4. Java")

        Spacer(modifier = Modifier.height(20.dp))
        Divider()

        //Centering an image
        Box (modifier = Modifier.fillMaxWidth(),
             contentAlignment = Alignment.Center){
            Image(painter = painterResource(id = R.drawable.av),
                contentDescription = "afar",
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .size(175.dp),
                contentScale = ContentScale.Crop
            )
        }

        Text(text = "eMobilis Mobile Training Institute",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
                         mContext.startActivity(Intent(mContext,Layoutactivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Continue")
        }



    }


}

@Preview(showBackground = true)
@Composable
fun DemoPreview(){
    Demo()
}


}
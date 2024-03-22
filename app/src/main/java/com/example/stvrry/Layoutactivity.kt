package com.example.stvrry

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Layout(){
    Column(modifier = Modifier.fillMaxSize()) {

        val mContext = LocalContext.current
        //----TopAppBar----
        TopAppBar(title = { Text(text = "Home",
            color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Black),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                }) {
                    Icon(imageVector = Icons.Default.ArrowBack,
                        contentDescription = "arrowback",
                        tint = Color.White)
                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share,
                        contentDescription ="share",
                        tint = Color.White)
                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings,
                        contentDescription ="settings",
                        tint = Color.White)
                }
            }
        )
        //---END OF TOPAPPBAR---

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "BREED OF DOGS",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        //first row
        Row {
            Image(painter = painterResource(id = R.drawable.doggg),
                contentDescription = "doggg",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(
                    text = "Bull Dog",
                    fontSize = 20.sp,)
                Text(text = "Bull dog is an amazing dog")
            }
        }
        //End of row one


        Spacer(modifier = Modifier.height(5.dp))



        //second row
        Row {
            Image(painter = painterResource(id = R.drawable.doggy),
                contentDescription = "doggy",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(
                    text = "German shepherd",
                    fontSize = 18.sp,)
                Text(text = "German shepherd is an amazing dog")
            }
        }

        //Third row
        Row {
            Image(painter = painterResource(id = R.drawable.dogg),
                contentDescription = "dogg",
                modifier = Modifier.size(width = 200.dp, height = 200.dp))

            Spacer(modifier = Modifier.width(20.dp))

            Column {
                Text(
                    text = "Retrievor",
                    fontSize = 18.sp,)
                Text(text = "Retrievor is an amazing dog")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            mContext.startActivity(Intent(mContext,IntentActivity::class.java))
        },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {
            Text(text = "Next")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun Layoutpreview(){
    Layout()
}
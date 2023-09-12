package com.example.business_card_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.business_card_app.ui.theme.Business_Card_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Business_Card_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun BusinessCard() {
    Column(Modifier
        .weight(1f)
        .padding(2.dp),

    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally,) {
        TopHalf()

    }
}



@Composable
fun TopHalf(){
    val androidLem = painterResource(R.drawable.android_logo)
    Column (Modifier.fillMaxSize()

    ) {

        Column(
            Modifier
                .weight(1f)
                .padding(2.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {


            Image(
                painter = androidLem,
                contentDescription = null,
                modifier = Modifier
                    .weight(1f)
                    .padding(
                        start = 6.dp,
                        end = 6.dp,
                        top = 100.dp,
                        bottom = 6.dp
                    )
            )

            Text(
                text = "Edward Lalhmingmuana",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(3.dp),
                textAlign = TextAlign.Justify,
            )

            Text(
                text = "Android Developer ",
                fontWeight = FontWeight.Bold,
                fontSize = 40.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(3.dp),
                textAlign = TextAlign.Justify,
            )
        }
    }

}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    Business_Card_AppTheme {
        BusinessCard()
    }
}
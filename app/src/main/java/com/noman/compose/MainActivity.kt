package com.noman.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.noman.compose.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Column(Modifier.background(Color.LightGray)) {
        Text(
            text = "Hello $name!",
            textAlign = TextAlign.Center,
            color = Color.Blue,
            modifier = Modifier
                .background(Color.Green)
                .padding(10.dp)
                .background(Color.Red)
        )
        Text(
            text = "My $name!",
            textAlign = TextAlign.Center,
            color = Color.Blue,
            modifier = Modifier
                .background(Color.Green)
                .padding(10.dp)
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTheme {
        Greeting("Android")
    }
}
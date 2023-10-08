package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Greeting("Android")
                    Card()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun Social(modifier: Modifier = Modifier){
//    val image = painterResource(id = R.drawable.)
    Column (horizontalAlignment = Alignment.CenterHorizontally){
        Row (Modifier.padding(5.dp)){
            Icon(Icons.Rounded.Phone, contentDescription = null)
            Text(text = "+62=813-9849-3108")
        }
        Row (Modifier.padding(5.dp)){
            Icon(Icons.Rounded.Email, contentDescription = null)
            Text(text = "+62=813-9849-3108")
        }
        Row (Modifier.padding(5.dp)){
            Icon(Icons.Rounded.Favorite, contentDescription = null)
            Text(text = "staniswinata.com")
        }
    }
}

@Composable
fun Card(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.___25_)
    Column (verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
        Image(painter = image, contentDescription = null)
        Text(text = "Stephanie Staniswinata", fontWeight = FontWeight.Bold)
        Text(text = "Binus University International")
        Text(text = "Computer Science")
    }
    Social()
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
//        Greeting("Android")
        Card()
    }
}
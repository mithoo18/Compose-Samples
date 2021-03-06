package com.example.composesample1

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    loadUI()
                }
            }
        }
    }

    @Preview
    @Composable
    fun loadUI() {
        Column(modifier = Modifier.padding(5.dp))
        {
            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .shadow(5.dp)
            )
            {
                Image(
                    painter = painterResource(id = R.drawable.img1),
                    contentDescription = null
                )

                Text(
                    text = "First Image",
                    modifier = Modifier.padding(5.dp),
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .shadow(5.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img2),
                    contentDescription = null
                )

                Text(
                    text = "Second Image",
                    modifier = Modifier.padding(5.dp),
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }

            Card(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
                    .shadow(5.dp)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img3),
                    contentDescription = null
                )

                Text(
                    text = "Second Image",
                    modifier = Modifier.padding(5.dp),
                    color = Color.Black,
                    fontSize = 20.sp
                )
            }
        }
    }
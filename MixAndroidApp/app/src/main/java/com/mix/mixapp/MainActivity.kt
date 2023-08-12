package com.mix.mixapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.content.ContextCompat.startActivity
import com.mix.mixapp.ui.theme.MixAndroidAppTheme
import io.flutter.embedding.android.FlutterActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MixAndroidAppTheme {
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
    val context = LocalContext.current
    Column {
        Button(onClick = {
            startActivity(context, FlutterActivity.createDefaultIntent(context), null)
        }) {
            Text(text = "跳转至Flutter页面")
        }
        Button(onClick = {
            startActivity(context, Intent(context, MixReactNativeActivity::class.java), null)
        }) {
            Text(text = "跳转至ReactNative页面")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MixAndroidAppTheme {
        Greeting("Android")
    }
}
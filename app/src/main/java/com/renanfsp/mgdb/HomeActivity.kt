package com.renanfsp.mgdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.renanfsp.mgdb.ui.theme.MyGamesDatabaseTheme

class HomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {  }
    }
}

@Composable
fun Home() {
    Column {

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewHome() {
    MyGamesDatabaseTheme {
        Home()
    }
}
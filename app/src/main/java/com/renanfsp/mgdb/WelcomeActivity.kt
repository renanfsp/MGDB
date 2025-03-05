package com.renanfsp.mgdb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class WelcomeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {  }
    }
}

@Composable
fun Welcome(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(46.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Acompanhe os jogos que você jogou. Salve aqueles que quer jogar. Diga aos seus amigos o que é bom.")
        Button(onClick = {
            navController.navigate("register")
        }) { Text(text = "Comece agora — é grátis!") }
        Text(text = "A rede social para quem ama video games")
    }
}

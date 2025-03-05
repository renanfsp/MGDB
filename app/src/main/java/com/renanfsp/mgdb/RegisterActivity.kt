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
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {  }
    }
}

val isValidUsername: (String) -> Boolean = { false }
val storeUser: (String) -> Unit = {}

@Composable
fun Register(navController: NavController) {
    val usernameState = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(46.dp, Alignment.CenterVertically),
        horizontalAlignment = Arrangement.
    ) {
        TextField(
            value = usernameState.value,
            onValueChange = { usernameState.value = it },
            label = { Text(text = "Usuário") },
            supportingText = { Text(text = "Escolha seu nome de usuário") },
            modifier = Modifier.fillMaxWidth()
        )
        Button(onClick = {
            if(isValidUsername("Roberto")) {
                storeUser(usernameState.value)
                navController.navigate("home") { popUpTo(0) }
            }
        }) { Text(text = "Avançar") }
    }
}

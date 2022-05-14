package com.example.intent.ui.theme.screens

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.intent.navigation.ScreenRoutes

@Composable
fun ProfileScreen(
    navController: NavController
){
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "PROFILE")
        Icon(imageVector = Icons.Filled.Person,
            contentDescription = "Profile",
            Modifier.size(40.dp)
                .clickable { Toast.makeText(context,"CLICKED",Toast.LENGTH_SHORT).show() })
        Button(onClick = { navController.navigate(ScreenRoutes.Settings.route) }) {
            Text(text = "Go to Settings")
        }
    }
}
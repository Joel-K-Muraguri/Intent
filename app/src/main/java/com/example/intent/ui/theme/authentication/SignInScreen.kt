package com.example.intent.ui.theme.authentication

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.intent.navigation.ScreenRoutes

@Composable
fun SignInScreen(
    navController: NavHostController
){
    var name by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "SIGN IN",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = name,
            onValueChange = {name = it},
            shape = RoundedCornerShape(20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))
        OutlinedTextField(
            value = password,
            onValueChange = {name = it},
            shape = RoundedCornerShape(20.dp)         
        )
        Spacer(modifier = Modifier.height(5.dp))
        Button(onClick = { navController.navigate(ScreenRoutes.Home.route) }) {
            Text(text = "SIGN IN")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInScreenPreview(){
    val navController = rememberNavController()
    SignInScreen(navController = navController)
}
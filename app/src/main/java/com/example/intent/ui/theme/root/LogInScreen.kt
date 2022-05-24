package com.example.intent.ui.theme.root

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.intent.navigation.ScreenRoutes

@Composable
fun LogInScreen(
    navController: NavHostController
){
    var name by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column() {
        Text(
            text = "LOG IN",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Red
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
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {navController.navigate(ScreenRoutes.SignIn.route) }) {
            Text(text = "LOG IN")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogInScreenPreview(){
    val navController = rememberNavController()
    LogInScreen(navController = navController)
}
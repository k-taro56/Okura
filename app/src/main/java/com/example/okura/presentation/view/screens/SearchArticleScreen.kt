package com.example.okura.presentation.view.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun SearchArticleScreen(
    navController: NavController,
    modifier: Modifier = Modifier,
) {
    Scaffold(modifier = modifier) {
            paddingValues ->
        Text(
            text = "SearchArticlesScreen",
            modifier = Modifier.padding(paddingValues),
        )
    }
}

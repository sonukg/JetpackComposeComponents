package com.sonukg97.jetpackcomposecomponents.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sonukg97.jetpackcomposecomponents.ui.theme.JetpackComposeComponentsTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBarExample() {


    TopAppBar(
        title = { Text("TopAppBar") },
        modifier = Modifier.fillMaxWidth(),
        navigationIcon = {
            Icon(Icons.Default.Menu, contentDescription = null)
            // Navigation icon
        },
        actions = {
            // Actions
        },
    )


}

@Preview(showBackground = true)
@Composable
fun PreviewTopAppBarExample() {
    JetpackComposeComponentsTheme {
        TopAppBarExample()
    }
}
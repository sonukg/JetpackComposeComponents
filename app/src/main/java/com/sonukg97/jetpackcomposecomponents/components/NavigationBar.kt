package com.sonukg97.jetpackcomposecomponents.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.List
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.sonukg97.jetpackcomposecomponents.ui.theme.JetpackComposeComponentsTheme

@Composable
fun NavigationBarExample(){
    var selectedItem by remember { mutableIntStateOf(0) }
    val items = listOf("Home","Add","Tasks","About")
    val selectedIcons = listOf(Icons.Filled.Home,Icons.Filled.Add,Icons.Filled.List,Icons.Filled.Info)
    val unSelectedIcons = listOf(Icons.Outlined.Home,Icons.Outlined.Add,Icons.Outlined.List,Icons.Outlined.Info)
    NavigationBar { items.forEachIndexed { index, item ->
        NavigationRailItem(
            label = { Text(item) },
            selected = selectedItem == index,
            onClick = { selectedItem = index},
            icon = {
                Icon(if (selectedItem == index) selectedIcons[index] else unSelectedIcons[index], contentDescription = item)
            }

        )
    } }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeComponentsTheme {
        NavigationBarExample()
    }
}
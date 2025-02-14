package com.sonukg97.jetpackcomposecomponents.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TextComp(modifier: Modifier=Modifier){
    Text(text = "Hi this is example of text",
        color = Color.Blue,
        fontSize = MaterialTheme.typography.titleLarge.fontSize,
        fontStyle = FontStyle.Italic,
        fontFamily = FontFamily.SansSerif,
        textAlign = TextAlign.Center,
        modifier =Modifier.padding(10.dp),
        textDecoration = TextDecoration.combine(
            listOf(
                TextDecoration.Underline,
                TextDecoration.LineThrough
            )
        )
    )
}

@Composable
@Preview
fun TextCompPreview(){
    TextComp()
}
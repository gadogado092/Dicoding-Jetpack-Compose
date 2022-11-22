package com.example.dicodingjetpackcompose

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dicodingjetpackcompose.ui.theme.DicodingJetpackComposeTheme

@Composable
fun JetHeroesApp(
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
    }
}

@Preview(showBackground = true)
@Composable
fun JetHeroesAppPreview() {
    DicodingJetpackComposeTheme() {
        JetHeroesApp()
    }
}
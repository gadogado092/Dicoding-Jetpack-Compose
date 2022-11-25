package com.example.dicodingjetpackcompose

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.dicodingjetpackcompose.ui.theme.DicodingJetpackComposeTheme

@Composable
fun JetRewardApp(
    modifier: Modifier = Modifier,
) {

}

@Preview(showBackground = true)
@Composable
fun JetHeroesAppPreview() {
    DicodingJetpackComposeTheme {
        JetRewardApp()
    }
}
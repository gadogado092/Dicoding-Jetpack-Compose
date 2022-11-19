package com.example.dicodingjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dicodingjetpackcompose.model.Menu
import com.example.dicodingjetpackcompose.model.dummyBestSellerMenu
import com.example.dicodingjetpackcompose.model.dummyCategory
import com.example.dicodingjetpackcompose.model.dummyMenu
import com.example.dicodingjetpackcompose.ui.components.CategoryItem
import com.example.dicodingjetpackcompose.ui.components.MenuItem
import com.example.dicodingjetpackcompose.ui.components.SearchBar
import com.example.dicodingjetpackcompose.ui.components.SectionText
import com.example.dicodingjetpackcompose.ui.theme.DicodingJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DicodingJetpackComposeTheme {
                JetCoffeeApp()
            }
        }
    }
}

@Composable
fun JetCoffeeApp() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Banner()
        SectionText(stringResource(R.string.section_category))
        CategoryRow()
        SectionText(stringResource(R.string.section_favorite_menu))
        MenuRow(dummyMenu)
        SectionText(stringResource(R.string.section_best_seller_menu))
        MenuRow(dummyBestSellerMenu)
    }
}

@Composable
fun Banner(
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
        Image(
            painter = painterResource(R.drawable.banner),
            contentDescription = "Banner Image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.height(160.dp)
        )
        SearchBar()
    }
}

@Composable
fun CategoryRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(dummyCategory, key = { it.textCategory }) { category ->
            CategoryItem(category)
        }
    }
}

@Composable
fun MenuRow(
    listMenu: List<Menu>,
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(listMenu, key = { it.title }) { menu ->
            MenuItem(menu)
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun CategoryRowPreview() {
//    DicodingJetpackComposeTheme {
//        CategoryRow()
//    }
//}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    DicodingJetpackComposeTheme {
        JetCoffeeApp()
    }
}
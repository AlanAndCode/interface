package dio.me.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dio.me.presentation.theme.SantanderDevWeekTheme
import dio.me.presentation.theme.Spacing_2
import dio.me.presentation.theme.Spacing_4


@Composable
fun Header(
    modifier: Modifier = Modifier,
    name: String = " ",
    agency: String= " ",
    number: String = ""

)  {
    Box(modifier = modifier
        .fillMaxWidth()
        .height(143.dp)
        .background(color = MaterialTheme.colorScheme.primary)  ){
        Column(modifier = Modifier.padding(
            horizontal = Spacing_2,
            vertical = Spacing_4
        ) ){
            Text(text = "Olá, $name",
            color = Color.White
            )
            Text(text = "Ag, $name Cc $number",
                color = Color.White
            )
        }
    }
}

@Preview
@Composable
fun HeaderPreview(){
    SantanderDevWeekTheme {
        Header(name = "Alan Modesto", agency = "0000", number = "0000")
    }
}
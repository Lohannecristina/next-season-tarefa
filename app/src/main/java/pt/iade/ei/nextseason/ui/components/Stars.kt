package pt.iade.ei.nextseason.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import pt.iade.ei.nextseason.R
import pt.iade.ei.nextseason.test.contentItemListExample

@Composable
fun Stars(
    rating: Float,
    size: Dp = 24.dp
) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        for (i in 1..5) {
            Image(
                painter = painterResource(
                    if (i <= rating.toInt())
                        R.drawable.star_filled
                    else
                        R.drawable.star
                ),
                contentDescription = "$rating stars",
                modifier = Modifier.size(size)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StarsPreview() {
    Stars(
        contentItemListExample()[0].reviews[0].rating.toFloat()
    )
}
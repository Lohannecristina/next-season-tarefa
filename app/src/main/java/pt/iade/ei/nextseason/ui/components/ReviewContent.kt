package pt.iade.ei.nextseason.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import pt.iade.ei.nextseason.R
import pt.iade.ei.nextseason.models.Review
import pt.iade.ei.nextseason.test.contentItemListExample

@Composable
fun ReviewContent(review: Review)
{
    HorizontalDivider(
        thickness = 1.dp,
    )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {

            Row {
                Image(
                    painter = painterResource(R.drawable.profile_picture),
                    contentDescription = "User profile picture",
                    modifier = Modifier
                        .size(70.dp)
                        .padding(end = 8.dp)
                )
                Column {
                    Text(
                        text = review.user.name,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold
                    )
                    Stars(rating = review.rating.toFloat(), 18.dp)



                    Text(
                        modifier = Modifier.padding(top = 2.dp),
                        text = review.comment
                    )
                }
            }

        }
    }


@Preview(showBackground = true)
@Composable
fun ReviewContentPreview() {
    ReviewContent(
        review = contentItemListExample()[0].reviews[0]
    )
}

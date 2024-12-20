package pt.iade.ei.nextseason.ui.components

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.SubcomposeAsyncImage
import pt.iade.ei.nextseason.ContentDetailActivity
import pt.iade.ei.nextseason.models.ContentItem
import pt.iade.ei.nextseason.test.contentItemListExample

@Composable
fun RatedContentListItem(
    item: ContentItem
) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(
                vertical = 10.dp,
                horizontal = 5.dp
            )
            .fillMaxWidth(),
        onClick = {
            val intent = Intent(context, ContentDetailActivity::class.java)
            intent.putExtra("item", item)
            context.startActivity(intent)
        }
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(10.dp)
        ) {
            ContentVote(item)

            SubcomposeAsyncImage(
                modifier = Modifier
                    .height(100.dp)
                    .aspectRatio(2f / 3f)
                    .clip(MaterialTheme.shapes.extraSmall),
                model = item.banner,
                contentDescription = "Banner of ${item.title}",
                contentScale = ContentScale.Crop,
                loading = {
                    Box(
                        modifier = Modifier.background(Color.LightGray),
                        contentAlignment = Alignment.Center
                    ){
                        CircularProgressIndicator(
                            color = MaterialTheme.colorScheme.primary
                        )
                    }
                },
                error = {
                    Box(
                        modifier = Modifier.background(Color.Red),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = "Error",
                            color = Color.White
                        )
                    }
                }
            )

            Column(
                modifier = Modifier.padding(
                    start = 10.dp
                )
            ) {
                Text(
                    text = item.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = item.description,
                    maxLines = 2,
                    minLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                ReviewStars(item)
            }
        }
    }
}

@Preview()
@Composable
fun RatedContentListItemPreview() {
    RatedContentListItem(
        contentItemListExample()[0]
    )
}
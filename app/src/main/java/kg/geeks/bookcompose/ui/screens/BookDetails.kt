package kg.geeks.bookcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import kg.geeks.bookcompose.ui.components.Novel

@Composable
fun BookDetails(novel: Novel, goBack: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AsyncImage(
            model = novel.imageUrl,
            contentDescription = "Обложка книги",
            modifier = Modifier
                .size(200.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier
            .height(16.dp))

        Text(
            text = novel.title,
            style = MaterialTheme.typography.headlineLarge
        )
        Text(
            text = "Автор: ${novel.writer}",
            style = MaterialTheme.typography.bodyLarge
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Text(
            text = novel.summary,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Justify
        )

        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = goBack) {
            Text("Назад к списку")
        }
    }
}
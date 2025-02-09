package kg.geeks.bookcompose.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GenreSelection(genres: List<String>, currentGenre: String, onSelect: (String) -> Unit) {
    LazyRow {
        items(genres) { genre ->
            Text(
                text = genre,
                modifier = Modifier
                    .padding(horizontal = 6.dp)
                    .clickable { onSelect(genre) },
                style = MaterialTheme.typography.bodyMedium
            )
        }
    }
}
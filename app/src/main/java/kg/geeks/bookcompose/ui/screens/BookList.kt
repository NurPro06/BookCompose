package kg.geeks.bookcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.geeks.bookcompose.ui.components.GenreSelection
import kg.geeks.bookcompose.ui.components.LibraryStorage
import kg.geeks.bookcompose.ui.components.Novel
import kg.geeks.bookcompose.ui.components.NovelItem
import kg.geeks.bookcompose.ui.components.SearchField

@Composable
fun BookList(onBookSelect: (Novel) -> Unit) {
    var searchQuery by remember { mutableStateOf("") }
    var selectedGenre by remember { mutableStateOf("Все") }

    val displayedBooks = LibraryStorage.novels.filter { book ->
        (selectedGenre == "Все" || book.genre == selectedGenre) &&
                (searchQuery.isBlank() || book.title.contains(searchQuery, ignoreCase = true) ||
                        book.writer.contains(searchQuery, ignoreCase = true))
    }

    Column(modifier = Modifier.fillMaxSize().padding(16.dp)) {
        SearchField(searchQuery) { searchQuery = it }
        Spacer(modifier = Modifier.height(8.dp))
        GenreSelection(LibraryStorage.genres, selectedGenre) { selectedGenre = it }
        Spacer(modifier = Modifier.height(8.dp))

        LazyColumn {
            items(displayedBooks) { book ->
                NovelItem(book, onClick = { onBookSelect(book) })
            }
        }
    }
}
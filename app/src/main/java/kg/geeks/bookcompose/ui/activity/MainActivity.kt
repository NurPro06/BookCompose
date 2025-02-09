package kg.geeks.bookcompose.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import kg.geeks.bookcompose.ui.components.Novel
import kg.geeks.bookcompose.ui.screens.BookDetails
import kg.geeks.bookcompose.ui.screens.BookList

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var selectedBook by remember { mutableStateOf<Novel?>(null) }

            if (selectedBook == null) {
                BookList { book -> selectedBook = book }
            } else {
                BookDetails(novel = selectedBook!!) { selectedBook = null }
            }
        }
    }
}
    
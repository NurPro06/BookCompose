package kg.geeks.bookcompose.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kg.geeks.bookcompose.ui.components.Novel

@Composable
fun BookDetails(novel: Novel, goBack: () -> Unit) {
    Column(
        modifier = Modifier.fillMaxSize().padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = novel.title, style = MaterialTheme.typography.headlineLarge)
        Text(text = "Автор: ${novel.writer}", style = MaterialTheme.typography.bodyLarge)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = novel.summary, style = MaterialTheme.typography.bodyMedium)
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = goBack) {
            Text("Назад к списку")
        }
    }
}
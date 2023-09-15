package id.utdi.composetutorialtopik1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import id.utdi.composetutorialtopik1.ui.theme.ComposeTutorialTopik1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Menetapkan tampilan konten utama aplikasi menggunakan Composable function MessageCard
        setContent {
            MessageCard("Android")
        }
    }
}

// Composable function untuk menampilkan teks pesan
@Composable
fun MessageCard(name: String) {
    // Menampilkan teks "Hello [nama]!" menggunakan komponen Text
    Text(text = "Hello $name!")
}

// Composable function untuk preview tampilan MessageCard
@Preview
@Composable
fun PreviewMessageCard() {
    // Menampilkan preview MessageCard dengan nama "Android"
    MessageCard("Android")
}

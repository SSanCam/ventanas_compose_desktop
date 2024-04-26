import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val windowState = rememberWindowState(size = DpSize(800.dp, 1200.dp))
    val icon = BitmapPainter(useResource("rubberduck.png", ::loadImageBitmap))

    var showMainWindow by remember { mutableStateOf(true) } // Es la primera visible.
    var showSecondWindow by remember { mutableStateOf(false) } // Mientras, la segunda está cerrada.


    if (showMainWindow) {
        MainWindow(icon = icon, state = windowState, onClose = { showMainWindow = false }, onClick = {
            showMainWindow = false
            showSecondWindow = true
        })
    } else if (showSecondWindow) {
        SecondWindow(icon = icon, state = windowState, onClose = { showSecondWindow = false }, onClick = {
            showSecondWindow = false
            showMainWindow = true
        })
    } else {
        exitApplication()
    }
}

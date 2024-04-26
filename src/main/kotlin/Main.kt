import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.res.loadImageBitmap
import androidx.compose.ui.res.useResource
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {

    val icon = BitmapPainter(useResource("rubberduck.png", ::loadImageBitmap))
    val mainWindowState = rememberWindowState()

    var showMainWindow by remember { mutableStateOf(true) } // Es la primera visible.

    Window(
        onCloseRequest = ::exitApplication,
        title = "Ventanas",
        icon = icon,
        state = if (showMainWindow) mainWindowState else WindowState()
    ) {
        if (showMainWindow) {
            MainWindow(icon) {
                showMainWindow = false
            }
        } else {
            SecondWindow(icon){
                showMainWindow = true
            }
        }
    }
}

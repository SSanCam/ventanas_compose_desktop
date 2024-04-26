import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview
fun MainWindow(icon: BitmapPainter, onClose: () -> Unit) {
    MaterialTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxSize()
        ) {
            Text(
                text = "Main Window",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 30.sp,
                modifier = Modifier
                    .border(BorderStroke(2.dp, Color.Black))
                    .background(Color.LightGray)
                    .padding(20.dp)
            )
            Spacer(modifier = Modifier.height(100.dp))
            Button(onClick = onClose) {
                Text("Open Second Window")
            }
        }
    }
}


@Composable
@Preview
fun SecondWindow(icon: BitmapPainter, onClose: () -> Unit) {
    MaterialTheme {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "Secondary Window",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 30.sp,
                    modifier = Modifier
                        .border(BorderStroke(2.dp, Color.Black))
                        .background(Color.DarkGray)
                        .padding(20.dp)
                )
                Spacer(modifier = Modifier.height(100.dp))
                Button(onClick = onClose) {
                    Text("Open Main Window")
                }
            }
        }
    }



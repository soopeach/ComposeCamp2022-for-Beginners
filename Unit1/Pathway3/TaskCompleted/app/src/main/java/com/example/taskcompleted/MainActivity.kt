package com.example.taskcompleted

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskcompleted.ui.theme.TaskCompletedTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskCompletedTheme() {
                TaskCompletedScreen()
            }
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        StateIcon()
        Text(
            text = stringResource(R.string.text_task_state),
            fontSize = 24.sp,
            modifier = Modifier.padding(top = 24.dp, bottom = 8.dp)
        )
        Text(
            text = stringResource(R.string.text_notification),
            fontSize = 16.sp
        )
    }
}

@Composable
fun StateIcon() {
    val image = painterResource(id = R.drawable.ic_task_completed)

    Image(
        painter =
        image,
        contentDescription = "taskStateImage"
    )
}

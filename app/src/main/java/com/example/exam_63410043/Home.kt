package com.example.exam_63410043

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Home(navController: NavController) {
    val dummyData = arrayOf(
        "63410040 WATTANACHAI MANEEKHAM",
        "63410043 CHETHAMAS PHAICHAN",
        "63410075 KASIPAT JANSOON",
        "63410077 SUTANAI WANMAHACHAI",
        "63410154 PUNYARIT KLAPHACHON",
        "63410156 RATCHAPHUMPHOUG PHONTHAI"
    )

    Column(modifier = Modifier
        .padding(10.dp)
        ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            for (item in dummyData) {
                val context = LocalContext.current
                Surface(modifier = Modifier
                    .clickable { Toast.makeText(context, item, Toast.LENGTH_SHORT).show();
                        navController.navigate("Detail")  }
                    .padding(10.dp),
                    shape = RoundedCornerShape(8.dp),
                    elevation = 8.dp
                )
                {
                    Column(
                        modifier = Modifier
                            .padding(10.dp)
                    ) {
                        Text(item)
                    }
                }
            }
        }
    }
}


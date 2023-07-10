package com.example.learningjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.ui.Modifier
import com.example.lazyrow.R
import com.example.lazyrow.ui.theme.Gray100


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Gray100)
            ) {
                itemsIndexed(
                    listOf(
                        ItemRowModel(R.drawable.kit1, "Китя 1"),
                        ItemRowModel(R.drawable.kit2, "Китя 2"),
                        ItemRowModel(R.drawable.kit3, "Китя 3"),
                        ItemRowModel(R.drawable.kit4, "Китя 4"),
                        ItemRowModel(R.drawable.kit5, "Китя 5"),
                        ItemRowModel(R.drawable.kit6, "Китя 6"),
                        ItemRowModel(R.drawable.kit7, "Китя 7"),
                        ItemRowModel(R.drawable.kit8, "Китя 8"),
                        ItemRowModel(R.drawable.kit9, "Китя 9")

                    )
                ) { _, item ->
                    ItemRow(item = item)
                }

            }

        }

    }
}
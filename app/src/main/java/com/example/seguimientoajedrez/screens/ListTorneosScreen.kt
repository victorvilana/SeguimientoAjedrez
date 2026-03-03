package com.example.seguimientoajedrez.screens

import androidx.collection.mutableFloatListOf
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.seguimientoajedrez.models.TorneosLocal

@Composable
fun ListTorneos() {
    val ListaTorneosLocales = listOf(
        TorneosLocal.TorneoLocal1,
        TorneosLocal.TorneoLocal2,
        TorneosLocal.TorneoLocal3
    )

    LazyColumn(modifier = Modifier.padding(vertical = 16.dp)) {
        items(ListaTorneosLocales) { item ->
            ListTorneosRow(item)
            HorizontalDivider(Modifier, DividerDefaults.Thickness, DividerDefaults.color)

        }
    }

}
    @Composable
    fun ListTorneosRow(item: TorneosLocal) {
        var MasInfo = remember { mutableStateOf(false) }

        Column(
            modifier = Modifier.padding(8.dp)
                .animateContentSize(
                    animationSpec = tween(
                        durationMillis = 300,
                        delayMillis = 0,
                        LinearEasing
                    )
                )
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
               // modifier = Modifier
                 //   .padding(8.dp)
            ) {
                item.Nombre?.let {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.titleMedium,
                        modifier = Modifier
                            .weight(1f)
                    )
                    IconButton(onClick = { MasInfo.value = !MasInfo.value }) {
                        Icon(
                            if (MasInfo.value) Icons.Default.Remove
                            else Icons.Default.Add,
                            contentDescription = "Más información"
                        )
                    }

                }
            }

            Column() {
                if (MasInfo.value) {
                    Row  {
                        item.Ciudad?.let { Text(text = "Ciudad: $it", fontSize = 14.sp) }
                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Row {
                        item.Sede?.let { Text(text = "Sede: $it", fontSize = 14.sp) }
                    }
                    Spacer(modifier = Modifier.padding(8.dp))
                    Row {
                        item.FechaDesde?.let { Text(text = "Desde: $it", fontSize = 14.sp) }
                    }
                }
            }
        }
    }



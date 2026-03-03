package com.example.seguimientoajedrez.models

import java.sql.Date
import java.text.SimpleDateFormat
import java.time.LocalDate

sealed class TorneosLocal(

    var Image: Int?,
    var Nombre: String?,
    var FechaDesde: LocalDate?,
    var FechaHasta: LocalDate?,
    var Provincia: String?,
    var Ciudad: String?,
    var Sede: String?,
    var Tipo: String?,
    var Modalidad: String?


    ) {
    object TorneoLocal1 : TorneosLocal(
        null,
        "CIRCUITO DE AJEDREZ PICHINCHA - OCTAVA PARADA U11",
        LocalDate.of(2025, 12,  10),
        LocalDate.of(2025, 12, 10),
        "Pichincha",
        "Quito",
        "Coliseo Rumiñahui",
        "Presencial",
        "Standar"

        )

    object TorneoLocal2 : TorneosLocal(
        null,
        "CIRCUITO DE AJEDREZ PICHINCHA - SÉPTIMA PARADA U11",
        LocalDate.of(2025, 12,  10),
        LocalDate.of(2025, 12, 10),
        "Pichincha",
        "Quito",
        "Coliseo Rumiñahui",
        "Presencial",
        "Standar"
    )

    object TorneoLocal3 : TorneosLocal(
        null,
        "CIRCUITO DE AJEDREZ PICHINCHA - SEXTA PARADA U11",
        LocalDate.of(2025, 12,  10),
        LocalDate.of(2025, 12, 10),
        "Pichincha",
        "Quito",
        "Coliseo Rumiñahui",
        "Presencial",
        "Standar"
    )

}
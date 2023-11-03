package com.example.aluvery.model

import androidx.annotation.DrawableRes
import com.example.aluvery.R
import java.math.BigDecimal

class Product(
    val name: String,
    val price: BigDecimal,
    val image: String? = null
)
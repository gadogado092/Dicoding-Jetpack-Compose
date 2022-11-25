package com.example.dicodingjetpackcompose.ui.screen.cart

import com.example.dicodingjetpackcompose.model.OrderReward

data class CartState(
    val orderReward: List<OrderReward>,
    val totalRequiredPoint: Int
)
package com.example.dessertclicker.ui

import com.example.dessertclicker.data.Datasource.dessertList

// this is the state required by the dessert clicker app
data class DessertClickerState(
    var revenue: Int = 0,
    var dessertsSold: Int = 0,
    var currentDessertIndex: Int = 0,
    var currentDessertPrice: Int = dessertList[currentDessertIndex].price,
    var currentDessertImageId: Int = dessertList[currentDessertIndex].imageId,
)

package com.example.dessertclicker.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class DessertClickerViewModel: ViewModel() {
    private val _uiState = MutableStateFlow(dessertClickerSte)
}
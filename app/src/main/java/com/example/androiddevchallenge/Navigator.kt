package com.example.androiddevchallenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Navigator : ViewModel() {
    enum class Screen { LIST, DETAILS }
    private var _currentScreen = MutableLiveData(Screen.LIST)
    val currentScreen: LiveData<Screen> = _currentScreen

    fun navigateTo(screen: Screen) {
        _currentScreen.value = screen
    }

    fun onBack(): Boolean {
        val wasHandled = currentScreen.value != Screen.LIST
        _currentScreen.value = Screen.LIST
        return wasHandled
    }
}
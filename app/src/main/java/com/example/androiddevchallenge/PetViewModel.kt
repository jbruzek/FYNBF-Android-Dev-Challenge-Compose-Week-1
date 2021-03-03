package com.example.androiddevchallenge

import androidx.lifecycle.ViewModel

class PetViewModel: ViewModel() {
    var currentPet = 0
        private set

    fun setCurrentPet(pos: Int) {
        currentPet = pos
    }

    fun getCurrentPet() : Pet {
        return pets[currentPet]
    }
}
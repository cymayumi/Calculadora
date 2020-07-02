package com.mayumi.calculadora

import android.util.Log
import androidx.lifecycle.ViewModel

class CalculadoraViewModel : ViewModel(){
    init {
        Log.i("CalculadoraViewModel", "Criação da ViewModel da activity Calculadora!")
    }

    override fun onCleared() {
        //este método callBack é chamado um pouco antes da ViewModel ser destruída junto com a Activity ao qual está associada
        //estamos fazendo esse override só para entender a lifetime da ViewModel

        super.onCleared()
        Log.i("CalculadoraViewModel", "ViewModel da activity Calculadora Destruída!")
    }
}
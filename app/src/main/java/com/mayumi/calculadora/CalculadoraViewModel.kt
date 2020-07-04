package com.mayumi.calculadora

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculadoraViewModel : ViewModel(){

    //precisamos de uma maneira da ViewModel comunicar de volta para o UI Controller quando alguma informação for alterada.
    //LiveData is an observable data holder class that is lifecycle-aware.

     val soma = MutableLiveData<Int>()
    //"soma" estará sendo observado (LiveData), quando este objeto for modificado, nossos observadores (UI) saberão.

    init {
        Log.i("CalculadoraViewModel", "Criação da ViewModel da activity Calculadora!")
        soma.value = 0
    }

    fun somar(a:String, b:String){
        soma.value = Integer.parseInt(a) + Integer.parseInt(b)
    }

    override fun onCleared() {
        //este método callBack é chamado um pouco antes da ViewModel ser destruída junto com a Activity ao qual está associada
        //estamos fazendo esse override só para entender a lifetime da ViewModel

        super.onCleared()
        Log.i("CalculadoraViewModel", "ViewModel da activity Calculadora Destruída!")
    }
}
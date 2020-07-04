package com.mayumi.calculadora.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculadoraViewModel : ViewModel(){

    //precisamos de uma maneira da ViewModel comunicar de volta para o UI Controller quando alguma informação for alterada.
    //LiveData is an observable data holder class that is lifecycle-aware (aware of UI lifecycle state).

    private val _soma = MutableLiveData<Float>()
    val soma : LiveData<Float>
        get() = _soma
    //"_soma" estará sendo observado (LiveData), quando este objeto for modificado, nossos observadores (UI) saberão.
    //"_soma" é mutable porque está interno ao ViewModel, o "soma" é externo e está como LiveData para não ser possível alterar o valor fora da VM.

    init {
        Log.i("CalculadoraViewModel", "Criação da ViewModel da activity Calculadora!")
        _soma.value = 0f
    }

    fun somar(a:String, b:String){
        _soma.value = a.toFloat() + b.toFloat()
    }

    fun limparSoma(){
        _soma.value = 0f
    }

    override fun onCleared() {
        //este método callBack é chamado um pouco antes da ViewModel ser destruída junto com a Activity ao qual está associada
        //estamos fazendo esse override só para entender a lifetime da ViewModel

        super.onCleared()
        Log.i("CalculadoraViewModel", "ViewModel da activity Calculadora Destruída!")
    }
}
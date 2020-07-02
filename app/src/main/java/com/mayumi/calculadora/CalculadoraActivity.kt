package com.mayumi.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders

class CalculadoraActivity : AppCompatActivity() {

    private lateinit var viewModel: CalculadoraViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        Log.i("CalculadoraActivity", "Chamei o ViewModelProviders!")
        viewModel = ViewModelProviders.of(this).get(CalculadoraViewModel::class.java)


    }
}
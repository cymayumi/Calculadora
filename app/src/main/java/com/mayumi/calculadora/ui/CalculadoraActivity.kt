package com.mayumi.calculadora.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.mayumi.calculadora.R
import kotlinx.android.synthetic.main.activity_calculadora.*

class CalculadoraActivity : AppCompatActivity() {

    private lateinit var viewModel: CalculadoraViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        Log.i("CalculadoraActivity", "Chamei o ViewModelProviders!")
        viewModel = ViewModelProviders.of(this).get(CalculadoraViewModel::class.java)

        btn_calcular.setOnClickListener {
            var aNum = numA.text.toString()
            var bNum = numB.text.toString()

            viewModel.somar(aNum, bNum)
        }

        btn_limpar.setOnClickListener {
            numA.setText("")
            numB.setText("")
            viewModel.limparSoma()
        }

        //observa a "soma", caso tenha mudanças ela atualiza a UI
        viewModel.soma.observe(this, Observer {novaSoma ->
            tv_resultado.text = novaSoma.toString()
        })
    }
}
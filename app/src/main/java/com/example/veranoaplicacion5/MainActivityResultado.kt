package com.example.veranoaplicacion5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main_resultado.*

class MainActivityResultado : AppCompatActivity() {
    companion object {
        var a:Double = 0.0
        var b:Double = 0.0
        var c:Double = 0.0

        val ENTRA_A = "catetoA"
        val ENTRA_B = "catetoB"
        val ENTRA_C = "catetoC"
        private val DEFAULT_DOUBLE=-1.0
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_resultado)
        val recibir = intent
        a = recibir.getDoubleExtra(ENTRA_A, DEFAULT_DOUBLE)
        b = recibir.getDoubleExtra(ENTRA_B, DEFAULT_DOUBLE)
        c = recibir.getDoubleExtra(ENTRA_C, DEFAULT_DOUBLE)
        resA.setText("El resultado de A es :" +a.toString())
        resB.setText("El resultado de B es :" +b.toString())
        resC.setText("El resultado de C es :" +c.toString())
    }
}

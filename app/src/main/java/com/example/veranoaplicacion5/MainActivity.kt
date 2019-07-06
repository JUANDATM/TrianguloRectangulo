package com.example.veranoaplicacion5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.pow
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    var A : Double =0.0
    var B : Double =0.0
    var C : Double =0.0
    var rel : Double =0.0
    var Resultado : Double =0.0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calculaA(v : View){
        if (etB.text.isEmpty() || etC.text.isEmpty()){
            Toast.makeText(this, "Faltan Todos los Datos", Toast.LENGTH_LONG).show()
            etA.requestFocus()
        }else{
            B = etB.text.toString().toDouble()
            C =etC.text.toString().toDouble()
            rel = (pow(C,2.0) - pow(B, 2.0))
            A = sqrt(rel)
            etA.setText(A.toString())

        }
    }
    fun calculaB(v : View){
        if (etA.text.isEmpty() || etC.text.isEmpty()){
            Toast.makeText(this, "Faltan Datos", Toast.LENGTH_LONG).show()
            etA.requestFocus()
        }else {
            A = etA.text.toString().toDouble()
            C =etC.text.toString().toDouble()
            rel = (pow(C,2.0) - pow(A, 2.0))
            B = sqrt(rel)
            etB.setText(B.toString())
        }
    }
    fun calculaC(v : View){
        if (etA.text.isEmpty() || etB.text.isEmpty() ){
            Toast.makeText(this, "Faltan Todos los Datos", Toast.LENGTH_LONG).show()
            etA.requestFocus()
        }else{
            B = etB.text.toString().toDouble()
            A =etA.text.toString().toDouble()
            rel = ((A*A) + (B*B))
            C= sqrt(rel)
            etC.setText(C.toString())

        }
    }
    fun EnviarRes(v: View){
        val enviar = Intent (this,MainActivityResultado::class.java)
        enviar.putExtra(MainActivityResultado.ENTRA_A,A)
        enviar.putExtra(MainActivityResultado.ENTRA_B,B)
        enviar.putExtra(MainActivityResultado.ENTRA_C,C)
        startActivity(enviar)

    }
}

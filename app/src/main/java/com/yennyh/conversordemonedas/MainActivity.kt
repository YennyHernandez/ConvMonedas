package com.yennyh.conversordemonedas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var resultado: Double= 0.0
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        convertir_button.setOnClickListener{
            val numero = ing_valor_editTextNumber.text.toString().toDouble()
            val monedaA  = monedaactual_spinner.selectedItem.toString()
            val monedaC = moneda_a_conv_spinner.selectedItem.toString()
        if( monedaA == "Peso Colombiano"){
            if( monedaC == "Dólar") resultado = numero * 0.00026
            else if(monedaC == "Euro")resultado = numero * 0.00022
            else if(monedaC == "Libra Esterlina")resultado = numero * 0.00020
            else resultado = resultado
        }
        else if( monedaA == "Dólar"){
            if( monedaC == "Peso Colombiano") resultado = numero * 3848.32
            else if(monedaC == "Euro")resultado = numero * 0.85
            else if(monedaC == "Libra Esterlina")resultado = numero * 0.78
            else resultado = numero
        }
        else if( monedaA == "Euro"){
            if( monedaC == "Peso Colombiano") resultado = numero * 4511.38
            else if(monedaC == "Dólar")resultado = numero * 1.17
            else if(monedaC == "Libra Esterlina")resultado = numero * 0.91
            else resultado = numero
        }
        else{
            if( monedaC == "Peso Colombiano") resultado = numero * 4966.56
            else if(monedaC == "Dólar")resultado = numero * 1.29
            else if(monedaC == "Euro")resultado = numero * 1.10
            else resultado = numero
        }
        mostar_resultado_final_text_view.text = resultado.toString()


    }
    }
}
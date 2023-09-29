package com.example.tareascomponentes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.widget.TextView

class componentes2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_componentes2)

        val boton: Button = findViewById(R.id.botonAumentar)
        val boton2: Button = findViewById(R.id.botonDisminuir)
        var texto: TextView= findViewById(R.id.numero)
        boton.setOnClickListener {
            val numero= texto.text.toString().toInt()+1
            numero.toString()
            texto.text= numero.toString()
        }
        boton2.setOnClickListener{
            val numero= texto.text.toString().toInt()
            if(numero>0){
                var numero= texto.text.toString().toInt()-1
                numero.toString()
                texto.text = numero.toString()
            }
        }

        texto.setOnClickListener{
            if(texto.currentTextColor == Color.BLACK){
                texto.setTextColor(Color.RED)
            }else{
                texto.setTextColor(Color.BLACK)
            }
        }

    }
}
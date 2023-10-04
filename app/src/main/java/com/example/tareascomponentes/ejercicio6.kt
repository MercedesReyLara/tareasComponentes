package com.example.tareascomponentes

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible
import java.time.Duration
import java.util.ArrayList

class ejercicio6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio6)
        var round:RadioButton=findViewById(R.id.roundTrip)
        var oneWay:RadioButton=findViewById(R.id.oneWay)
        var historial: Button =findViewById(R.id.History)
        var desde:EditText=findViewById(R.id.desde)
        var hasta:EditText=findViewById(R.id.hasta)
        var fechaIda:EditText=findViewById(R.id.fechaVuelta)
        var fechavuelta:EditText=findViewById(R.id.fechaIda)
        var pasajeros:TextView=findViewById(R.id.textView4)
        var mas:Button=findViewById(R.id.button3)
        var menos:Button=findViewById(R.id.button2)
        var noParar:RadioButton=findViewById(R.id.NonStop)
        var unaParada:RadioButton=findViewById(R.id.OneStop)
        var masParadas:RadioButton=findViewById(R.id.orMore)
        var buscar:Button=findViewById(R.id.buscar)
        var resultados:TextView=findViewById(R.id.resumen)
        var imagen:ImageView=findViewById(R.id.imagen)
        var duracion: Int = Toast.LENGTH_SHORT
        var limite:Int=pasajeros.text.toString().toInt()
        mas.setOnClickListener {
            if(limite<19){
                limite += 1
                pasajeros.text=limite.toString()
            }else{
                var texto:String="Limite de pasajeros"
                Toast.makeText(this,texto,duracion)
            }
        }
        menos.setOnClickListener {
            if(limite>=1){
                limite -= 1
                pasajeros.text=limite.toString()
            }else{
                var texto:String="No se pueden poner menos pasajeros"
                Toast.makeText(this,texto,duracion)
            }
        }
        var resultado:String=""
        buscar.setOnClickListener{
            var tipoV:String=""
            var parar:String=""
            if(round.isChecked){
                tipoV=round.text.toString()
                round.setBackgroundColor(Color.GREEN)
            }else if(oneWay.isChecked){
                tipoV=round.text.toString()
                oneWay.setBackgroundColor(Color.GREEN)
            }
            var inicio:String=desde.text.toString()
            var destino:String=hasta.text.toString()
            var FI:String=fechaIda.text.toString()
            var FV:String=fechavuelta.text.toString()
            if(noParar.isChecked){
                parar=noParar.text.toString()
                noParar.setBackgroundColor(Color.GREEN)
            }else if(unaParada.isChecked){
                parar=unaParada.text.toString()
                unaParada.setBackgroundColor(Color.GREEN)
            }else if(masParadas.isChecked){
                parar=masParadas.text.toString()
                masParadas.setBackgroundColor(Color.GREEN)
            }
            resultado= "$tipoV, $inicio, $destino, $FI, $FV, $parar"
        }
        historial.setOnClickListener {
            resultados.text=resultado
            imagen.isVisible=true
        }
    }
}
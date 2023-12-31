package com.example.tareascomponentes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TableLayout
import android.widget.TableRow

class ejercicio5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio5)

        var fil:EditText=findViewById(R.id.filas)
        var columnas:EditText=findViewById(R.id.columnas)
        var boton: Button =findViewById(R.id.botonEnviar)

        boton.setOnClickListener{
            var numF=fil.text.toString().toInt()
            var numC=columnas.text.toString().toInt()
            val tabla:TableLayout=findViewById(R.id.tableLayout)
            tabla.removeAllViews()
         for (i in 1..numF) {
            var fila:TableRow= TableRow(this)

            for(y in 1..numC) {
                val imageView = ImageView(this)
                imageView.setImageResource(R.drawable.imagen)
                fila.addView(imageView)
            }
             tabla.addView(fila)
        }
        }
    }
}
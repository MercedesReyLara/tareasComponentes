package com.example.tareascomponentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class ejercicio3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio3)

        val contrasenaV: String = "ejerciciO3"
        val texto: TextView = findViewById(R.id.mensaje)
        val generoM: RadioButton = findViewById(R.id.masc)
        val generoF: RadioButton = findViewById(R.id.femenino)
        val generoN: RadioButton = findViewById(R.id.NODECIRLO)
        /*val radios: RadioGroup = findViewById(R.id.grupo)*/
        val nombre: EditText = findViewById(R.id.Nombre)
        val apellido: EditText = findViewById(R.id.Apellidos)
        val correo: EditText = findViewById(R.id.Correo)
        val TELF: EditText = findViewById(R.id.Tlf)
        val edad: EditText = findViewById(R.id.Edad)
        val fechaN: EditText = findViewById(R.id.FechaNacimiento)
        val direccion: EditText = findViewById(R.id.Direccion)
        val contrasena: EditText = findViewById(R.id.Contrasena)
        val deporte: CheckBox = findViewById(R.id.deporte)
        val videojuegos: CheckBox = findViewById(R.id.videojuegos)
        val enviar: Button = findViewById(R.id.enviar)

        enviar.setOnClickListener {
            if (nombre.text.isEmpty() || TELF.text.isEmpty() || correo.text.isEmpty()) {
                val mdg: String = "Hay algun campo vacio, por favor rellena todos los campos"
                texto.text = mdg
            } else if (contrasena.text.toString() != contrasenaV) {
                val mdg: String = "La contraseña no es correcta"
                texto.text = mdg
            } else if (!(correo.text.toString().endsWith("@gmail.com"))) {
                /*Quería usar una expresión regular pero es complicado*/
                val mdg: String = "El email no es correcto"
                texto.text = mdg
            } else if (!deporte.isChecked && !videojuegos.isChecked) {
                val mdg: String = "Por favor seleccione alguna afección"
                texto.text = mdg
            } else if(!generoF.isChecked&&!generoM.isChecked&&!generoN.isChecked) {
                val mdg: String = "Por favor seleccione un genero"
                texto.text = mdg
            } else {
                val n=nombre.text.toString()
                val a=apellido.text.toString()
                val c=correo.text.toString()
                val t=TELF.text.toString()
                val e=edad.text.toString()
                val f=fechaN.text.toString()
                val d=direccion.text.toString()
                val cc=contrasena.text.toString()
                var dp=""
                var v=""
                if(deporte.isChecked){
                     dp=deporte.text.toString()
                    val mdg: String = "Formulario enviado: $n,$a,$c,$t,$e,$f,$d,$cc,$dp"
                    texto.text = mdg
                }else  if(videojuegos.isChecked){
                    v=videojuegos.text.toString()
                    val mdg: String = "Formulario enviado: $n,$a,$c,$t,$e,$f,$d,$cc,$v"
                    texto.text = mdg
                }else if(videojuegos.isChecked&&deporte.isChecked){
                    v=videojuegos.text.toString()
                    dp=deporte.text.toString()
                    val mdg: String = "Formulario enviado: $n, $a, $c, $t, $e, $f, $d, $cc, $dp, $v"
                    texto.text = mdg
                }




            }
        }
    }
}
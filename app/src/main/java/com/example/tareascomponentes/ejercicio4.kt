package com.example.tareascomponentes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class ejercicio4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio4)

        val contrasenaV: String = "ejerciciO3"
        val generoM: RadioButton = findViewById(R.id.masc)
        val generoF: RadioButton = findViewById(R.id.femenino)
        val generoN: RadioButton = findViewById(R.id.NODECIRLO)
        val nombre: EditText = findViewById(R.id.Nombre)
        val correo: EditText = findViewById(R.id.Correo)
        val TELF: EditText = findViewById(R.id.Tlf)
        val contrasena: EditText = findViewById(R.id.Contrasena)
        val deporte: CheckBox = findViewById(R.id.deporte)
        val videojuegos: CheckBox = findViewById(R.id.videojuegos)
        val enviar: Button = findViewById(R.id.enviar)
        val duration = Toast.LENGTH_SHORT
        /*
        val radios: RadioGroup= findViewById(R.id.grupo)
        val apellido: EditText = findViewById(R.id.Apellidos)
        val edad: EditText = findViewById(R.id.Edad)
        val fechaN: EditText = findViewById(R.id.FechaNacimiento)
        val direccion: EditText = findViewById(R.id.Direccion)*/

        enviar.setOnClickListener {
            if (nombre.text.isEmpty() || TELF.text.isEmpty() || correo.text.isEmpty()) {
                val mdg: String = "Alguno de estos campos(Nombre,Telefono,Correo) esta vacio"
                val toast = Toast.makeText(this, mdg, duration)
                toast.show()
            } else if (!(correo.text.toString().endsWith("@gmail.com"))) {
                /*Quería usar una expresión regular pero es complicado*/
                val mdg: String = "El correo no esta en el formato correcto"
                val toast = Toast.makeText(this, mdg, duration)
                toast.show()
            } else if (contrasena.text.toString() != contrasenaV) {
                val mdg: String = "La contraseña no es correcta"
                val toast = Toast.makeText(this, mdg, duration)
                toast.show()
            } else if (!deporte.isChecked && !videojuegos.isChecked) {
                val mdg: String = "Por favor seleccione alguna afección"
                val toast = Toast.makeText(this, mdg, duration)
                toast.show()
            } else if(!generoF.isChecked&&!generoM.isChecked&&!generoN.isChecked) {
                val mdg: String = "Por favor seleccione un genero"
                val toast = Toast.makeText(this, mdg, duration)
                toast.show()
            }else{
                val mdg: String = "Formulario enviado"
                val toast = Toast.makeText(this, mdg, duration)
                toast.show()
            }
        }

    }
}
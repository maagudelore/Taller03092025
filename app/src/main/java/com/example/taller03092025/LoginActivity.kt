package com.example.taller03092025

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent


import com.example.taller03092025.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // ViewBinding para acceder a los elementos del XML
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflar el layout con binding
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Acción del botón de login
        binding.btnLogin.setOnClickListener {
            val pass = binding.etPass.text?.toString()?.trim().orEmpty()
            if (pass.isEmpty()) {
                binding.tilPass.error = "Ingresa la contraseña"
            } else {
                binding.tilPass.error = null
                // Ir al menú principal (aún no creado, lo haremos en Paso 2)
                startActivity(Intent(this, MenuActivity::class.java))
            }
        }
    }
}

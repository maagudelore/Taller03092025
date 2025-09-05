package com.example.taller03092025

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity


import android.content.Intent


import com.example.taller03092025.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.cardCalculadora.setOnClickListener {
            startActivity(Intent(this, CalculadoraActivity::class.java))
        }
        binding.cardPromedio.setOnClickListener {
            startActivity(Intent(this, PromedioActivity::class.java))
        }
        binding.cardConversor.setOnClickListener {
            startActivity(Intent(this, ConversorActivity::class.java))
        }
        binding.cardPropinas.setOnClickListener {
            startActivity(Intent(this, PropinasActivity::class.java))
        }
    }
}
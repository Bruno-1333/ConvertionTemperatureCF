package com.brunoleonardo.convertiontemperaturecf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.brunoleonardo.convertiontemperaturecf.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding // le lien entre le fichier xml et l'activité
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater) // le lien entre le fichier xml et l'activité
        setContentView(binding.root) // le lien entre le fichier xml et l'activité
    }
}
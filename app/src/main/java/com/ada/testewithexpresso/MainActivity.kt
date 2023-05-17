package com.ada.testewithexpresso

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.ada.testewithexpresso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupLayoutManager()

        val charactersList = Model(this).getCharactersList()
        binding.rvCharacters.adapter = CharactersAdapter(charactersList)
    }

    private fun setupLayoutManager() {
        binding.rvCharacters.layoutManager = LinearLayoutManager(
            this, RecyclerView.VERTICAL, false
        )
        LinearSnapHelper().attachToRecyclerView(binding.rvCharacters)
    }
}
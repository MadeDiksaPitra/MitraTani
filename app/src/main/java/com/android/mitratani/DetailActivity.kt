package com.android.mitratani

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.android.mitratani.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.ibtnBelanja.setOnClickListener {
            val intent = Intent(this, Belanja::class.java)
            startActivity(intent)
        }

        binding.ibtnTanyaahli.setOnClickListener {
            val intent = Intent(this, TanyaAhli::class.java)
            startActivity(intent)

        }
    }
}
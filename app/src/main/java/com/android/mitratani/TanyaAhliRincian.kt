package com.android.mitratani

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.mitratani.databinding.TanyaAhliRincianBinding

class TanyaAhliRincian : AppCompatActivity() {

    private lateinit var binding: TanyaAhliRincianBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TanyaAhliRincianBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.backTanyaahliRincian.setOnClickListener {
            val intent = Intent(this, TanyaAhli::class.java)
            startActivity(intent)

        }
    }
}
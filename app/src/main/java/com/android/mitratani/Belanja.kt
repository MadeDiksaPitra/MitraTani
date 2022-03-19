package com.android.mitratani

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.android.mitratani.databinding.BelanjaBinding

class Belanja : AppCompatActivity() {
    private lateinit var binding:BelanjaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BelanjaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.ibtnProduk0.setOnClickListener {
            val intent = Intent(this, BelanjaCo::class.java)
            startActivity(intent)

        }
    }
}
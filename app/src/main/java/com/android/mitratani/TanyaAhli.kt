package com.android.mitratani

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.android.mitratani.databinding.TanyaAhliBinding

class TanyaAhli : AppCompatActivity() {

    private lateinit var binding: TanyaAhliBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TanyaAhliBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.ibtnTanyaahliRincian.setOnClickListener {
            val intent = Intent(this, TanyaAhliRincian::class.java)
            startActivity(intent)
        }

        binding.ibtnBackTanyaahli.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            startActivity(intent)
        }
    }
}
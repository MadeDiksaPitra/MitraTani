package com.android.mitratani

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import com.android.mitratani.databinding.BelanjaCoBinding

class BelanjaCo : AppCompatActivity() {

    private lateinit var binding: BelanjaCoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = BelanjaCoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
    }
}
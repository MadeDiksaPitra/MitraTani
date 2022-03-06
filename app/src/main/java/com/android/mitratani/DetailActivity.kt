package com.android.mitratani

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
    }
}
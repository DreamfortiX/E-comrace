package com.example.ecomrace_app.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecomrace_app.R
import com.example.ecomrace_app.databinding.ActivityVisualSearchBinding

class Visual_search : AppCompatActivity() {
    private lateinit var binding: ActivityVisualSearchBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVisualSearchBinding.inflate(layoutInflater)
        supportActionBar!!.hide()
        setContentView(binding.root)
    }
}
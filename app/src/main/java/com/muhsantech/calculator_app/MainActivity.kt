package com.muhsantech.calculator_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhsantech.calculator_app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPlus.setOnClickListener {
            val inputTextOne = binding.edInput1.text.toString().toInt()
            val inputTextTwo = binding.edInput2.text.toString().toInt()

            val result = inputTextOne + inputTextTwo

            binding.resultTextView.text = result.toString()
        }
    }
}
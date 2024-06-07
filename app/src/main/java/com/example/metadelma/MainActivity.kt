package com.example.metadelma

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.metadelma.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{
            val pastSold : Float = binding.int1.text.toString().toFloat()
            val actualSold = binding.int2.text.toString().toFloat()

            val actualGoal : String =  (pastSold * 1.10).toFloat().toString()
            val actualDiff : String =  (actualGoal.toFloat() - actualSold).toString()
            val perSold : String = String.format("%.2f", (actualSold * 100)/actualGoal.toFloat())
            val perDiff : String = String.format("%.2f", (actualDiff.toFloat() * 100)/actualGoal.toFloat())

            binding.goal.text = "R$$actualGoal"
            binding.diff.text = "R$$actualDiff"
            binding.persold.text = "$perSold%"
            binding.perdiff.text = "$perDiff%"
        }
    }
}
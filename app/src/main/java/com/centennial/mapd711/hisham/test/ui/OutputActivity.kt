package com.centennial.mapd711.hisham.test.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.centennial.mapd711.hisham.test.databinding.ActivityMainBinding
import com.centennial.mapd711.hisham.test.databinding.ActivityOutputBinding
import com.centennial.mapd711.hisham.test.model.UserModel

class OutputActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOutputBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutputBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.user = getData()
    }

    private fun getData(): UserModel {
        return intent.getParcelableExtra("key_user")!!
    }

}
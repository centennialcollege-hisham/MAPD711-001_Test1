package com.centennial.mapd711.hisham.test.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.centennial.mapd711.hisham.test.databinding.ActivityMainBinding
import com.centennial.mapd711.hisham.test.model.ExerciseModel
import com.centennial.mapd711.hisham.test.model.UserModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {
        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, OutputActivity::class.java)
            val user = UserModel(
                binding.etName.text.toString(),
                getSelectedGender(),
                binding.etAge.text.toString().toInt(),
                binding.etWeight.text.toString().toInt(),
                binding.etHeight.text.toString().toInt(),
                getActivityLevelSelected(),
                binding.checkbox.isChecked
            )

            intent.putExtra("key_user", user)
            startActivity(intent)
        }
    }


    private fun getSelectedGender(): String {
        val radioId: Int = binding.radioGroup.checkedRadioButtonId
        return findViewById<RadioButton>(radioId).text.toString()
    }

    private fun getActivityLevelSelected(): ExerciseModel {
        val name = binding.spinner.selectedItem.toString()
        val value = when (binding.spinner.selectedItem) {
            1 -> {
                1.375
            }
            2 -> {
                1.55
            }
            3 -> {
                1.725
            }
            else -> {
                1.2
            }
        }

        return ExerciseModel(name,value)
    }


}
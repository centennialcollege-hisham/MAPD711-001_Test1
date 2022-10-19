package com.centennial.mapd711.hisham.test.model

import android.os.Parcelable
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel(
    var name: String,
    var gender: String,
    var age: Int,
    var weight: Int,
    var height: Int,
    var activityLevel: ExerciseModel,
    var isImageActive: Boolean,
) : Parcelable {


    fun getImageVisibility(): Int {
        return if (isImageActive) VISIBLE else GONE

    }


    fun getBMR(): Double {
        return when (gender) {
            "Male" -> {
                ((10) * weight) + (6.25 * height) - (5 * age) + 5
            }
            "Female" -> {
                ((10) * weight) + (6.25 * height) - (5 * age) + 161
            }

            else -> {
                0.0
            }
        }
    }

    fun getCaloriesNeeded(): Double {
        return getBMR() * activityLevel.value

    }
}

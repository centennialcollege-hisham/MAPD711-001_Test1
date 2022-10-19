package com.centennial.mapd711.hisham.test.model

import android.os.Parcelable
import android.view.View.GONE
import android.view.View.VISIBLE
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ExerciseModel(
    var name: String,
    var value: Double,
    ) : Parcelable {

}

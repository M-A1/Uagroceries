package com.arnold.uagroceries.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class GroceryItems(
        private val id: String,
        private val imgUrl: String,
        private val socialRank: Float,
        private val ingredients: Array<String>,
        private val publisher: String? = null) : Parcelable

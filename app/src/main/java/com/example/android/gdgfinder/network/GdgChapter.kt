package com.example.android.gdgfinder.network

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class GdgChapter(
    val country: String,
    val latitude: Double,
    val longitude: Double,
    val title: String,
    val url: String
) : Parcelable

@Parcelize
data class GdgResponse(
    val id: Int,
    val order: Int,
    val title: String,
    val chapters: List<GdgChapter>
) : Parcelable

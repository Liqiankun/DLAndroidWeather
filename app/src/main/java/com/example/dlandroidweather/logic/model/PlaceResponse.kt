package com.example.dlandroidweather.logic.model

import android.location.Location
import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location, @SerializedName("formatted_name") val address: String)

data class Location(val lng: String, val lat: String)

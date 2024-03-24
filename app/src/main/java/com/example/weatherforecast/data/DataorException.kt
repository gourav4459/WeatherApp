package com.example.weatherforecast.data

class DataorException <T,Boolean,E:Exception>(
    var data: T? = null,
    var loading: kotlin.Boolean? = null,
    var e: E? = null)



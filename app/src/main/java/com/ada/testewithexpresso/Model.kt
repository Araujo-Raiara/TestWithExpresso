package com.ada.testewithexpresso

import android.content.Context

class Model(private val context: Context) {
    fun getCharactersList(): Array<String> {
        return context.resources.getStringArray(R.array.theoffice_characters_array)
    }
}
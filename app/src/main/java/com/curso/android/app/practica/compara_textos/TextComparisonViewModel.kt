package com.curso.android.app.practica.compara_textos

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextComparisonViewModel : ViewModel() {

    private val _areTextsEqual = MutableLiveData<Boolean>()
    val areTextsEqual: LiveData<Boolean> = _areTextsEqual

    fun compareTexts(text1: String, text2: String) {
        _areTextsEqual.value = text1 == text2
    }
}
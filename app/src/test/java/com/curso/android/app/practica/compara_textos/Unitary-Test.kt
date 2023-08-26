package com.curso.android.app.practica.compara_textos

import org.junit.Test
import org.junit.Assert.*

class TextComparisonViewModelTest {

    @Test
    fun testTextComparison() {
        val viewModel = TextComparisonViewModel()

        viewModel.compareTexts("hello", "hello")
        assertEquals(true, viewModel.areTextsEqual.value)

        viewModel.compareTexts("hello", "world")
        assertEquals(false, viewModel.areTextsEqual.value)
    }
}

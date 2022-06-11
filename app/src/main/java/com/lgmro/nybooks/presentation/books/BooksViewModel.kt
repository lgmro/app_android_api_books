package com.lgmro.nybooks.presentation.books

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lgmro.nybooks.data.model.Book

class BooksViewModel : ViewModel() {
    private var _booksLiveData = MutableLiveData<List<Book>>()
    val booksLiveData: LiveData<List<Book>> = _booksLiveData

    fun getBooks() {
        _booksLiveData.value = createFakeBooks()
    }

    private fun createFakeBooks() =
        listOf(
            Book("MariaDB", "Maria"),
            Book("Naruto", "Sasuke"),
            Book("Mario", "Bros"),
            Book("Teste", "Do Mal"),
            Book("Caderno", "Pirata"),
            Book("Adão Negro", "DC"),
            Book("Magma", "Do Bem"))
}
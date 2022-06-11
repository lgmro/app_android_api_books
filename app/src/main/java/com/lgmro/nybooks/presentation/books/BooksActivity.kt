package com.lgmro.nybooks.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lgmro.nybooks.R
import com.lgmro.nybooks.data.model.Book
import com.lgmro.nybooks.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbarMain = binding.toolbarMain
        toolbarMain.title = getString(R.string.books_title)
        setSupportActionBar(toolbarMain)

        with(binding.recyclerBooks) {
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }
    }

    fun getBooks() =
      listOf(Book("MariaDB", "Maria"), Book("Naruto", "Sasuke"))

}
package com.lgmro.nybooks.presentation.books

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.lgmro.nybooks.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbarMain = binding.toolbarMain
        setSupportActionBar(toolbarMain)
    }
}
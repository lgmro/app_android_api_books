package com.lgmro.nybooks.presentation.details

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.lgmro.nybooks.R
import com.lgmro.nybooks.databinding.ActivityBookDetailsBinding
import com.lgmro.nybooks.presentation.base.BaseActivity

class BookDetailsActivity : BaseActivity() {
    private lateinit var binding: ActivityBookDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val title = intent.getStringExtra(EXTRA_TITLE)
        val description = intent.getStringExtra(EXTRA_DESCRIPTION)

        binding.bookDetailsTitle.text = title
        binding.bookDetailsDescription.text = description

        val toolbarMain = findViewById<Toolbar>(R.id.toolbarMain)
        setupToolbar(toolbarMain, R.string.book_details_title)


    }

    companion object {
        private const val EXTRA_TITLE = "EXTRA_TITLE"
        private const val EXTRA_DESCRIPTION = "EXTRA_DESCRIPTION"

        fun getStartIntent(context: Context, title: String, description: String) : Intent {
            return Intent(context, BookDetailsActivity::class.java).apply {
                putExtra(EXTRA_TITLE, title)
                putExtra(EXTRA_DESCRIPTION, description)
            }
        }
    }
}
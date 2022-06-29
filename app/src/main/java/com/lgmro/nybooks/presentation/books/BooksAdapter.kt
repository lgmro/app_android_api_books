package com.lgmro.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lgmro.nybooks.R
import com.lgmro.nybooks.data.model.Book

class BooksAdapter(
    private val books: List<Book>,
    private val onItemClickListener: ((book: Book) -> Unit)
) : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {

    class BooksViewHolder(view: View, private val onItemClickListener: ((book: Book) -> Unit)) :
        RecyclerView.ViewHolder(view) {
        private val titleView: TextView = view.findViewById<TextView>(R.id.textTitle)
        private val authorView: TextView = view.findViewById<TextView>(R.id.textAuthor)
        fun bindView(book: Book) {
            with(book) {
                titleView.text = title
                authorView.text = author

                itemView.setOnClickListener {
                    onItemClickListener.invoke(book)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)
        return BooksViewHolder(view, onItemClickListener)
    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        holder.bindView(books[position])
    }

    override fun getItemCount() = books.count()
}
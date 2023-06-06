package com.example.graphqldemo.service

import com.example.graphqldemo.model.Book
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookService {

    fun getAll(): List<Book> {
       return books
    }

    fun getById(id: UUID): Book? {
        return books.firstOrNull { it.id == id }
    }

    fun create(title: String, description: String?): Book {
        val newBook = Book(
            id = UUID.randomUUID(),
            title = title,
            description = description
        )
        books.add(newBook)
        return newBook
    }

    companion object {
        private val books = mutableListOf(
            Book(
                id = UUID.randomUUID(),
                title = "Title 1"
            )
        )
    }
}
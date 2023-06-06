package com.example.graphqldemo.resolver

import com.example.graphqldemo.model.Book
import com.example.graphqldemo.service.BookService
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller
import java.util.*

@Controller
class BookResolver(
    private val service: BookService
) {

    @QueryMapping
    fun getAllBooks(): List<Book> {
        return service.getAll()
    }

    @QueryMapping
    fun getById(@Argument id: UUID): Book? {
        return service.getById(id)
    }

    @MutationMapping
    fun create(@Argument title: String, @Argument description: String?): Book {
        return service.create(title, description)
    }
}
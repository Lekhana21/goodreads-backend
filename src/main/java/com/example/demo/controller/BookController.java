package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/books")
@CrossOrigin(origins="https://effortless-pixie-a47dc9.netlify.app")
public class BookController {
	@Autowired
	private BookService bookService;
	//get all books
	@GetMapping
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	//get book by id
	@GetMapping("/{id}")
	public Optional<Book> getBookById(@PathVariable Long id){
		return bookService.getBookById(id);
	}
	//add new book
	@PostMapping
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}
	//update book
	@PutMapping("/{id}")
	public Book updateBook(@PathVariable Long id, @RequestBody Book book) {
		book.setId(id);
		return bookService.updateBook(book);
	}
	
	//delete book
	@DeleteMapping("/{id}")
		public void deleteBook(@PathVariable Long id) {
			bookService.deleteBook(id);
		}
	
	//search books by title
	@GetMapping("/search")
	public List<Book> searchBooks(@RequestParam String title){
		return bookService.searchBooksByTitle(title);
	}
	
	//filter books by genre
	@GetMapping("/genre")
	public List<Book> getBooksByGenre(@RequestParam String genre){
	    return bookService.getBooksByGenre(genre);
	}

	

}

package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	public List<Book> getAllBooks(){
		return bookRepository.findAll();
	}
	public Optional<Book> getBookById(Long id){
		return bookRepository.findById(id);
	}
	
	public Book addBook(Book book) {
		return bookRepository.save(book);
	}
	public Book updateBook(Book book) {
		return bookRepository.save(book);
	}
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
	public List<Book> searchBooksByTitle(String title){
		return bookRepository.findByTitleContainingIgnoreCase(title);
	}
	public List<Book> getBooksByGenre(String genre) {
	    return bookRepository.findByGenreContainingIgnoreCase(genre);
	}


}

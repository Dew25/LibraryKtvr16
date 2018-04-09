/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryktvr17;

import entity.Book;
import java.util.ArrayList;
import java.util.List;

public class MyTools {
    public Book find(List<Book>books,String bookName,String bookAuthor){
        Book book = null;
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if(b.getName().equals(bookName) && b.getAuthor().equals(bookAuthor)){
                book = b;
                break;
            }
        }
        return book;
    }
    public List<Book> findBooksByAuthor(List<Book> books,String bookAuthor){
        List<Book> findBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getAuthor().equals(bookAuthor)){
               findBooks.add(book); 
            }
        }
        return findBooks;
    }
    public List<Book> findBook(List<Book> books,String book){
        List<Book> findBook = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if(b.getName().equals(book)){
                findBook.add(b);
            }
        }
        return findBook;
    }
    
    
}

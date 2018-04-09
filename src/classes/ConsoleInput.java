/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Introduced;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class ConsoleInput implements Introduced{

    @Override
    public Book addBook() {
        AddBook addBook = new AddBook();
        return addBook.add();
    }

    @Override
    public Reader addReader() {
        AddReader addReader = new AddReader();
        return addReader.add();
    }

    @Override
    public History addHistory(List<Reader> readers,List<Book> books) {
       AddHistory addHistory = new AddHistory();
       return addHistory.add(readers, books);
    }

}

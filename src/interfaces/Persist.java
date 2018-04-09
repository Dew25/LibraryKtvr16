/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;

/**
 *
 * @author Melnikov
 */
public interface Persist {
    public void saveBooks(List<Book> books);
    public void saveReader(List<Reader> readers);
    public void saveHistories(List<History> histories);
    public List<Book> loadBooks(String fileName);
    public List<Reader> loadReaders(String fileName);
    public List<History> loadHistories(String fileName);
}

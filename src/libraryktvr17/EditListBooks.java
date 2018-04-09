/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryktvr17;

import entity.Book;
import com.sun.glass.ui.SystemClipboard;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Melnikov
 */
public class EditListBooks {

    private List<Book> books= new ArrayList<>();

    public void addBookToBooks(Book book){
        books.add(book);
    }
    public void addNewBook(){
        String repeat = "n";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do{
                System.out.print("Название книги: ");
                String bookName = br.readLine();
                System.out.print("Автор книги: ");
                String bookAuthor = br.readLine();
                System.out.print("ISBN: ");
                String isbn = br.readLine();
                Book book = new Book(isbn, bookName, bookAuthor);
                books.add(book);
                System.out.println("Книга добавлена в список.");
                System.out.println("Хотите еще добавть книгу, нажмите \"к\", иначе любую другую клавишу.");
                repeat = br.readLine();
            }while("r".equals(repeat));
        } catch (IOException ex) {
            Logger.getLogger(EditListBooks.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void saveBooksToFile(String fileName){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, "Нет файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, "Ошибка ввода вывода", ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, "Ошибка закрытия стрима", ex);
            }
        }
    }
    public List<Book> loadBooksFromFile(String fileName){

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(fileName);
            ObjectInputStream oin = new ObjectInputStream(fis);
            books = (List<Book>) oin.readObject();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(SaveList.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return this.books;
    }
    public void removeBookFromBooks(Book book){
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            if(book.equals(b)){
                books.remove(b);
            }
        }
    }
    public List<Book> getBooks(){
        return this.books;
    }

}

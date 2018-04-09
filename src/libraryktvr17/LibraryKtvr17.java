/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryktvr17;

import entity.Reader;
import entity.History;
import entity.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class LibraryKtvr17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        App app = new App();
        app.run();
        
        
        
        
        
        
        
        /** 
         * Есть библиотека с книгами.
         * "Война и Мир", "Отцы и дети".
         * В библиотеку приходит читатель с именем Peter.
         * Peter берет книгу "Война и Мир" для чтения.
         * Через 10 дней Peter возвращает книгу в библиотеку.
         */
        
        
//        List<Book> books = new ArrayList<>();
//        EditListBooks elb = new EditListBooks();
//        elb.addNewBook();
//        System.out.println("Список добавленных книг: ");
//        for (int i = 0; i < elb.getBooks().size(); i++) {
//            System.out.println(elb.getBooks().get(i).toString());
//            
//        }
//        Book book1 = new Book();
//        books.add(book1);
//        book1.setISBN("321-4345-54543453");
//        book1.setName("Voina i Mir");
//        book1.setAuthor("L.Tolstoy");
//        Book book2 = new Book("321-4345-54543454","Otsi i deti","I.Turgenev");
//        books.add(book2);
//        Book book3 = new Book("321-4345-54543455","Anna Karenina", "L.Tolstoy");
//        books.add(book3);
//        System.out.println("Наш список книг: ");
//        for (int i = 0; i < books.size(); i++) {
//            Book book = books.get(i);
//            System.out.println(book.toString());
//        }
//        Reader peter = new Reader();
//        peter.setName("Peter");
//        peter.setEmail("peter@eesti.ee");
//        peter.setCode("39206123421");
//        peter.setPhone("+37256576768");
//        System.out.println("Читатель записался в библиотеку");
//        System.out.println("Имя читателя: "+peter.getName());
//        Reader nikolay = new Reader("Nikolay","nikolay@eesti.ee","3920623422","+3715645649");
//        List<Reader> readers = new ArrayList<>();
//        readers.add(peter);
//        readers.add(nikolay);
//        System.out.println("Наш список читателей: ");
//        for (int i = 0; i < readers.size(); i++) {
//            Reader reader = readers.get(i);
//            System.out.println(reader.toString());
//        }
//        System.out.println("Читатель выбрал книгу: "+ book1.getName());
//        System.out.println("Библиотекарь сделал запись в карточку: ");
//        History history = new History();
//        history.setBook(book1);
//        history.setReader(peter);
//        System.out.println(history.toString());
//        System.out.println("Пришел в биклиотеку Николай и взял книгу \"Отцы и дети\"");
//        History history2 = new History(book2, nikolay);
//        System.out.println(history2.toString());
//        List<History> histories = new ArrayList<>();
//        histories.add(history);
//        histories.add(history2);
//        SaveList sl = new SaveList();
//        System.out.println("Сериализуем и сохраняем на диске историю");
//        sl.saveHistories(histories);
//        System.out.println("Считываем историю с диска.");
//        histories=sl.loadHistories();
//        for (int i = 0; i < histories.size(); i++) {
//            History get = histories.get(i);
//            System.out.println(get.toString());
//        }
//        
//        System.out.println("----------------------------");
//        
//        System.out.println("Поиск книги.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Укажите имя книги: ");
//        String bookName = scanner.nextLine();
//        System.out.print("Укажите имя автора: ");
//        String bookAuthor = scanner.nextLine();
//        MyTools myTools = new MyTools();
//        Book findBook = myTools.find(books, bookName, bookAuthor);
//        if(findBook != null){
//            System.out.println("Найденная книга: "+findBook.toString());
//        }else{
//            System.out.println("Такой книги нет в списке!"); 
//        }
//        System.out.println("Найти все книги автора: ");
//        bookAuthor = scanner.nextLine();
//        List<Book> findBooks = myTools.findBooksByAuthor(books, bookAuthor);
//        if(findBooks.isEmpty()){
//            System.out.println("Книг этого автора в списке нет!");
//        }else{
//            System.out.println("Найденные книги:");
//            for (int i = 0; i < findBooks.size(); i++) {
//                Book book = findBooks.get(i);
//                System.out.println(book.toString());
//            }
//        }
//        System.out.println("Найти книги по названию: ");
//        bookName = scanner.nextLine();
//        List<Book>listBooks = myTools.findBook(books, bookName);
//        if(listBooks.isEmpty()){
//            System.out.println("Книги с таким названием нет");
//        }else{
//            System.out.println("Найденные книги:");
//            for (int i = 0; i < listBooks.size(); i++) {
//                Book book = listBooks.get(i);
//                System.out.println(book.toString());
//            }
//        }
    }
    
    
}

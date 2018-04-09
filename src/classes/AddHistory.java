package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Melnikov
 */
public class AddHistory {
    public History add(List<Reader>readers,List<Book>books){
        Scanner scanner = new Scanner(System.in);
        System.out.println("------Выдаем читателям книги-------");
        System.out.println("Список читалелей:");
        for (int i = 0; i < readers.size(); i++) {
            Reader r = readers.get(i);
            System.out.println(i+1+". "+r.getName());
        }
        System.out.println("Список книг:");
        for (int i = 0; i < books.size(); i++) {
            Book b = books.get(i);
            System.out.println(i+1+". "+b.toString());
        }
        System.out.println("Выберите номер читателя и книги, которую он возьмет");
        System.out.println("№ читателя: ");
        String numReader = scanner.nextLine();
        System.out.println("№ книги: ");
        String numBook = scanner.nextLine();
        History h = new History();
        h.setBook(books.get(new Integer(numBook)-1));
        h.setReader(readers.get(new Integer(numReader)-1));
        return h;
    }
}

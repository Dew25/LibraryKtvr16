/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class AddBook {
    public Book add(){
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        System.out.println("---- Добавление книги -----");
        System.out.println("Имя книги: ");
        book.setName(scanner.nextLine());
        System.out.println("Автор: ");
        book.setAuthor(scanner.nextLine());
        System.out.println("ISBN: ");
        book.setISBN(scanner.nextLine());
        return book;
    }
}

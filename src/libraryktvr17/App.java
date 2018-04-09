/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryktvr17;

import classes.ConsoleInput;
import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class App {
    Scanner scanner =new Scanner(System.in);
    String repeat = "n";
    List<Book>books = new ArrayList<>();
    List<Reader>readers = new ArrayList<>();
    List<History>histories = new ArrayList<>();
    ConsoleInput ci = new ConsoleInput();
    String num = "0";
    public void run(){
        do {            
            System.out.println("0 - выйти из программы");
            System.out.println("1 - Добавить книгу");
            System.out.println("2 - Добавть читателя");
            System.out.println("3 - Выдать книгу");
            System.out.println("Выберите цифру: ");
            num = scanner.next();
             switch (num) {
                case "0":
                    repeat = "n";
                    break;
                case "1":
                    this.books.add(ci.addBook());
                    repeat = "r";
                    break;
                case "2":
                    this.readers.add(ci.addReader());
                    repeat = "r";
                    break;
                case "3":
                    this.histories.add(ci.addHistory(readers, books));
                    repeat = "r";
                    break;
            }
        }while("r".equals(repeat));
        System.out.println("By-by!");
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author Melnikov
 */
public class AddReader {
    public Reader add(){
        Scanner scanner = new Scanner(System.in);
        Reader reader = new Reader();
        System.out.println("Имя читателя: ");
        reader.setName(scanner.nextLine());
        System.out.println("Email: ");
        reader.setEmail(scanner.nextLine());
        System.out.println("Личный код: ");
        reader.setCode(scanner.nextLine());
        System.out.println("Телефон: ");
        reader.setPhone(scanner.nextLine());
        
        return reader;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Book;
import entity.History;
import entity.Reader;
import interfaces.Persist;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
public class FilePersist implements Persist{

    @Override
    public void saveBooks(List<Book> books) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            //oos = new ObjectOutputStream(new FileOutputStream("Books.txt"));
            fos = new FileOutputStream("Books.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(books);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Не смог создать файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Ошибка чтения объекта", ex);
        }finally{
            try {
                if(oos != null)oos.close();
                if(fos != null)fos.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Исходящий поток не закрыт", ex);            }
        }
    }

    @Override
    public void saveReader(List<Reader> readers) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            //oos = new ObjectOutputStream(new FileOutputStream("Books.txt"));
            fos = new FileOutputStream("Readers.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(readers);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Не смог создать файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Ошибка чтения объекта", ex);
        }finally{
            try {
                if(oos != null)oos.close();
                if(fos != null)fos.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Исходящий поток не закрыт", ex);            }
        }
    }

    @Override
    public void saveHistories(List<History> histories) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            //oos = new ObjectOutputStream(new FileOutputStream("Books.txt"));
            fos = new FileOutputStream("Histories.txt");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(histories);
            oos.flush();
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Не смог создать файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Ошибка чтения объекта", ex);
        }finally{
            try {
                if(oos != null)oos.close();
                if(fos != null)fos.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Исходящий поток не закрыт", ex);            }
        }
    }

    @Override
    public List<Book> loadBooks(String fileName) {
        List<Book> books = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {
            fis = new FileInputStream(fileName);
            oin = new ObjectInputStream(fis);
            books = (List<Book>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Ошибка чтения из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Не могу найти нужный класс", ex);
        } finally{
            try {
                if(oin != null)oin.close();
                if(fis != null)fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Входящий файловый поток не закрыт", ex);
            }
        }
        return books;
    }

    @Override
    public List<Reader> loadReaders(String fileName) {
        List<Reader> readers = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {
            fis = new FileInputStream(fileName);
            oin = new ObjectInputStream(fis);
            readers = (List<Reader>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Ошибка чтения из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Не могу найти нужный класс", ex);
        } finally{
            try {
                if(oin != null)oin.close();
                if(fis != null)fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Входящий файловый поток не закрыт", ex);
            }
        }
        return readers;
    }

    @Override
    public List<History> loadHistories(String fileName) {
        List<History> histories = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream oin = null;
        try {
            fis = new FileInputStream(fileName);
            oin = new ObjectInputStream(fis);
            histories = (List<History>) oin.readObject();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Ошибка чтения из файла", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Не могу найти нужный класс", ex);
        } finally{
            try {
                if(oin != null)oin.close();
                if(fis != null)fis.close();
            } catch (IOException ex) {
                Logger.getLogger(FilePersist.class.getName()).log(Level.SEVERE, "Входящий файловый поток не закрыт", ex);
            }
        }
        return histories;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryktvr17;

import entity.History;
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
public class SaveList {

    public void saveHistories(List<History> histories) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("histories.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(histories); 
            oos.writeObject(histories);
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
    public List<History> loadHistories(){
        List<History> histories = new ArrayList<>();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("histories.txt");
            ObjectInputStream oin = new ObjectInputStream(fis);
            histories = (List<History>) oin.readObject();
            
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
        return histories;
    }
}

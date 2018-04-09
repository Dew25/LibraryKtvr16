/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;

/**
 *
 * @author Melnikov
 */
public class Reader implements Serializable{
    private String name;
    private String email;
    private String code;
    private String phone;

    public Reader() {
    }

    public Reader(String name, String email, String code, String phone) {
        this.name = name;
        this.email = email;
        this.code = code;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Reader{" + "name=" + name + ", email=" + email + ", code=" + code + ", phone=" + phone + '}';
    }
    
    
}

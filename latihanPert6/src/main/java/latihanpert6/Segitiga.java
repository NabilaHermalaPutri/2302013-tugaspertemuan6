/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanpert6;

/**
 *
 * @author Lenovo
 */
public class Segitiga {
    // Atribut kelas segitiga
    double alas;
    double tinggi;
    double sisi;
    
    // Konstruktor tanpa parameter (default)
    Segitiga() {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    }

    // Konstruktor dengan parameter
    Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    // Method untuk menghitung luas segitiga
    double getLuas() {
        return (alas * tinggi) / 2;
    }
    
    // Method untuk menghitung keliling segitiga
    double getKeliling() {
        return alas + sisi + sisi;
    }
    
    // Method untuk mengubah nilai alas
    void setAlas(double alasBaru) {
        alas = alasBaru;
    }
    
    // Method untuk mengubah nilai tinggi
    void setTinggi(double tinggiBaru) {
        tinggi = tinggiBaru;
    }
    
    // Method untuk mengubah nilai sisi
    void setSisi(double sisiBaru) {
        sisi = sisiBaru;
    }
}

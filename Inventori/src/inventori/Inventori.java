/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventori;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 31/01/2023
 * 
 */
public class Inventori {
    Barang[] barangs;
    
    //Mendefinisikan objek barang yang terdiri dari kode, nama, dan stok awal
    void initBarang(){
        barangs = new Barang[2];
        barangs[0] = new Barang("001", "Baju", 10);
        barangs[1] = new Barang("002", "Celana", 20);
    }
    
    //Menampilkan nama dan banyaknya stok barang
    void showBarang(){
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    
    //Proses manipulasi banyaknya stok barang
    void pengadaan(){
        initBarang();
        
        barangs[0].setStok(50); //Stok baru
        barangs[1].setStok(50); //Stok baru
//        barangs[0].stok -= 30;
//        barangs[0].stok *= 30;
        
        showBarang();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan(); //Proses pemanggilan
    }
    
}
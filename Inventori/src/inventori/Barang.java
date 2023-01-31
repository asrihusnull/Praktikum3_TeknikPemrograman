/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventori;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 31/01/2023
 * 
 */
public class Barang {
    //Kamus Data (deklarasi variabel)
    String kode_barang;
    String nama_barang;
    //Mengganti access modifier variabel stok menjadi private
    private int stok;
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
    }
    
    //Membuat getter Stok untuk mendapatkan nilai dari variabel stok
    public int getStok(){
        return stok; //Mengembalikan nilai stok
    }
    
    //Membuat setter untuk memasukkan nilai dari variabel stok
    public void setStok(int stok){
        //Karena program melakukan perhitungan stok, maka tambahkan operasi aritmatika penjumlahan 
        //Penjumlahan dari jumlah stok awal barang dan jumlah barang baru 
        this.stok = this.stok + stok;
    }
}
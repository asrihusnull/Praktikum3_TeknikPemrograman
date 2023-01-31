/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kelasdua;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 31/01/2023
 * 
 */
public class KelasDua {
    {
        System.out.println(5);
    }
    /**
     * @param args the command line arguments
     */
    
    //Program akan masuk ke main saat pertama kali mengakses class KelasDua
    public static void main(String[] args) {
        //Menampilkan output angka 6
        System.out.println(6);
        //Melakukan method KelasSatu dengan objek satu yang tidak memiliki parameter
        KelasSatu satu = new KelasSatu();
        //Setelah proses method KelasSatu objek satu, lalu melakukan proses method KelasSatu objek dua yang memiliki parameter
        KelasSatu dua = new KelasSatu(10);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelasdua;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 31/01/2023
 * 
 */
public class KelasSatu {
    //Urutan pemanggilan dan diproses method yaitu static, non-static, public
    
    //Non-static dapat dipanggil setiap kali program dijalankan
    //Yang Kedua diproses method
    {
        System.out.println(11);
    }
    
    //Pertama kali diproses method, static dapat dipanggil tanpa harus membuat instansiasi objek dan hanya dapat dijalankan atau dipanggil sekali
    static
    {
        System.out.println(2);
    }
    
    //Yang pertama diproses setelah memproses method KelasSatu objek dua yang memiliki parameter
    //Public ini dapat dijalankan/diakses dengan parameter
    public KelasSatu(int i)
    {
        System.out.println(3);
    }
    
    //Yang ketiga diproses karena yang dipanggil adalah KelasSatu objek satu yang tidak memiliki parameter
    //Public ini dapat dijalankan/diakses tanpa memiliki parameter
    public KelasSatu()
    {
        System.out.println(4);
    }
}

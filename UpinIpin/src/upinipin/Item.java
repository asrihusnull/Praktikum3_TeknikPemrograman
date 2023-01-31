/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upinipin;

/**
 *
 * @author Asri
 * @version 1.0
 * @since 31/01/2023
 * 
 */
public class Item {
    //Deklarasi variabel nama dengan access modifier private
    private String name;
    private Item(){
        name = "Ipin";
    }
    public Item(String name){
        //Proses memasukkan item baru
        this.name = new Item().name;
        System.out.println(this.name);
    }
}
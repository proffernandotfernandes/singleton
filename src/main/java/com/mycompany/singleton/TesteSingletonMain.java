/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author ftfer
 */
public class TesteSingletonMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClasseSingleton obj1 = ClasseSingleton.getInstance();
        ClasseSingleton obj2 = ClasseSingleton.getInstance();
       
        if(obj1 == obj2){
            System.out.println("mesma instância");
        }
      
    }
    
}

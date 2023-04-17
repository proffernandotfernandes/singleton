/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.singleton;

/**
 *
 * @author ftfer
 */
public class ClasseSingleton {
    private static ClasseSingleton objSingleton;

    private ClasseSingleton(){
        System.out.println("objeto singleton criado com sucesso!");
    }

    public static synchronized ClasseSingleton getInstance(){

        if(objSingleton==null){
            objSingleton = new ClasseSingleton();
        }
    
        return objSingleton;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        throw new CloneNotSupportedException();
    }

}

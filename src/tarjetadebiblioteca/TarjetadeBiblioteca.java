/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetadebiblioteca;

import java.util.Scanner;

public class TarjetadeBiblioteca {

    //(Autores:
    //Camilo Chaparro
    //Camilo Valencia Peña
    //Guillermo Ospino
    //Gustavo Berdugo
    //Julian Malaver
   
    
    public static void main(String[] args) {
    
    Scanner in = new Scanner(System.in);
        
        
        System.out.println("Set the name of the Student: ");
        String owner = in.next();
        System.out.println("Set the e-mail of the Student: ");
        String email = in.next();
        Student student = new Student(owner,email);
        
        LibraryCard card1 = new LibraryCard(student, 3);

        LibraryCard card2 = new LibraryCard(student, 0);
        
        System.out.println(card1);
        System.out.println(card2);
        }
}

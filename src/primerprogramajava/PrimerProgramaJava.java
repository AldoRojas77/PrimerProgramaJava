/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerprogramajava;

import java.util.Scanner;

/**
 *
 * @author rojas
 */
public class PrimerProgramaJava {

    public static void main ( String[] args){
        Scanner in = new Scanner (System.in);
        System.out.print("Nota: ");
        int nota = in.nextInt();
        if (nota > 7 ){
            System.out.println("Felicitaciones");
            System.out.println("Has aprobado");
        }else
            System.out.println("Debes mejorar tus notas");
    }
    
}

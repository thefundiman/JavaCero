/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javacero;

/**
 *
 * @author alber
 */

import java.util.*;
import java.text.*;
import static net.mindview.util.Print.*;


class fundi {
    int numero;
    char letra;
    String choricillo;
}
        
public class JavaCero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        fundi f = new fundi();
        f.letra = 'a';
        f.numero = 1;
        System.out.printf("%s %s %s \n", f.letra, f.numero, f.choricillo);
        
        f.choricillo = "ahivaesamagraaaaa";
        System.out.println(f.letra + " " + f.numero + " " + f.choricillo);

        fundi g =new fundi();
        g.letra = f.letra;
        fundi h = f;
        System.out.printf("%s %s %s \n", f.letra, g.numero, h.choricillo);
        g = f;
        System.out.printf("%s %s %s \n", f.letra, g.numero, h.choricillo);
        print("Caguen putes" /*, "%s", h.letra, "%s", h.numero, "%s", h.choricillo*/);
        
        
        fundi j = new fundi();
        j.numero = 0;
        System.out.println("hola");
        
    }
    
}

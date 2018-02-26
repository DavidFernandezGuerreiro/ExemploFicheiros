
package Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dfernandezguerreiro
 */
public class LerPalabras {
    Scanner sc;
    
    public void lerPalabras(){
        File fich=new File("/home/local/DANIELCASTELAO/dfernandezguerreiro/Escritorio/primeiro.txt");
        
        try {
            sc=new Scanner(fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNextLine()){ //Mientras haya algo que leer, pues que lo lea.
                System.out.println(sc.next());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERRO1"+ex.getMessage());
        }
        sc.close();
    }
}

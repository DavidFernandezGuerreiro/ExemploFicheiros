
package Lectura;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author dfernandezguerreiro
 */
public class LerNumeros {
    Scanner sc;
//    File fich;
    
    public void lerNumeros(){
        File fich=new File("/home/local/DANIELCASTELAO/dfernandezguerreiro/Escritorio/terceiro.txt");
        
        try {
            sc=new Scanner(fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNextInt()){ //Mientras non haxa ningun numero para leer,
                System.out.println(sc.nextInt());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("ERRO1"+ex.getMessage());
        }
        sc.close();
    }
    
    public void sumarPares(){
        File fich=new File("/home/local/DANIELCASTELAO/dfernandezguerreiro/Escritorio/terceiro.txt");
        int num=0;
        int suma=0;
        
        try {
            sc=new Scanner(fich).useDelimiter("\\s*,\\s*");
            while(sc.hasNextInt()){ //Mientras non haxa ningun numero para leer,
                
                num=sc.nextInt(); //num coje los valores del fichero.
                if(num%2==0){
                    suma=num+suma;
                }
            }
            System.out.println("Suma pares= "+suma);
        } catch (FileNotFoundException ex) {
            System.out.println("ERRO1"+ex.getMessage());
        } 
            
        sc.close();
        
        
    }
}
    

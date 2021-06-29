
package att.tp.recupe;

import java.util.Scanner;

    public class Numeros {
        
        Scanner objscanner = new Scanner (System.in); 
                     
        public void calculo(){
    
        int numeroDuo = 1;
        int resultadoDuo = 0;


        while (numeroDuo >= 1) {
            System.out.println("Digite um número: ");
            numeroDuo = objscanner.nextInt();
            
            if (numeroDuo < -1) {
                break;
            }

            resultadoDuo = (resultadoDuo + numeroDuo);

        }
        System.out.println("A Soma dos Números Digitados: " + resultadoDuo);
                
     }
    
    }
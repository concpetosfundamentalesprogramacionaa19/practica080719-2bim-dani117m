/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad2;


/**
 *
 * @author Salas
 */
public class Principal {
    public static void main (String[] args){
	int v = 5;
        int b = 2;
        int tm2 = 8;
        int ex = 4;
        int []arreglo2 = {10, 20, 30, 1, 2, 3, 40, 4};
        // caso 1
        int num = SumaNumeros.obtenerSumaUno(v);
        // caso 2 
        int num2 = SumaNumeros.obtenerSumaDos(v);
        // caso 3 
        int rt = Potencia.get_potencia(b, ex);
        // caso 4 
        int tm = Potencia.obtenerTamanioArreglo(arreglo2, tm2 );
        // caso 4 sin recursiva 
        int tt = Potencia.obtenerTamanioArreglo2(arreglo2, tm2);
       
        System.out.printf("Suma1: %d\nSuma2: %d\nPotencia: %d\nArray %d\n"
                + "Array sin Recursiva %d", num, num2, rt, tm, tt);
        
    }
    
           
    
}

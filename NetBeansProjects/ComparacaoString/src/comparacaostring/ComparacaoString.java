/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author chrys
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Chrys";
        String nome2 = "Chrys";
        String nome3 = new String("Chrys");
        String res;
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}

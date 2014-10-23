import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class Pratica31 {
    private static Date inicio;
    private static String meuNome = "Rodrigo Passerino Fischer da Silva";
    private static GregorianCalendar dataNascimento = new GregorianCalendar(1996, 5, 07);
    private static Date fim;


    public static void main(String args[]){
        inicio = new Date();
        System.out.println(meuNome.toUpperCase());
        System.out.print(meuNome.toUpperCase().charAt(29) + meuNome.toLowerCase().substring(30,34) + ", " +meuNome.toUpperCase().charAt(0) + ". " + meuNome.toUpperCase().charAt(8) + ". " + meuNome.toUpperCase().charAt(18) + ".");
        System.out.println("\n" + (inicio.getTime()-dataNascimento.getTimeInMillis())/86400000);
        fim = new Date();
        System.out.println(fim.getTime()-inicio.getTime());        
    }
}

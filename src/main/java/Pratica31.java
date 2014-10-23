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
    private static long tinicio;
    private static final String meuNome = "Rodrigo Passerino Fischer da Silva";
    private static final GregorianCalendar dataNascimento = new GregorianCalendar(1996, 8, 12);
    private static Date fim;
    private static long tfim;


    public static void main(String args[]){
        inicio = new Date();
        tinicio = inicio.getTime();
        System.out.println(meuNome.toUpperCase());
        System.out.print(meuNome.toUpperCase().charAt(29) + meuNome.toLowerCase().substring(30,34) + ", " +meuNome.toUpperCase().charAt(0) + ". " + meuNome.toUpperCase().charAt(8) + ". " + meuNome.toUpperCase().charAt(18) + ".");
        System.out.println("\n" + ( inicio.getTime()-dataNascimento.getTimeInMillis())/86400000);
        fim = new Date();
        tfim = fim.getTime();
        System.out.println(tfim-tinicio);        
    }
}

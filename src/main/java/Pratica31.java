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
    private static String meuNome;
    private static GregorianCalendar dataNascimento;
    private static Date fim;
    private static long tinicio;
    private static long tfim;

    public static void main(String args[]){
        inicio = new Date();
        tinicio=inicio.getTime();
        meuNome = "Rodrigo Passerino Fischer da Silva";     
        System.out.println(meuNome.toUpperCase());
        System.out.print(meuNome.toUpperCase().charAt(29) + meuNome.toLowerCase().substring(30,34) + ", " +meuNome.toUpperCase().charAt(0) + ". " + meuNome.toUpperCase().charAt(8) + ". " + meuNome.toUpperCase().charAt(18) + ".");  
        dataNascimento = new GregorianCalendar(1996, 8, 12);
        GregorianCalendar data =new GregorianCalendar(); 
        int anos= data.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        int meses = data.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
        int dias = data.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
        int idadedias = anos*365+meses*30+dias;
        System.out.println("\nIdade em dias: "+idadedias);
        fim = new Date();
        tfim=fim.getTime();
        System.out.println(tfim-tinicio);
        
    }
}

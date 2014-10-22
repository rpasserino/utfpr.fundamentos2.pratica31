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
    public static void main(String args[]){
        Date inicio = new Date();
        long tinicio = inicio.getTime();
        String meuNome = "Rodrigo Passerino Fischer da Silva";     
        System.out.println(meuNome.toUpperCase());
        System.out.print(meuNome.toUpperCase().charAt(29) + meuNome.substring(30,34) + ", " +meuNome.toUpperCase().charAt(0) + ". " + meuNome.toUpperCase().charAt(8) + ". " + meuNome.toUpperCase().charAt(18) + ".");  
        GregorianCalendar dataNascimento = new GregorianCalendar(1996, 8, 12);
        GregorianCalendar data =new GregorianCalendar(); 
        int anos= data.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);
        int meses = data.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
        int dias = data.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
        int idadedias = anos*365+meses*30+dias;
        System.out.println("\nIdade em dias: "+idadedias);
        Date fim = new Date();
        long tfim = fim.getTime();
        System.out.println("Tempo de processamento em milisegundos:" + (tfim-tinicio));
        
    }
}

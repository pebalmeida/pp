import java.io.*;
import java.time.*;

class time{
    public static void main(String args[]){
        LocalDateTime DTHR = LocalDateTime.now();
        int HOR = DTHR.getHour(); // Pega a Hora do Sistema
        int MIN = DTHR.getMinute(); // Pega os Minutos 
        int SEG = DTHR.getSecond(); // Pega os Segundos
        int NAS = DTHR.getNano(); // Pega o Nanosegundo

        //Imprimir na Tela
        System.out.println();
        System.out.println("Data do Sistema......:" + DTHR); // Mostra a Data do Sistema
        System.out.println("Hora.........:" + HOR); // Mostra a Hora do Sistema
        System.out.println("Minutos........." + MIN); // Mostra os Minutos do Sistema
        System.out.println("Segundos...........:" + SEG); // Mostra os Segundos do Sistema
        System.out.println("Nanosegundos..........." + NAS); // Mostra os Nanosegundos do Sistema
        System.out.println();
    }
}

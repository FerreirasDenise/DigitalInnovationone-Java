package aulas.exercicios.datas;

import java.time.LocalDateTime;
import java.util.Date;

public class ProgramaDatas {

    public static void main(String[] args) {
        /*
        CLASSE DATES
         */
        System.out.println("Testando classe Date()");

        Date dataNasc = new Date(478407600000L); // 28-02-1985
        Date dataCompara = new Date(1273892400000L); // 15-05-2010

        Dates data = new Dates(dataNasc, dataCompara);

        System.out.println("Nascimento anterior a 15-05-2010: " + data.verificaAnterior());
        System.out.println("Nascimento posterior a 15-05-2010: " + data.verificaPosterior() + "\n");

        /*
        CLASSE CALENDARS
         */
        System.out.println("Testando classe Calendar()");

        Calendars calendars = new Calendars(18, 6, 2020);

        System.out.printf("Data de vencimento: " + "%tD\n", calendars.getDataVcto().getTime());
        System.out.println("Dias para pagar após o vencimento: " + calendars.retornaDias() + "\n");

        /*
        CLASSE DATEFORMATS
         */
        System.out.println("Testando classe SimpleDateFormat()");

        // Formatos Doc: https://docs.oracle.com/javase/7/docs/api/java/text/SimpleDateFormat.html
        // Opcao 1: "dd/MM/yyyy"
        // Opcao 2: "dd/MM/yyyy hh:mm:ss:SSS"
        // Opcao 3: "h:mm a" (hora AM/PM)
        // Opcao 4: "HH:mm" (0-23h)
        // Opcao 5: "dd de MMMMM de yyyy."

        DateFormats dateFormats = new DateFormats();

        System.out.println("Imprimindo data atual: " + dateFormats.escolherFormato(1));
        System.out.println("Imprimindo data atual: " + dateFormats.escolherFormato(2));
        System.out.println("Imprimindo data atual: " + dateFormats.escolherFormato(3));
        System.out.println("Imprimindo data atual: " + dateFormats.escolherFormato(4));
        System.out.println("Imprimindo data atual: " + dateFormats.escolherFormato(5));

        System.out.println("Imprimindo data atual: " + dateFormats.formatarData("dd/MM/yyyy") + "\n");


        /*
        LOCALDATETIME
         */
        System.out.println("Testando classe Date() a partir do Java 8");

        LocalDateTime agora = LocalDateTime.of(2010, 05, 15, 10, 00, 00);
        LocalDateTime futuro = agora.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println("Data Inicial: " + agora);
        System.out.println("Data final: " + futuro);

    }
}

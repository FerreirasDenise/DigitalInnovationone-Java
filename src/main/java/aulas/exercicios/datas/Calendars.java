package aulas.exercicios.datas;

import java.time.LocalDate;
import java.util.Calendar;

public class Calendars {

    private Calendar dataVcto;

    public Calendars(int dia, int mes, int ano) {
        this.dataVcto = Calendar.getInstance();
        // Meses em Calendar começam do 0
        dataVcto.set(ano, mes-1, dia);
    }

    public Calendar getDataVcto(){
        return dataVcto;
    }

    public int retornaDias(){
        Calendar novaData = dataVcto;
        novaData.add(Calendar.DATE, 10);
        if (novaData.get(Calendar.DAY_OF_WEEK) == 1){
            return 11;
        } else if (novaData.get(Calendar.DAY_OF_WEEK) == 7) {
            return 12;
        }
        return 10;
    }
}

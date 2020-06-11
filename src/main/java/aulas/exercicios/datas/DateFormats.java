package aulas.exercicios.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormats {
    private Date dataAtual;
    private SimpleDateFormat formatter;

    public String formatarData(String formato){
        this.dataAtual = new Date();
        this.formatter = new SimpleDateFormat(formato);
        return formatter.format(dataAtual);
    }

    public String escolherFormato(int opcao){
        switch (opcao) {
            case 1: return formatarData("dd/MM/yyyy");
            case 2: return formatarData("dd/MM/yyyy hh:mm:ss:SSS");
            case 3: return formatarData("h:mm a");
            case 4: return formatarData("HH:mm");
            case 5: return formatarData("dd 'de' MMMM 'de' yyyy.");
            default:
                return "Opcao Invalida";
        }
    }
}

package aulas.exercicios.datas;

import java.util.Date;

public class Dates {
    private Date dataNasc;
    private Date dataCompara;

    public Dates(Date dataNasc, Date dataCompara) {
        this.dataNasc = dataNasc;
        this.dataCompara = dataCompara;
    }

    public boolean verificaAnterior() {
        return dataNasc.before(dataCompara);
    }

    public boolean verificaPosterior() {
        return dataNasc.after(dataCompara);
    }
}

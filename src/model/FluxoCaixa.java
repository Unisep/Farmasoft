/*
 * Classe para representar o modelo Fluxo de Caixa
 */
package model;

import java.util.Date;

/**
 *
 * @author Felipe
 */
public class FluxoCaixa {
    private Date dtini;
    private Date dtfim;
    private float totalgeral;

    public Date getDtini() {
        return dtini;
    }

    public void setDtini(Date dtini) {
        this.dtini = dtini;
    }

    public Date getDtfim() {
        return dtfim;
    }

    public void setDtfim(Date dtfim) {
        this.dtfim = dtfim;
    }

    public float getTotalgeral() {
        return totalgeral;
    }

    public void setTotalgeral(float totalgeral) {
        this.totalgeral = totalgeral;
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package attributes;

/**
 *
 * @author profe
 */
public class Account {
    //Variable declaration.
    private double saldoInicial;
    private boolean hayError;
    
    //Constructor.
    public Account() {
        saldoInicial = 0;
        hayError = false;
        
    }
    
    /**
     * Este método sirve para aumentrar la cuanta de un usario.
     *  @param monto Parámentro para recibir el nuebo monto 
     */    
    public void DepositoMaximo(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    
    /**
     * Este método sirve para disminuir la cuenta de un usaruio
     * @param monto Pa´rametro para recibir el nuevo monto
     */   
    public void Retiro(double monto){
        if(getSaldoInicial() >= monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }

    /**
     * @return the saldoInicial
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
    
    
}


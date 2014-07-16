/*
 *Name: Attributes.
 
 *Information: Second exercise, creating a class. 
 
 *Date: 14/5/2014.
 
 *Copyright.
  
 */
package attributes;

/**
 *
 * @author Jose Pablo Arce Cascante.
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
     *  @param monto Parámentro para recibir el nuevo monto. 
     */    
    public void DepositoMaximo(double monto)
    {
        setSaldoInicial(getSaldoInicial() + monto);
    }
    
    /**
     * Este método sirve para disminuir la cuenta de un usaruio.
     * @param monto Parámetro para recibir el nuevo monto.
     */   
    public void Retiro(double monto){
        if(getSaldoInicial() >= monto)
            setSaldoInicial(getSaldoInicial() - monto);
        else
            setHayError(true);
    }

    /**
     * Método get para saldoInicial.
     * @return the saldoInicial.
     */
    public double getSaldoInicial() {
        return saldoInicial;
    }

    /**
     * Método set para saldoInicial.
     * @param saldoInicial the saldoInicial to set
     */
    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    /**
     * Método hayError, muetra si hay un problema con los fondos.
     * @return the hayError
     */
    public boolean isHayError() {
        return hayError;
    }

    /**
     * Método set para hayError.
     * @param hayError the hayError to set
     */
    public void setHayError(boolean hayError) {
        this.hayError = hayError;
    }
    
    
}


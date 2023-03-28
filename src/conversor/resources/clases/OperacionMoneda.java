/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.resources.clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class OperacionMoneda {
    private double valor, result;
    private int divisaInicial, divisaFinal;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisaInicial() {
        return divisaInicial;
    }

    public void setDivisaInicial(int divisaInicial) {
        this.divisaInicial = divisaInicial;
    }

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
    
    public double ConversionesDeMonedas(){ 
        try {
            if(divisaInicial == 0 && divisaFinal == 0){ // peso colombiano a dolar
                result = valor * 0.21;
            }else if (divisaInicial == 1 && divisaFinal == 5){
                result = valor * 4780; //dolar a peso colombiano
            }
            if(divisaInicial == 0 && divisaFinal == 1){ // peso colombiano a euros
                result = valor * 0.20;
            }else if(divisaInicial == 2 && divisaFinal == 5){
                result = valor * 5110; //euros a peso
            }
            if(divisaInicial == 0 && divisaFinal == 2){ // peso colombiano a libras esterlinas
                result = valor * 0.17;
            }else if(divisaInicial == 3 && divisaFinal == 5 ){
                result = valor  * 5808; // libras esterlinas a peso colombiano
            }
            if(divisaInicial == 0 && divisaFinal == 3){ // peso colombiano a yen japones
            result = valor * 0.28; 
            }else if( divisaInicial == 4 && divisaFinal == 5){
                result = valor * 3633; //yen japones a peso colombiano
            }
            if(divisaInicial == 0 && divisaFinal == 4){ //peso colombiano a won sul-coreano
                result = valor * 367;
            }
            
           
            //return result;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, result);
        }
        return result;
    }
}

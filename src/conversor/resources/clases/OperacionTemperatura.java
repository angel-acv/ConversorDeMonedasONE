/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.resources.clases;

/**
 *
 * @author Angel
 */
public class OperacionTemperatura {
    private double valotTempe, resulTempe;
    private int tempeOptionValor;

    public double getValotTempe() {
        return valotTempe;
    }

    public void setValotTempe(double valotTempe) {
        this.valotTempe = valotTempe;
    }

    public double getResulTempe() {
        return resulTempe;
    }

    public void setResulTempe(double resulTempe) {
        this.resulTempe = resulTempe;
    }

    public int getTempeOptionValor() {
        return tempeOptionValor;
    }

    public void setTempeOptionValor(int tempeOptionValor) {
        this.tempeOptionValor = tempeOptionValor;
    }

    public double OperacionTemperatura() {
        
        switch (tempeOptionValor) {
            case 0:
                resulTempe = valotTempe * 9/5 +32;
                break;
            case 1:
                resulTempe = valotTempe + 273.15;
                break;
            case 2:
                resulTempe = valotTempe * 9/5 + 491.67;
                break;
            case 3:
                resulTempe = ( valotTempe - 31) * 5/9;
                break;
            case 4:
                resulTempe = (valotTempe + 459.67) * 5/9 ;
                break;
            case 5:
                resulTempe = valotTempe + 459.67;
                break;
        }
        
        return resulTempe;
    }
    
    
}

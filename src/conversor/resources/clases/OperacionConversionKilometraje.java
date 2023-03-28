/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor.resources.clases;

/**
 *
 * @author Angel
 */
public class OperacionConversionKilometraje {
    private double valorKilo, resultKilome;
    private int optionKilometraje;

    public double getValorKilo() {
        return valorKilo;
    }

    public void setValorKilo(double valorKilo) {
        this.valorKilo = valorKilo;
    }

    public double getResultKilome() {
        return resultKilome;
    }

    public void setResultKilome(double resultKilome) {
        this.resultKilome = resultKilome;
    }

    public int getOptionKilometraje() {
        return optionKilometraje;
    }

    public void setOptionKilometraje(int optionKilometraje) {
        this.optionKilometraje = optionKilometraje;
    }

    public double OperacionConversionKilometraje() {
        
        switch (optionKilometraje) {
            case 0:
                    resultKilome = valorKilo * 1000; 
                break;
            case 1 :
                    resultKilome = valorKilo * 100;
                break;
            case 2:
                    resultKilome = valorKilo * 10;
                break;
            case 3:
                    resultKilome = valorKilo / 10;
                break;
            case 4:
                    resultKilome = valorKilo / 100;
                break;
            case 5:
                    resultKilome = valorKilo / 1000;
                break;
        }
        
        return resultKilome;
    }
    
    
    
}

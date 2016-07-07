/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My User
 */
public class RadioMain implements Radio{
    private boolean State;
    private boolean FM;
    private double Dial;
    private double SelectedButton;
    private double Button1;
    private double Button2;
    private double Button3;
    private double Button4;
    private double Button5;
    private double Button6;
    private double Button7;
    private double Button8;
    private double Button9;
    private double Button10;
    private double Button11;
    private double Button12;
    
    /**
     * Constructor
     */
    public RadioMain(){
        State = false;
        FM = true;
        Dial = 87.9;
        SelectedButton = 1;
    }

    @Override
    /**
     * Metodo para encender el radio
     */
    public void radioON() {
        State = true;
    }

    @Override
    /**
     * Metodo para cambiar de frecuencia FM a AM o viceversa
     */
    public void changeFrequency() {
        if (FM){
            FM = false;
            Dial = 530;
        } else {
            FM = true;
            Dial = 87.9;
        }
    }

    @Override
    /**
     * Metodo para avanzar en el dial del radio
     */
    public void avanzarDial() {
        if (FM){
            if (Dial < 107.9){
                Dial = Dial + 0.2;
            } else if (Dial == 107.9){
                Dial = 87.9;
            }
        } else if (!FM){
            if (Dial < 1610){
                Dial = Dial + 10;
            } else if (Dial == 1610){
                Dial = 530;
            }
        }
    }

    @Override
    /**
     * Metodo para guardar emisora en boton especifico
     */
    public void guardarEmisora() {
        if (SelectedButton == 1){
            Button1 = Dial;
        } else if (SelectedButton == 2){
            Button2 = Dial;
        } else if (SelectedButton == 3){
            Button3 = Dial;
        } else if (SelectedButton == 4){
            Button4 = Dial;
        } else if (SelectedButton == 5){
            Button5 = Dial;
        } else if (SelectedButton == 6){
            Button6 = Dial;
        } else if (SelectedButton == 7){
            Button7 = Dial;
        } else if (SelectedButton == 8){
            Button8 = Dial;
        } else if (SelectedButton == 9){
            Button9 = Dial;
        } else if (SelectedButton == 10){
            Button10 = Dial;
        } else if (SelectedButton == 11){
            Button11 = Dial;
        } else if (SelectedButton == 12){
            Button12 = Dial;
        }
    }

    @Override
    /**
     * Metodo para seleccionar emisora dependiendo del boton presionado
     */
    public void seleccionarEmisora() {
        if (SelectedButton == 1){
            Dial = Button1;
        } else if (SelectedButton == 2){
            Dial = Button2;
        } else if (SelectedButton == 3){
            Dial = Button3;
        } else if (SelectedButton == 4){
            Dial = Button4;
        } else if (SelectedButton == 5){
            Dial = Button5;
        } else if (SelectedButton == 6){
            Dial = Button6;
        } else if (SelectedButton == 7){
            Dial = Button7;
        } else if (SelectedButton == 8){
            Dial = Button8;
        } else if (SelectedButton == 9){
            Dial = Button9;
        } else if (SelectedButton == 10){
            Dial = Button10;
        } else if (SelectedButton == 11){
            Dial = Button11;
        } else if (SelectedButton == 12){
            Dial = Button12;
        }
    }

    @Override
    /**
     * Metodo para apagar el radio
     */
    public void radioOFF() {
        State = false;
    }
}

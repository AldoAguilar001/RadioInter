/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author My User
 */
public class RadioMain implements Radio {
    
    //Atributos
    private boolean ON;
    private boolean FM;
    private double Dial;
    private double button1;
    private double button2;
    private double button3;
    private double button4;
    private double button5;
    private double button6;
    private double button7;
    private double button8;
    private double button9;
    private double button10;
    private double button11;
    private double button12;
    private double button1AM;
    private double button2AM;
    private double button3AM;
    private double button4AM;
    private double button5AM;
    private double button6AM;
    private double button7AM;
    private double button8AM;
    private double button9AM;
    private double button10AM;
    private double button11AM;
    private double button12AM;
    private int selectedButton;
    
    /**
     * Constructor RadioMain
     */
    public RadioMain(){
        this.ON = false;
        this.FM = true;
        this.button1 = 87.9;
        this.button2 = 87.9;
        this.button3 = 87.9;
        this.button4 = 87.9;
        this.button5 = 87.9;
        this.button6 = 87.9;
        this.button7 = 87.9;
        this.button8 = 87.9;
        this.button9 = 87.9;
        this.button10 = 87.9;
        this.button11 = 87.9;
        this.button12 = 87.9;
        this.button1AM = 87.9;
        this.button2AM = 87.9;
        this.button3AM = 87.9;
        this.button4AM = 87.9;
        this.button5AM = 87.9;
        this.button6AM = 87.9;
        this.button7AM = 87.9;
        this.button8AM = 87.9;
        this.button9AM = 87.9;
        this.button10AM = 87.9;
        this.button11AM = 87.9;
        this.button12AM = 87.9;
        this.Dial = 87.9;
        this.selectedButton = 0;
    }

    @Override
    /**
     * Metodo para encender el radio
     */
    public void ON() {
        this.ON = true;
    }

    @Override
    /**
     * Metodo para apagar el radio
     */
    public void OFF() {
        this.ON = false;
    }

    @Override
    /**
     * Para determinar estado de radio
     */
    public boolean isON() {
        boolean on = this.ON;
        return on;
    }

    @Override
    /**
     * Retorna la frecuencia en la que se encuentra el radio
     */
    public String getFrequency() {
        String fm = "FM";
        String am = "AM";
        if (FM){
            return fm;
        } else {
            return am;
        }
    }

    @Override
    /**
     * Cambia la frecuencia del radio
     */
    public void changeFrequency(String freq) {
        if (freq.equals("FM")){
            this.FM = true;
        } else if (freq.equals("AM")){
            this.FM = false;
        } else {
            System.out.println("Error: Mal ingreso. RadioMain ln.76");
        }
    }

    @Override
    /**
     * Retorna la estacion guardada en el boton
     */
    public String getStation() {
        String station = Double.toString(Dial);
        return station;
    }

    @Override
    /**
     * wefwef
     */
    public void setStation(String dial) {
        this.Dial = Double.parseDouble(dial);
    }

    @Override
    public void Forward() {
        if (FM){
            if (this.Dial < 107.9){
                this.Dial = this.Dial + 0.2;
            } else if (this.Dial == 107.9){
                this.Dial = 87.9;
            }
        } else {
            if (this.Dial < 1610){
                this.Dial = this.Dial + 10;
            } else if (this.Dial == 1610){
                this.Dial = 530;
            }
        }
    }

    @Override
    public void Backward() {
        if (FM){
            if (this.Dial > 87.9){
                this.Dial = this.Dial - 0.2;
            } else if (this.Dial == 87.9){
                this.Dial = 107.9;
            }
        } else {
            if (this.Dial > 530){
                this.Dial = this.Dial - 10;
            } else if (this.Dial == 530){
                this.Dial = 1610;
            }
        }
    }

    @Override
    public void setMemory(String station, int position, String freq) {
        this.Dial = Double.parseDouble(station);
        if (FM){
            switch(position){
                case 1:
                    this.button1 = Dial;
                case 2:
                    this.button2 = Dial;
                case 3:
                    this.button3 = Dial;
                case 4:
                    this.button4 = Dial;
                case 5:
                    this.button5 = Dial;
                case 6:
                    this.button6 = Dial;
                case 7:
                    this.button7 = Dial;
                case 8:
                    this.button8 = Dial;
                case 9:
                    this.button9 = Dial;
                case 10:
                    this.button10 = Dial;
                case 11:
                    this.button11 = Dial;
                case 12:
                    this.button12 = Dial;
            }
        } else {
            switch(position){
                case 1:
                    this.button1AM = Dial;
                case 2:
                    this.button2AM = Dial;
                case 3:
                    this.button3AM = Dial;
                case 4:
                    this.button4AM = Dial;
                case 5:
                    this.button5AM = Dial;
                case 6:
                    this.button6AM = Dial;
                case 7:
                    this.button7AM = Dial;
                case 8:
                    this.button8AM = Dial;
                case 9:
                    this.button9AM = Dial;
                case 10:
                    this.button10AM = Dial;
                case 11:
                    this.button11AM = Dial;
                case 12:
                    this.button12AM = Dial;
            }
        } 
    }
}

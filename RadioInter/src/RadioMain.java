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
    private int selectedButton;

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
    public String getStation() {
        String station = Double.toString(Dial);
        return station;
    }

    @Override
    public void setStation() {
        switch(this.selectedButton){
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMemory(String station, int position, String freq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

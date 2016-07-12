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
    public String getFrequency() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void changeFrequency(String freq) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getStation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setStation() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Forward() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

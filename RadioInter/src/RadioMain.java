
import java.text.DecimalFormat;

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
        this.button1AM = 530;
        this.button2AM = 530;
        this.button3AM = 530;
        this.button4AM = 530;
        this.button5AM = 530;
        this.button6AM = 530;
        this.button7AM = 530;
        this.button8AM = 530;
        this.button9AM = 530;
        this.button10AM = 530;
        this.button11AM = 530;
        this.button12AM = 530;
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
                double dial = this.Dial + 0.2;
                DecimalFormat form = new DecimalFormat("###.##");
                String dial2 = form.format(dial);
                this.Dial = Double.parseDouble(dial2);
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
                double dial = this.Dial - 0.2;
                DecimalFormat form = new DecimalFormat("###.##");
                String dial2 = form.format(dial);
                this.Dial = Double.parseDouble(dial2);
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

    /**
     * @return the button1
     */
    public double getButton1() {
        return button1;
    }

    /**
     * @return the button2
     */
    public double getButton2() {
        return button2;
    }

    /**
     * @return the button3
     */
    public double getButton3() {
        return button3;
    }

    /**
     * @return the button4
     */
    public double getButton4() {
        return button4;
    }

    /**
     * @return the button5
     */
    public double getButton5() {
        return button5;
    }

    /**
     * @return the button6
     */
    public double getButton6() {
        return button6;
    }

    /**
     * @return the button7
     */
    public double getButton7() {
        return button7;
    }

    /**
     * @return the button8
     */
    public double getButton8() {
        return button8;
    }

    /**
     * @return the button9
     */
    public double getButton9() {
        return button9;
    }

    /**
     * @return the button10
     */
    public double getButton10() {
        return button10;
    }

    /**
     * @return the button11
     */
    public double getButton11() {
        return button11;
    }

    /**
     * @return the button12
     */
    public double getButton12() {
        return button12;
    }

    /**
     * @return the button1AM
     */
    public double getButton1AM() {
        return button1AM;
    }

    /**
     * @return the button2AM
     */
    public double getButton2AM() {
        return button2AM;
    }

    /**
     * @return the button3AM
     */
    public double getButton3AM() {
        return button3AM;
    }

    /**
     * @return the button4AM
     */
    public double getButton4AM() {
        return button4AM;
    }

    /**
     * @return the button5AM
     */
    public double getButton5AM() {
        return button5AM;
    }

    /**
     * @return the button6AM
     */
    public double getButton6AM() {
        return button6AM;
    }

    /**
     * @return the button7AM
     */
    public double getButton7AM() {
        return button7AM;
    }

    /**
     * @return the button8AM
     */
    public double getButton8AM() {
        return button8AM;
    }

    /**
     * @return the button9AM
     */
    public double getButton9AM() {
        return button9AM;
    }

    /**
     * @return the button10AM
     */
    public double getButton10AM() {
        return button10AM;
    }

    /**
     * @return the button11AM
     */
    public double getButton11AM() {
        return button11AM;
    }

    /**
     * @return the button12AM
     */
    public double getButton12AM() {
        return button12AM;
    }

    /**
     * @param ON the ON to set
     */
    public void setON(boolean ON) {
        this.ON = ON;
    }

    /**
     * @param button1 the button1 to set
     */
    public void setButton1(double button1) {
        this.button1 = button1;
    }

    /**
     * @param button2 the button2 to set
     */
    public void setButton2(double button2) {
        this.button2 = button2;
    }

    /**
     * @param button3 the button3 to set
     */
    public void setButton3(double button3) {
        this.button3 = button3;
    }

    /**
     * @param button4 the button4 to set
     */
    public void setButton4(double button4) {
        this.button4 = button4;
    }

    /**
     * @param button5 the button5 to set
     */
    public void setButton5(double button5) {
        this.button5 = button5;
    }

    /**
     * @param button6 the button6 to set
     */
    public void setButton6(double button6) {
        this.button6 = button6;
    }

    /**
     * @param button7 the button7 to set
     */
    public void setButton7(double button7) {
        this.button7 = button7;
    }

    /**
     * @param button8 the button8 to set
     */
    public void setButton8(double button8) {
        this.button8 = button8;
    }

    /**
     * @param button9 the button9 to set
     */
    public void setButton9(double button9) {
        this.button9 = button9;
    }

    /**
     * @param button10 the button10 to set
     */
    public void setButton10(double button10) {
        this.button10 = button10;
    }

    /**
     * @param button11 the button11 to set
     */
    public void setButton11(double button11) {
        this.button11 = button11;
    }

    /**
     * @param button12 the button12 to set
     */
    public void setButton12(double button12) {
        this.button12 = button12;
    }

    /**
     * @param button1AM the button1AM to set
     */
    public void setButton1AM(double button1AM) {
        this.button1AM = button1AM;
    }

    /**
     * @param button2AM the button2AM to set
     */
    public void setButton2AM(double button2AM) {
        this.button2AM = button2AM;
    }

    /**
     * @param button3AM the button3AM to set
     */
    public void setButton3AM(double button3AM) {
        this.button3AM = button3AM;
    }

    /**
     * @param button4AM the button4AM to set
     */
    public void setButton4AM(double button4AM) {
        this.button4AM = button4AM;
    }

    /**
     * @param button5AM the button5AM to set
     */
    public void setButton5AM(double button5AM) {
        this.button5AM = button5AM;
    }

    /**
     * @param button6AM the button6AM to set
     */
    public void setButton6AM(double button6AM) {
        this.button6AM = button6AM;
    }

    /**
     * @param button7AM the button7AM to set
     */
    public void setButton7AM(double button7AM) {
        this.button7AM = button7AM;
    }

    /**
     * @param button8AM the button8AM to set
     */
    public void setButton8AM(double button8AM) {
        this.button8AM = button8AM;
    }

    /**
     * @param button9AM the button9AM to set
     */
    public void setButton9AM(double button9AM) {
        this.button9AM = button9AM;
    }

    /**
     * @param button10AM the button10AM to set
     */
    public void setButton10AM(double button10AM) {
        this.button10AM = button10AM;
    }

    /**
     * @param button11AM the button11AM to set
     */
    public void setButton11AM(double button11AM) {
        this.button11AM = button11AM;
    }

    /**
     * @param button12AM the button12AM to set
     */
    public void setButton12AM(double button12AM) {
        this.button12AM = button12AM;
    }
}

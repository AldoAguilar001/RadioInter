/*
 * Titulo: Radio.java
 * Fecha: 06 de julio del 2016
 * Descripcion: Interface de Radio
 */

/**
 * @author Esteban Avalos
 * @author Antonio Ixtecoc
 * @author Aldo Aguilar N.
 */
public interface Radio {
    public void ON();
    public void OFF();
    public boolean isON();
    public String getFrequency();
    public void changeFrequency(String freq);
    public String getStation();
    public void setStation(String dial);
    public void Forward();
    public void Backward();
    public void setMemory(String station, int position, String freq);
    public String toString();
} 

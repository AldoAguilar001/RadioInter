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
    public void radioON(); /* Metodo para prender radio */
    public void changeFrequency(); /* Metodo para cambiar de FM a AM */
    public void avanzarDial(); /* Metodo para avanzar en dial del radio FM(87.9-107.9; +0.2) o AM(530-1610; +10) */
    public void guardarEmisora(); /* Metodo para guardar emisora en un boton de 12 botones disponibles */
    public void seleccionarEmisora(); /* Metodo para seleccionar emisora dependiendo de boton seleccionado */
    public void radioOFF(); /* Metodo para apagar radio */
}

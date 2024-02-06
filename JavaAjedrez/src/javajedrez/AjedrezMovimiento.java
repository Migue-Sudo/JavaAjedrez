/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javajedrez;

/**
 *
 * @author javie
 */
public class AjedrezMovimiento extends Movimiento{
    private int desde;
    private int hasta;
    private boolean captura;
    public int cambio;
    
    public AjedrezMovimiento(int desde, int hasta , boolean captura ,int cambio ){
        this.desde = desde;
        this.hasta = hasta;
        this.captura = captura;
        this.cambio = cambio;
    }
    
}

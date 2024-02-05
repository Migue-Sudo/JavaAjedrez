/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javajedrez;

/**
 *
 * @author javie
 */
public class Ajedrez {
    private static int[] tableroInicial= {
 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
 4, 2, 3, 5, 9, 3, 2, 4, 7, 7, // piezas negras (son de MAX)
 1, 1, 1, 1, 1, 1, 1, 1, 7, 7, // peones negros
 0, 0, 0, 0, 0, 0, 0, 0, 7, 7, // 8 cuadros vacíos y su relleno
 0, 0, 0, 0, 0, 0, 0, 0, 7, 7, // 8 cuadros vacíos y su relleno
 0, 0, 0, 0, 0, 0, 0, 0, 7, 7, // 8 cuadros vacíos y su relleno
 0, 0, 0, 0, 0, 0, 0, 0, 7, 7, // 8 cuadros vacíos y su relleno
 -1, -1, -1, -1, -1, -1, -1, -1, 7, 7, // peones blancos
 -4, -2, -3, -5, -9, -3, -2, -4, 7, 7, // piezas blancas (son de MIN)
 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7,
 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7
};
}

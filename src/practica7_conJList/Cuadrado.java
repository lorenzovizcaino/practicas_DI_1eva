package practica7_conJList;

import java.awt.*;

public class Cuadrado {

    private int posicion;
    private int x;
    private int y;
    private int distancia;
    private Color colorBorde;
    private Color colorInterior;

    public Cuadrado(int posicion, int x, int y, int distancia, Color colorBorde,Color colorInterior) {
        this.posicion = posicion;
        this.x = x;
        this.y = y;
        this.distancia = distancia;
        this.colorBorde=colorBorde;
        this.colorInterior=colorInterior;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Color getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(Color colorBorde) {
        this.colorBorde = colorBorde;
    }

    public Color getColorInterior() {
        return colorInterior;
    }

    public void setColorInterior(Color colorInterior) {
        this.colorInterior = colorInterior;
    }
}

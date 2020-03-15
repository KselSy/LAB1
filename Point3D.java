package com.company;
/**
 * трёхмерный класс точки.
 **/
public class Point3D extends Point2D {
    /** координата Z **/
    private double zCoord;
    /** Конструктор инициализации **/
    public Point3D ( double x, double y, double z) {
        setX(x);
        setY(y);
        zCoord = z;
    }
    /** Конструктор по умолчанию. **/
    public Point3D () {
//Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0, 0);
    }
    /** Возвращение координаты Z **/
    public double getZ() {
        return zCoord;
    }
    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        zCoord = val;
    }
    /** Метод для сравнения значений двух объектов Point3d **/
    public boolean Compare(Point3D point1){
        boolean a = false;
        if (point1.getX() == getX() && point1.getY() == getY() && point1.getZ() == zCoord)
            a = true;
        return a;
    }
    /** Метод для вычисления расстояния между двумя объектами Point3d **/
    public double distanceTo(Point3D point1){
        double a = (point1.getX()-getX())*(point1.getX()-getX())+(point1.getY()-getY())*(point1.getY()-getY())+(point1.getZ()-zCoord)*(point1.getZ()-zCoord);
        double b = Math.sqrt(a);
        return b;
    }


}

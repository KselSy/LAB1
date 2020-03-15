package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static double area() {
        double s = 0;
        ArrayList<Point3D> pointList = new ArrayList<Point3D>();
        System.out.println("Input first point");
        pointList.add(0, create());
        System.out.println("Input second point");
        pointList.add(1, create());
        System.out.println("Input third point");
        pointList.add(2, create());
        if(pointList.get(0).Compare(pointList.get(1))==false && pointList.get(0).Compare(pointList.get(2))==false && pointList.get(1).Compare(pointList.get(2))==false){
            double a = pointList.get(0).distanceTo(pointList.get(1));
            double b = pointList.get(0).distanceTo(pointList.get(2));
            double c = pointList.get(1).distanceTo(pointList.get(2));
            double p = (a+b+c)/2;
            s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }
        else System.out.println("two or more points match");
        return s;
    }
    public static Point3D create(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input x");
        double x = in.nextDouble();
        System.out.println("Input y");
        double y = in.nextDouble();
        System.out.println("Input z");
        double z = in.nextDouble();
        Point3D a = new Point3D(x,y,z);
        return a;
    }
}
//point.add(1, ); point.set(1, ); point.get(1, );
package net.absoft.discriminant;

public class Solution {
    private int a, b, c;
    private double d, x1, x2;


    public Solution (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        d = b*b-4*a*c;
        if (d<0) {
            Double x1 = null;
            Double x2 = null;
            return;
        } else if (d==0){
            x1 = (-1)*b/2*a;
            x2 = x1;
        } else {
            x1 = ((-1)*b-Math.sqrt(d))/2*a;
            x2 = ((-1)*b+Math.sqrt(d))/2*a;
        }
        System.out.println("x1=" + x1);
        System.out.println("x2=" + x2);

    }

    public Integer getA() {
        return a;
    }
    public void setA() {
        if (a!=0) {
            this.a = a;
        } else {
            return;
        }
    }
    public Integer getB() {
        return b;
    }
    public void setB() {
        this.b = b;
    }
    public Integer getC() {
        return c;
    }
    public void setC() {
        this.c =c;
    }


    public Double getX1() {
        if (d<0||a==0) {
            return null;
        }
        return x1;
    }

    public void setX1(double x1) {
        if (d<0) {
            return;
        } else if (d==0){
            x1 = (-1)*b/2*a;
        } else {
            x1 = ((-1)*b-Math.sqrt(d))/2*a;
        }
        this.x1 = x1;
    }
    public Double getX2() {
        if (d<0||a==0) {
            return null;
        }
        return x2;
    }

    public void setX2(double x2) {
        if (d<0) {
            return;
        } else if (d==0){
            x2 = x1;
        } else {
            x2 = ((-1)*b+Math.sqrt(d))/2*a;
        }
        this.x2 = x2;
    }
}

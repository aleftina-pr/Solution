package net.absoft;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    private int a, b, c;
    private double d, x1, x2;


    public Map<String, Double> solution(int a, int b, int c) {
        if (a == 0) {
            throw new IllegalArgumentException("a cannot be 0!");
        }
        this.a = a;
        this.b =b;
        this.c = c;
        d = b*b-4*a*c;
        if (d<0) {
            return null;
        } else if (d==0){
            x1 = (-1)*b/2*a;
            x2 = x1;
        } else {
            x1 = ((-1)*b-Math.sqrt(d))/2*a;
            x2 = ((-1)*b+Math.sqrt(d))/2*a;
        }
        Map<String,Double> solution = new HashMap<>();
        solution.put("x1",x1);
        solution.put("x2",x2);

        return solution;

    }

    /*public void setSolutionValues(double d, double x1, double x2){
        this.d=d;
        this.x1=x1;
        this.x2=x2;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Solution solution = (Solution) o;
        return Double.compare(solution.x1, x1) == 0 && Double.compare(solution.x2, x2) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, x2);
    }
}

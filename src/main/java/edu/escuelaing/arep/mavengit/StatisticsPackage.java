package edu.escuelaing.arep.mavengit;

import java.util.Collection;

public class StatisticsPackage {


    public static Double calculateMean(Collection<Double> list){
        Double ans = 0d;
        int n = list.size();
        for(Double d: list) {
            ans += d;
        }
        return ans/n;
    }

    public static Double calculateDeviation(Collection<Double> list, double mean){
        Double ans = 0d;
        int n = list.size();
        for(Double d: list){
            ans+=Math.pow(d-mean, 2);
        }
        ans = ans /(n-1);
        return Math.sqrt(ans);
    }


    public static double calculateDeviation(Collection<Double> list){
        return calculateDeviation(list, calculateMean(list));
    }

    public static void main(String[] args){
        LinkedList<Double> l = new LinkedList<Double>();
        l.add(1.3);
        l.add(4.7654);
        l.add(33444d);
        System.out.println(calculateMean(l));
    }
}

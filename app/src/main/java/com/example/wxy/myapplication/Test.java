package com.example.wxy.myapplication;

/**
 * Created by wxy on 2017/5/21.
 */

public class Test {

    //a是底数，b是阶数
    public double factorial (double a,int b){
        double sum=1d;
        for (int i=1;i<=b;i++){
            sum=sum*a;
        }
        return sum;
    }























    public double power(double a,int b){
        if (b==0)return 1;
        if (b==1)return a;
        if ((b&1)==0)return power(a*a,b>>1);
        else return a*power(a*a,b>>1);

    }

    public double power1(double a,int b){
        double result=1d;
        while (b>0){
            if ((b&1)==1){
                result=result*a;
            }
            a=a*a;
            b=b>>1;
        }
        return result;
    }

    public static void main(String args[]){
        Test test=new Test();
        System.out.println(test.power(2d,5));
        System.out.println(test.power1(2d,5));
        System.out.println(test.factorial(2d,5));
    }
}

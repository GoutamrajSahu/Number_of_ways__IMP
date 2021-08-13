
//A naughty kid is climbing a staircase of 'n' steps.
//        He can take either 1 step or 2 steps at a time.
//        write a program to find the number of distinct ways to reach the nth step.
//        Assuse he is standing on the 0th step.
//
//        Example:
//        input n = 1
//        output: 1
//
//        input: n = 2
//        Output: 2
//        Explanation:(1,1) and (2)
//
//        input: n = 4
//        Output: 5
//        Explanation:(1,1,1,1),(1,1,2),(2,1,1),(1,2,1) and (2,2)


package com.company;
import java.util.*;
class Main {
    static int getWays(int n){
        if(n<=1){
            return n;
        }
        return getWays(n-1)+getWays(n-2);
    }
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter number of stair: ");
        int stairSteps = Sc.nextInt();
        int res = 0;
        res = getWays(stairSteps+1);
        System.out.println(res);
    }
}
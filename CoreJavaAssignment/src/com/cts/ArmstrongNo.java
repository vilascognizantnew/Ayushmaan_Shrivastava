package com.cts;

import java.util.*;
public class ArmstrongNo{
    public static void main(String[] args) {
        int num,originalNum, remainder, result = 0;
        
        System.out.println("Enter a no:");
        
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        s.close();
        originalNum = num;
        while (originalNum != 0)
        {
            remainder = originalNum % 10;
            result += Math.pow(remainder, 3);
            originalNum /= 10;
        }   
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");
    }
}

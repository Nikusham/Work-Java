package BTU;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Algorithm {

    public void Method() {
        var scanner = new Scanner(System.in);
        System.out.print("Value for a: ");
        var a = scanner.nextInt();
        System.out.print("Value for b: ");
        var b = scanner.nextInt();

        if(a > b) {
            var temp = a;
            a = b;
            b = temp;
        }
        int[] array = new int[40];
        List<Integer> oddNumbers = new ArrayList<Integer>();
        List<Integer> evenNumbers = new ArrayList<Integer>();
        var r = new Random();
        for(var i = 0; i < 40; i++) {
            array[i] = r.nextInt(b - a) + a;
        }
        for(var i = 0; i < array.length; i ++) {
            if(array[i] % 2 == 0) {
                evenNumbers.add(array[i]);
            }
            else if(array[i] % 2 == 1) {
                oddNumbers.add(array[i]);
            }
        }
        System.out.println("Odd Numbers: " + oddNumbers.size());
        System.out.println("Even Numbers: " + evenNumbers.size());

        var oddSum = 0;
        var evenSum = 0;
        for (var odd: oddNumbers) {
            oddSum += odd;
        }
        for(var even : evenNumbers) {
            evenSum += even;
        }
        System.out.println("Odd Numbers sum: " + oddSum);
        System.out.println("Even Numbers sum: " + evenSum);

        if(oddSum > evenSum) {
            var temp = oddSum;
            oddSum = evenSum;
            evenSum = temp;
        }
        System.out.println("printing random 5 values inbetween: ");
        for(var i =0; i < 5; i ++) {
            var random = r.nextInt(evenSum - oddSum) + oddSum;
            System.out.println(random);
        }

    }
}

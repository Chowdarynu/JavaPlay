package com.test.core.pgms;

public class MissingNumberInArray {
    static int sumOfNnumbers(int n) {
        int sum = (n * (n + 1)) / 2;

        return sum;
    }

    static int sumOfElements(int[] array) {
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 8;
        int[] a = {1, 2, 5, 3, 7, 8, 6};
        int sumOfNnumbers = sumOfNnumbers(n);
        int sumOfElements = sumOfElements(a);
        int missingNumber = sumOfNnumbers - sumOfElements;

        System.out.println("Missing Number is = " + missingNumber);
        int ret = missingNumberUsingXOR(a);
        System.out.println("Missing Number using XOR is = " + ret);
    }

    private static int missingNumberUsingXOR(int[] a) {
        int val = 0;
        for(int i=0;i<a.length;i++){
            if(a[i] != 0){
                val ^=a[i];
                val ^=(i+1);
            }
        }
        return val;


    }
}

   /* int XOR = 0;
for(int i=0; i<100; i++) {
        if (ARRAY[i] != 0)
        XOR ^= ARRAY[i];
        XOR ^= (i + 1);
        }
        return XOR;*/
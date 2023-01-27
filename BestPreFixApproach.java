package com.example.dog;

public class BestPreFixApproach {
    public static void main(String[] args) {
        int [] arr={1,2,3,4};
        int n= arr.length;
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        System.out.println("Best Approach Look Below:");
        for (int j : arr) {
            System.out.print(j + " ");

        }
    }
}

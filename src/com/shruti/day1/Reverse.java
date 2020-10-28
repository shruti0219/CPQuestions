package com.shruti.day1;

import java.util.Arrays;

public class Reverse {                    //O(n)
    public static void rearrange(int a[]){
        int j = 0,temp;
        for (int i = 0; i < a.length; i++) {
            if(a[i]<0){
                if(i != j){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }

    public static void reverseArray(int a[]){                        //O(n)
        int start = 0,end = a.length-1,temp;
        while(start<end){
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static int Duplicate(int a[]){                     //O(nlogn)
        Arrays.sort(a);
        for (int i = 1; i < a.length; i++) {
            if(a[i] == a[i-1]){
                return a[i];
            }
        }
        return -1;
    }

    public static void printArray(int a[]){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();
    }

    public static void sortd(int a[]){                 //O(n)
        int i,ct1=0,ct2=0,ct3=0;
        for (int j = 0; j < a.length; j++) {
            switch(a[j]){
                case 0 : ct1++;break;
                case 1 : ct2++;break;
                case 2 : ct3++;break;
            }
        }
        i =0;
        while (ct1>0){
            a[i++] = 0;
            ct1--;
        }
        while (ct2>0){
            a[i++] = 1;
            ct2--;
        }
        while (ct3>0){
            a[i++] = 2;
            ct3--;
        }
        printArray(a);
    }

    public static int ksmallest(int a[],int k){              //O(nlogn)
        Arrays.sort(a);
        return(a[k-1]);
    }

    public static void main(String[] args) {
	    int a[] = {7, 10, 4, 3, 20, 15};
//	    int x = Duplicate(a);
//        System.out.println(x);
//        sortd(a);
        System.out.println(ksmallest(a,3));
    }
}

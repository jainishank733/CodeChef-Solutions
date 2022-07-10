package com.example.JulyLongOne2022Division4;

// https://www.codechef.com/JULY221D/problems/AUCTION

import java.util.*;

public class Bidding{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            while (n--!=0){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                HashMap<Integer, String> h = new HashMap<Integer, String>();
                h.put(a, "Alice");
                h.put(b, "Bob");
                h.put(c, "Charlie");
                int ans = (int)Math.max(a, Math.max(b, c));
                System.out.println(h.get(ans));
            }
        }catch (Exception e) {
            System.out.println();
        }
    }

}

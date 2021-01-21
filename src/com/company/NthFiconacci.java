package com.company;

public class NthFiconacci {
    static int n1 = 0, n2 = 1, n3 = 0;
    public static int getNthFib(int n) {
        n1 = 0;
        n2 = 1;
        n3 = 0;
        if(n == 2){
            return 1;
        }
        if (n == 1){
            return 0;
        }
        Ficonacci(n);
        return n3;

    }
    public static void Ficonacci(int n) {
        if (n > 2) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            Ficonacci(n - 1);
        }
    }


}

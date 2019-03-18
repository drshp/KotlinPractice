package interoperaibility;

import static interoperaibility.KtfibKt.deffunvol;

public class javfun {
    public static void main(String[]args) {
        System.out.println("Default vol= " + deffunvol(5, 7));
        System.out.println("UnDefault vol= " + deffunvol(5, 7, 9));
    }

    public static void fib(int n){
        int i=1,j=1,k, t;
        System.out.print(i+" "+j+" ");

        for(k=2; k<7;k++){
            t=j+i;
            System.out.print(t+" ");
            i=j;
            j=t;

    }
}
}

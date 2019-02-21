package sort;

public class Heap {
    public static void sink(Comparable[] a,int k,int N){
        while (2*k+1<=N-1){
            int j=2*k+1;
            if(j<N-1&&Exampl.less(a[j],a[j+1]))j++;
            if(!Exampl.less(a[k],a[j]))
                break;
            Exampl.exch(a, k, j);
            k=j;
        }
    }
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int k=(N-2)/2;k>=0;k--)
            sink(a,k,N);
        while (N>1){
            Exampl.exch(a,0,--N);
            sink(a,0,N);
        }
        Exampl.show(a);
    }
}

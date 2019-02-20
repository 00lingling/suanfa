package sort;
//时间复杂度为0（N^2）
public class Selection {
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=0;i<N;i++){
            int min=i;
            for(int j=i+1;j<N;j++){
                if(Exampl.less(a[j],a[min]))
                    min=j;
            }
            Exampl.exch(a,i,min);
        }
        Exampl.show(a);
    }
}

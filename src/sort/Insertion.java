package sort;
//最好时间复杂度为0（N^2），最好时间复杂度为0（N）;平均时间复杂度为0（N^2）
public class Insertion {
    public static void sort(Comparable[] a){
        int N=a.length;
        for(int i=1;i<N;i++){
            for(int j=i;j>0&&Exampl.less(a[j],a[j-1]);j--){
                Exampl.exch(a,j,j-1);
            }
        }
        Exampl.show(a);
    }
}

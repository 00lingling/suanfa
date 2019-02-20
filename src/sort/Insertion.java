package sort;
//最高时间复杂度为0（N^2），最低时间复杂度为0（N）
//适用于小规模且部分有序的数组
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

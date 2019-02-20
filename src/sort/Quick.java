package sort;
//时间复杂度为O（NlgN）
//适用于随机性更大的数组
//虽然时间复杂度与归并排序相同，但是空间复杂度比归并要低
public class Quick {
    public static void sort(Comparable[] a){
       sort(a,0,a.length-1);
       Exampl.show(a);
    }
    public static void sort(Comparable[] a,int low,int high){
        if(low>=high)return;
        int j=partition(a,low,high);
        sort(a,low,j-1);
        sort(a,j+1,high);
    }
    public static int partition(Comparable[] a,int low,int high){
        int i=low;
        int j=high+1;
        Comparable v=a[low];
        while(true){
            while (Exampl.less(a[++i],v))
                if(i==high)
                    break;
            while (Exampl.less(v,a[--j]))
                    if(j==low)
                        break;
            if(i>=j)
                break;
            Exampl.exch(a,i,j);
        }
        Exampl.exch(a,low,j);
        return j;
    }
}

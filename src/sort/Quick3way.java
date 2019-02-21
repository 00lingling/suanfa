package sort;
//最高时间复杂度为0（NlgN），最低时间复杂度为0（N）
//适用于数组中重复元素较多的情况
public class Quick3way {
    public static void sort(Comparable[] a){
        sort(a,0,a.length-1);
        Exampl.show(a);
    }
    public static void sort(Comparable[] a,int low,int high){
        if(low>=high)return;
        int lt=low;
        int i=low+1;
        int gt=high;
        Comparable v=a[low];
        while(i<=gt){
            if(Exampl.less(a[i],v))
                Exampl.exch(a,i++,lt++);
            else if(Exampl.less(v,a[i]))
                Exampl.exch(a,i,gt--);
            else
                i++;
        }
        sort(a,low,lt-1);
        sort(a,gt+1,high);
    }
}

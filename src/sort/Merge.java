package sort;
//时间复杂度为O（NlgN）
public class Merge {
    public static Comparable[] aux;
    public static void sort(Comparable[] a){
        aux=new Comparable[a.length];
        sort(a,0,a.length-1);
        Exampl.show(a);
    }
    public static void sort(Comparable[] a,int low,int high){
        int middle=low+(high-low)/2;
        if(low>=high)return;
        sort(a,low,middle);
        sort(a,middle+1,high);
        merge(a,low,middle,high);
    }
    public static void merge(Comparable[] a,int low,int middle,int high){
        int i=low;
        int j=middle+1;
        for(int k=low;k<=high;k++)
            aux[k]=a[k];
        for(int m=low;m<=high;m++){
            if(i>middle)
                a[m]=aux[j++];
            else if(j>high)
                a[m]=aux[i++];
            else if(Exampl.less(aux[i],aux[j]))
                a[m]=aux[i++];
            else
                a[m]=aux[j++];
        }
    }
}

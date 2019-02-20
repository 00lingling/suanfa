package sort;
//适用于大规模且乱序的数组
public class Shell {
    public static void sort(Comparable[] a){
        int N=a.length;
        int h=1;
        while(h<N/3)
            h=h*3+1;
        while(h>=1){
            for(int i=h;i<N;i++){
                for(int j=i;j>=h&&Exampl.less(a[j],a[j-h]);j-=h)
                    Exampl.exch(a,j,j-h);
            }
            h=h/3;
        }
        Exampl.show(a);
    }
}

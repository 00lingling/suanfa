package Search;
//适用于小型数组，时间复杂度为O（N)
public class Sequential {
    public static void search(Comparable[] a,Comparable b){
        int index=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==b){
                index=i;
                break;
            }
        }
        System.out.println(index);
    }
}

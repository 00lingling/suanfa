package Search;

//针对有序数组的查找，时间复杂度是0（lgN）
public class Binary {
    public static void search(Comparable[] a, Comparable b){
        int start=0;
        int end=a.length-1;
        int index=-1;
        while(start<=end){
            int mid=(end+start)/2;
            if(a[mid]==b){
                index=mid;
                break;
            }
            else if(Exampl.less(a[mid],b))
                    start=mid+1;
            else
                    end=mid-1;
        }
        System.out.println(index);
    }
}

import sort.Insertion;
import sort.Merge;
import sort.Selection;
import sort.Shell;

public class Main {

    public static void main(String[] args) {
       Integer[] a={1,3,2,6,0,7,2,4};
//        Selection.sort(a);
//        Insertion.sort(a);
//        Shell.sort(a);
        Merge.sort(a);
    }
}

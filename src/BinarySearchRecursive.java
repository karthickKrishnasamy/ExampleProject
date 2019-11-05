import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kkarthick87 on 18-02-2019.
 */
public class BinarySearchRecursive{


  /*  public static boolean binarySearch(int []array, int x, int left , int right ){
        if(right<left){
            return false;
        }
        int mid= (left+right)/2;
    *//* 2   if(x==array[mid]){
            return true;
        }else if(x<array[mid]){
            return binarySearch(array,x,left,mid);
        }else {
            return binarySearch(array,x,mid+1,right);
        }*//*
        List ssd = new ArrayList<>();
        Collections.sort(ssd, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        });
    }

        public static void main(String s[]){

    }
    private String d(){

    }
    public static boolean binarySearch(int[]array, int x){
       return  binarySearch(array,x,0,array.length-1);
    }*/
}

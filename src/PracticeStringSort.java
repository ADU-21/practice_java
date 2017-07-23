import java.util.Arrays;

/**
 * Created by ADU on 2017/7/23.
 */
public class PracticeStringSort {
    public static void main(String args[]){
        String []a = {"Boy", "apple", "Applet","girl","Hat"};
        String []b = Arrays.copyOf(a,a.length);
        System.out.println("使用用户编写的 SortString 类，按字典排序：");
        SortString.sort(a);
        for(String s:a){
            System.out.println("  "+s);
        }
        System.out.println("使用类库中的 Arrays 类，按字典排序：");
        Arrays.sort(b);
        for(String s:b){
            System.out.println("  "+s);
        }
    }
}

class SortString{
    public static void sort(String a[]){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[j].compareTo(a[i])<0){
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

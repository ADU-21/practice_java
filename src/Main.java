import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ADU on 2017/4/25.
 */
public class Main {
    public static void main (String args[]){
//        System.out.println("This is my practice program");
//        Hello hello = new Hello();
//        hello.say("Hi");

//        Scanner reader = new Scanner(System.in);
//        int count = 0;
//        double sum = 0;
//        double input = reader.nextDouble();
//        while(input != 0){
//            count += 1;
//            sum += input;
//            input = reader.nextDouble();
//        }
//        System.out.println(count+":"+sum);

//        int []a = {12,2,3,4,56,7,46,245,6,7,3452,5,12,6,4,2,6,727,0,8,3,};
//        Arrays.sort(a);
//        System.out.print(Arrays.toString(a)+'\n');
//        int number = 46;
//        int index = Arrays.binarySearch(a, number);
//        if(index >= 0){
//            System.out.println(number + "in"+ index);
//        }else{
//            System.out.println(number + "not in");
//        }

//        int i = 1;
//        while (i <= 3){
//            System.out.println(i);
//            i++;

//        int i;
//        for(int j = 2; j <= 50; j++){
//            for (i = 2; i <= j/2; i++) {
//                if (j % i == 0)
//                    break;
//            }
//            if(i > j/2){
//                System.out.println(j);
//            }
//        }

        for(Color a:Color.values()){
            for(Color b:Color.values()){
                for(Color c:Color.values()){
                    if(a != b && b != c && a != c){
                        System.out.print(a+","+b+","+c+"|");
                    }
                }
            }
        }
    }
}
enum Color {
    红, 蓝, 绿, 黄, 黑
}

/**
 * Created by ADU on 2017/7/23.
 */
public class PracticeString {
    public static void main(String args[]){
        int number = 0;
        String s = "asdoliuh,adfga; asdgfads;adf;asdf;asdfa dsfag;afhfgjhu;fytsiu;yhafd;gahwer;";
        for(int k = 0;k < s.length();k++){
            if(s.regionMatches(k,"fa",0,2)){
                number ++;
            }
        }
        System.out.println("number = "+ number );
    }
}

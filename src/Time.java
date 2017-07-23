import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by ADU on 2017/7/23.
 */
public class Time {
    public static void main(String args[]){
        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
        System.out.println(timeStamp);

    }
}

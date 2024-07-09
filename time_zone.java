import java.util.*;
public class time_zone {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Day : ");
            int day = sc.nextInt();
            System.out.print("Enter Hour : ");
            int hour = sc.nextInt();
            System.out.print("Enter Minute : ");
            int minute = sc.nextInt();
            hour += 5;
            minute += 30;

            if (minute >= 60) {
                hour ++;
                minute -= 60 ;
            }
            if (hour >= 24){
                day ++;
                hour -= 24 ;
            }
            System.out.println("IST = Day : "+day +", Hour : " + hour + ", Min : " + minute);
        }
    }
}

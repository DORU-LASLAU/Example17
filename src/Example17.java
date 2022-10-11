import java.util.Scanner;
public class Example17 {
    public static void main(String[] argv) {
        int hour, minutes, seconds;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter hour:");
        hour = inputValue.nextInt();
        System.out.println("Enter minutes:");
        minutes = inputValue.nextInt();
        System.out.println("Enter seconds:");
        seconds = inputValue.nextInt();

        if (seconds < 59 && (minutes <= 59 && hour <= 24)) {
            seconds = seconds + 1;
        } else {
            if (seconds == 59 && (minutes < 59 && hour <= 24)) {
                seconds = 0;
                minutes = minutes + 1;
            } else {
                if (seconds == 59 && (minutes == 59 && hour < 24)) {
                    seconds = 0;
                    minutes = 0;
                    hour = hour + 1;
                } else {
                    if (seconds == 59 && (minutes == 59 && hour == 24)) {
                        seconds = 0;
                        minutes = 0;
                        hour = 1;
                    } else {
                        System.out.println("ERROR");
                    }
                }
            }
        }
        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}

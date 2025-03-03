import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int totalInt = 0 ;
        Rectangle first = new Rectangle(20,10,10,15);

        for(int i = 0 ; i < 1000000; i ++){
            int randomLength = (int) (Math.random() * 40) + 11;
            int randomWidth = (int) (Math.random() * 5) +6;
            int randomX =  (int) (Math.random() * 50) +1;
            int randomY = (int) (Math.random() * 50) +1;

            Rectangle newRectangle = new Rectangle(randomLength,randomWidth,randomX,randomY);

            if(newRectangle.isTouches()){
                totalInt ++;
            }
        }


        double percent = (((((double)totalInt) / 1000000) * 100));

        percent = Math.round(percent * 10.0) / 10.0;

       System.out.println(percent + "%");

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        java.time.LocalTime currentTime = java.time.LocalTime.now();
        System.out.println(currentTime);
        int hours = currentTime.getHour();
        int minutes = currentTime.getMinute();
        int angle = angle(hours, minutes);
        System.out.println("Угол 1 = " + Math.abs(angle) + " Угол 2 = " + (360-Math.abs(angle)));
    }

    static int angle(int h, int m) {
        int h1 = 360 / 12;
        int m1 = 360 / 60;
        double angleH = 0;
        int angleM = 0;
        angleM = m * m1;
        if (h > 12) {
            h = h % 12;
        }
        angleH = h * h1 + ((m / 60.0) * h1);
        int angle = angleM - (int) Math.round(angleH);
        return angle;
    }
}
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Алёна on 07.12.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        ArrayList<Motor> motors = new ArrayList<>();
        ArrayList<Sensor> sensors = new ArrayList<>();

        motors.add(new Motor(TypeOfMotor.BIG_MOTOR, 100, 50));
        motors.add(new Motor(TypeOfMotor.BIG_MOTOR, 100, 50));
        motors.add(new Motor(TypeOfMotor.AVERAGE_MOTOR, 50, 20));
        sensors.add(new Sensor(TypeOfSensor.TOUCH, 15));
        sensors.add(new Sensor(TypeOfSensor.ULTRASONIC, 20));

        Robot robot = new Robot("LEGO", motors, sensors);
        //System.out.println(robot.toString());

        FileReader fin = new FileReader("C:\\Users\\FileIN.txt");
        int c;
        while ((c = fin.read()) != -1) System.out.print((char) c);
    }
}

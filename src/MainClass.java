import java.io.*;
import java.util.ArrayList;

/**
 * Created by Алёна on 07.12.2016.
 */
public class MainClass {
    public static void main(String[] args) {
       /* ArrayList<Motor> motors = new ArrayList<>();
        ArrayList<Sensor> sensors = new ArrayList<>();

        motors.add(new Motor(TypeOfMotor.BIG_MOTOR, 100, 50));
        motors.add(new Motor(TypeOfMotor.BIG_MOTOR, 100, 50));
        motors.add(new Motor(TypeOfMotor.AVERAGE_MOTOR, 50, 20));
        sensors.add(new Sensor(TypeOfSensor.TOUCH, 15));
        sensors.add(new Sensor(TypeOfSensor.ULTRASONIC, 20));

        Robot robot = new Robot("LEGO", motors, sensors);
        //System.out.println(robot.toString());*/


        /*FileReader fin = new FileReader("C:\\FileIN.txt");
        int c;
        while ((c = fin.read()) != -1) System.out.print((char) c);*/

        try {
            Parser p = new Parser();
            ArrayList<Robot> robots = p.parser(new File("C:\\FileIN.txt"));
            System.out.println(robots.toString());
        } catch (ParserException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

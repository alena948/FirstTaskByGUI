import java.util.ArrayList;

/**
 * Created by Алёна on 07.12.2016.
 */
public class MainClass {
    public static void main(String[] args) {
        ArrayList<Motor> motors = new ArrayList<>();
        ArrayList<Sensor> sensors= new ArrayList<>();

        motors.add(new Motor(TypeOfMotor.BIG_MOTOR, 100, 50));
        motors.add(new Motor(TypeOfMotor.BIG_MOTOR, 100, 50));
        motors.add(new Motor(TypeOfMotor.AVERAGE_MOTOR, 50, 20));
        sensors.add(new Sensor(TypeOfSensor.TOUCH, 15));
        sensors.add(new Sensor(TypeOfSensor.ULTRASONIC, 20));

        Robot robot = new Robot(motors, sensors);
        System.out.println(robot.toString());

    }
}

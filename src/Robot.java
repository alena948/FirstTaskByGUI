import java.util.ArrayList;

/**
 * Created by Алёна on 07.12.2016.
 */
public class Robot {
    private ArrayList<Motor> motors;
    private ArrayList<Sensor> sensors;

    public Robot(ArrayList<Motor> motors, ArrayList<Sensor> sensors) {
        this.motors = motors;
        this.sensors = sensors;
    }

    public ArrayList<Motor> getMotors() {
        return motors;
    }

    public void setMotors(ArrayList<Motor> motors) {
        this.motors = motors;
    }

    public ArrayList<Sensor> getSensors() {
        return sensors;
    }

    public void setSensors(ArrayList<Sensor> sensors) {
        this.sensors = sensors;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "motors=" + motors +
                ", sensors=" + sensors +
                '}';
    }
}

import java.util.ArrayList;

/**
 * Created by Алёна on 07.12.2016.
 */
public class Robot {
    private String platform;
    private ArrayList<Motor> motors;
    private ArrayList<Sensor> sensors;

    public Robot(String platform, ArrayList<Motor> motors, ArrayList<Sensor> sensors) {
        this.platform = platform;
        this.motors = motors;
        this.sensors = sensors;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
                "platform='" + platform + '\'' +
                ", motors=" + motors +
                ", sensors=" + sensors +
                '}';
    }
}

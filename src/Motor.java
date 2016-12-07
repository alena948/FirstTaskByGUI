import com.sun.org.apache.xml.internal.dtm.ref.DTMDefaultBaseIterators;

/**
 * Created by Алёна on 07.12.2016.
 */
public class Motor {
    private TypeOfMotor type;
    private int power;
    private double cost;

    public Motor(TypeOfMotor type, int power, double cost) {
        this.type = type;
        this.power = power;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "type=" + type +
                ", power=" + power +
                ", cost=" + cost +
                '}';
    }

}

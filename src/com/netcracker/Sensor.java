package com.netcracker;

/**
 * Created by Алёна on 07.12.2016.
 */
public class Sensor {
    private TypeOfSensor type;
    private double cost;

    public Sensor(TypeOfSensor type, double cost) {
        this.type = type;
        this.cost = cost;
    }

    public TypeOfSensor getType() {
        return type;
    }

    public void setType(TypeOfSensor type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "type=" + type +
                ", cost=" + cost +
                '}';
    }
}

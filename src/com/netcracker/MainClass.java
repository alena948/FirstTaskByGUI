package com.netcracker;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Алёна on 07.12.2016.
 */
public class MainClass {

    public static void parser_printer(File file) {
        Parser p = new Parser();
        try {
            ArrayList<Robot> robots = p.parser(file);
            System.out.println(robots);
        } catch (ParserException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void logger_demo(File file) {
        Logger log = new Logger();

        try {

            //Create 1-st robot
            ArrayList<Motor> motors1 = new ArrayList<>();
            motors1.add(new Motor(TypeOfMotor.BIG, 100, 37.0));
            motors1.add(new Motor(TypeOfMotor.AVERAGE, 70, 40.0));
            ArrayList<Sensor> sensors1 = new ArrayList<>();
            sensors1.add(new Sensor(TypeOfSensor.COLOR, 44.0));
            sensors1.add(new Sensor(TypeOfSensor.TOUCH, 27.0));
            Robot robot1 = new Robot("Lego", motors1, sensors1);

            //Log 1-st robot
            log.toLog(file, robot1);

            //Create 2-nd robot
            ArrayList<Motor> motors2 = new ArrayList<>();
            motors2.add(new Motor(TypeOfMotor.AVERAGE, 70, 55.0));
            ArrayList<Sensor> sensors2 = new ArrayList<>();
            sensors2.add(new Sensor(TypeOfSensor.ULTRASONIC, 33.0));
            sensors2.add(new Sensor(TypeOfSensor.GYRO, 21.0));
            Robot robot2 = new Robot("Arduino", motors2, sensors2);

            //Log 2-nd robot
            log.toLog(file, robot2);

            //Parse logged file
            parser_printer(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        /*ArrayList<com.netcracker.Motor> motors = new ArrayList<>();
        ArrayList<com.netcracker.Sensor> sensors = new ArrayList<>();

        motors.add(new com.netcracker.Motor(com.netcracker.TypeOfMotor.BIG, 100, 50));
        motors.add(new com.netcracker.Motor(com.netcracker.TypeOfMotor.BIG, 100, 50));
        motors.add(new com.netcracker.Motor(com.netcracker.TypeOfMotor.AVERAGE, 50, 20));
        sensors.add(new com.netcracker.Sensor(com.netcracker.TypeOfSensor.TOUCH, 15));
        sensors.add(new com.netcracker.Sensor(com.netcracker.TypeOfSensor.ULTRASONIC, 20));

        com.netcracker.Robot robot = new com.netcracker.Robot("LEGO", motors, sensors);
        System.out.println(robot.toString());*/


        FileReader fin = new FileReader("C:\\FileIN.txt");
        int c;
        while ((c = fin.read()) != -1) System.out.print((char) c);

        logger_demo(new File("C:\\FileOUT.txt"));

    }
}

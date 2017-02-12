package com.netcracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Алёна on 19.12.2016.
 */
public class Parser {
    //Scanner scan = new Scanner("C:\\FileIN.txt");

    public ArrayList<Robot> parser(File file) throws ParserException, FileNotFoundException {

        Scanner scan = new Scanner(file);
        ArrayList<Robot> robots = new ArrayList<>();
        while (scan.hasNextLine()) {
            //create robot
            String[] robotDescr = scan.nextLine().split(" ");
            String platform = robotDescr[0];
            ArrayList<Motor> motors = new ArrayList<>();
            ArrayList<Sensor> sensors = new ArrayList<>();


            for (int i = 1; i < robotDescr.length; i++) {
                switch (robotDescr[i]) {
                    case "MOTOR":
                        Motor m = new Motor(TypeOfMotor.valueOf(robotDescr[++i]), Integer.parseInt(robotDescr[++i]),
                                Double.parseDouble(robotDescr[++i]));
                        motors.add(m);
                        break;
                    case "SENSOR":
                        Sensor s = new Sensor(TypeOfSensor.valueOf(robotDescr[++i]), Double.parseDouble(robotDescr[++i]));
                        sensors.add(s);
                        break;
                    default:
                        throw new ParserException();
                }
            }
            Robot r = new Robot(platform, motors, sensors);
            robots.add(r);
        }
        return robots;
    }
}

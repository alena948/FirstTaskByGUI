package com.netcracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by Алёна on 22.12.2016.
 */
public class Logger {

    public void toLog(File file, Robot robot) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(file);
        String item = "";

        item += robot.getPlatform() + " ";
        for (Motor m : robot.getMotors()) {
            item += "MOTOR " + m.getType() + " " + m.getPower() + " " + m.getCost() + " ";
        }

        for (Sensor s : robot.getSensors()) {
            item += "SENSOR " + s.getType() + " " + s.getCost() + " ";
        }

        pw.println(item);
        pw.close();
    }

}

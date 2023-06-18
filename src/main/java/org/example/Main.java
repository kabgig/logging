package org.example;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

        try {
            logger.info("This is an informational message.");
            logger.warning("This is a warning message.");
            logger.severe("This is a severe error message.");
            int i = 25 / 5;
        } catch (Exception e) {
            if (stackTrace.length != 0) {
                for (var item : stackTrace) {
                    System.out.println(item);
                }
            } else {
                System.out.println("is empty");
            }
        }
        String currentWorkingDirectory = System.getProperty("user.dir");
        System.out.println("Current Working Directory: " + currentWorkingDirectory);
    }
}
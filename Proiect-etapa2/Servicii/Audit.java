package Servicii;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;

public class Audit {
    private static Audit instance = null;

    public static Audit getInstance() {
        if (instance == null)
            instance = new Audit();
        return instance;
    }

    public Audit() {
        try {
            String nume = "src/files/audit.csv";
            PrintWriter printWriter;
            printWriter = new PrintWriter(new File(nume));
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                close();
            }
        });
    }
}

package IO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class IOSingleton {
    private static volatile IOSingleton instance = null;
    private final static Scanner scanner = new Scanner(System.in);

    private IOSingleton() {
    }

    public static IOSingleton getInstance() {
        IOSingleton result = instance;
        if (instance == null) {
            synchronized (IOSingleton.class) {
                result = instance;
                if (instance == null) {
                    instance = result = new IOSingleton();
                }
            }
        }
        return instance;
    }
    
    public Scanner getScanner() {
        return scanner;
    }

    public Scanner getScanner(File file) {
        try {
            return new Scanner(new FileReader(file));
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return null;
        }
    }

    public void clearScreen() {
        System.out.print("\033\143");
    }
}
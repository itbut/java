/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.InvalidNameException;

/**
 *
 * @author java
 */
public class FileParser {

    public final int SIZE_BUFFER = 2048;
    private FileReader fr;
    private char[] buffer;
    private String comment;
    private int[] intData;
    private double dblData;

    public FileParser(String fileName)
            throws InvalidNameException, FileNotFoundException {

        if (fileName == null || fileName.trim().isEmpty()) {
            throw new InvalidNameException("Invalid file name: " + fileName);
        }
        if (!fileName.endsWith(".dat")) {
            throw new InvalidNameException("Invalid file extention: " + fileName);
        }

        File file = new File(fileName);
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException("File \"" + fileName + "\" not found");
        }

        if (!file.canRead()) {
            throw new SecurityException(
                    "File \"" + fileName + "\" not readable");
        }
        fr = new FileReader(file);
        buffer = new char[SIZE_BUFFER];
    }

    public static void main(String[] args) {
        try {
            FileParser fp = new FileParser("data.dat");
            if (fp.readFile()) {
                System.out.println("OK");
            } else {
                System.out.println(":((");
                fp.printFile();
            }
        } catch (InvalidNameException ex) {
            System.out.println("Error#1: " + ex.getMessage());
        } catch (FileNotFoundException ex) {
            System.out.println("Error#2: " + ex.getMessage());
        }
        catch (IOException ex){
                    System.out.println("Error#3: " + ex.getMessage());
        }

    }

    public boolean readFile() throws IOException {
        String[] tmp = readStrings();
        for (String t: tmp){
            System.out.println(t);
        }
        return true;

    }

    private String[] readStrings() throws IOException {

        int n = fr.read(buffer);
        return new String(buffer, 0, n).split("\n+");
    }

    private void printFile() {

    }

}

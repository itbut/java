/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package std;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author java
 */
public class KeyboardReader {

    private byte[] buffer;
    private final String END;
    private final String CODE_PAGE;

    public KeyboardReader(String codePage) {
        buffer = new byte[1024];
        END = "\\q";
        CODE_PAGE = codePage;
    }

    public static void main(String[] args) {
        KeyboardReader k = new KeyboardReader("Windows-1251");
        StringBuilder b = new StringBuilder();
        String s;
        while (true) {
            try {
                s = k.readString();
            } catch (UnsupportedEncodingException ex) {
                System.out.println("Error # 1:" + ex.getMessage());
                break;
            }

            if (s == null || s.trim().equalsIgnoreCase(k.END)) {
                break;
            }
            b.append(s);
        }
        System.out.println("--------------------");
        System.out.println(b);

    }

    public String readString() throws UnsupportedEncodingException {
        int i;
        try {
            i = System.in.read(buffer);
        } catch (IOException ex) {
            return null;

        }
        return new String(buffer, 0, i, CODE_PAGE);
    }

}

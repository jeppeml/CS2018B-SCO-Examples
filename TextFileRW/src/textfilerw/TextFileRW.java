/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilerw;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class TextFileRW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        TestFiles test = new TestFiles();
        test.testRead();
        String name = "Petrovich Steganovich";
        test.appendName(name);
        test.testRead();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textfilerw;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class TestFiles{
    Path path = Paths.get("myfile.txt");
    
    public void testRead() throws IOException{
        try{
            List<String> names = Files.readAllLines(path);
            for (String name : names) {
                System.out.println(name);
            }
        }
        catch(NoSuchFileException nsfe){
            System.out.println("Cannot find the file: " 
                    + path.getFileName());
        }
    }

    public void appendName(String name) throws IOException {
        List<String> lines = new ArrayList();
        lines.add(name);
        
        Files.write(path, 
                lines, 
                StandardOpenOption.APPEND, 
                StandardOpenOption.WRITE);
    }
}

package helpers;

import java.io.*;

public class ReadFromFile {
    private ReadFromFile(){}

    public static String getRecords(File file) throws IOException  {
        StringBuilder data = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
             String line;

             while((line = reader.readLine()) != null){
                 data.append(line);
             }
        }
        return data.toString();
    }
}

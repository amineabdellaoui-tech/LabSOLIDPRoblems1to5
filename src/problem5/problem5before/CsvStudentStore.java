package problem5.problem5before;

import java.io.FileWriter;
import java.io.IOException;

public class CsvStudentStore {
    private final String filename;


    public CsvStudentStore(String filename){
        this.filename=filename;
    }

    public boolean exists(String cne){
        return false;
    }

    public void append(String cne,String name,String email){
        try (FileWriter fw = new FileWriter(filename, true)) {
            fw.write(cne + "," + name + "," + email + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package problem5.problem5after;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class CsvStudentRepository implements StudentRepository {
    private final String filename;
    private final Set<String> enrolledCnes=new HashSet<>();

    public CsvStudentRepository(String filename) {
        this.filename = filename;
    }

    @Override
    public boolean exists(String cne) {
        return enrolledCnes.contains(cne);
    }

    @Override
    public void save(String cne,String name,String email) {
        enrolledCnes.add(cne);
        try (FileWriter filewrit=new FileWriter(filename,true)) {
            filewrit.write(cne + "," + name + "," + email + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
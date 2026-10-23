package problem1.problem1after;

import java.io.FileWriter;
import java.io.IOException;

public class InvoiceRepository {
    public void save(InvoiceData data, String receiptText) throws IOException {
        try (FileWriter fw = new FileWriter(data.getCustomer() + ".txt")) {
            fw.write(receiptText);
        }
    }
}
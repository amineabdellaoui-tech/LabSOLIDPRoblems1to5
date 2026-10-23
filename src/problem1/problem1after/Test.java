package problem1.problem1after;

public class Test{
    public static void main(String[] args){
        InvoiceData data1=new InvoiceData("ALAMI Samir");
        data1.addLine("Laptop",9000.00);
        data1.addLine("Mouse",150.00);
        data1.addLine("USB cable",50.00);

        InvoiceCalculator calc1=new InvoiceCalculator();
        InvoicePrinter printer=new InvoicePrinter();

        String receipt=printer.print(data1,calc1);

        System.out.println(receipt);

        InvoiceRepository repository = new InvoiceRepository();
        try {
            repository.save(data1, receipt);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

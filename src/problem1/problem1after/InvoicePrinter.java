package problem1.problem1after;

public class InvoicePrinter{
    public String print(InvoiceData data,InvoiceCalculator calc){
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice for ").append(data.getCustomer()).append("\n");
        for (InvoiceLine line : data.getLines()) {
            sb.append(formatLine(line.item(), line.price()));
        }
        sb.append(formatLine("Subtotal", calc.subtotal(data)));
        sb.append(formatLine("TOTAL", calc.total(data)));
        return sb.toString();
    }

    private String formatLine(String label, double value) {
        return String.format("%-12s %8.2f%n",label,value);
    }

}

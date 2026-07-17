class Report {

    void genterateReport() {
        System.out.println("Generating Report......");
    }
}

class ReportPrinter {

    void printReport() {
        System.out.println("Printing Report....");
    }
}

/**
 * SRPExample
 */
public class SRPExample {

    public static void main(String[] args) {
        Report report = new Report();
        ReportPrinter p = new ReportPrinter();
        report.genterateReport();
        p.printReport();
    }
}

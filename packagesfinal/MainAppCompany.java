import com.company.analytics.sales.*;
import com.company.analytics.hr.*;

public class MainAppCompany {
    public static void main(String[] args) {
        System.out.println("=== 🏢 Company Analytics Dashboard ===\n");

        // Create objects from both sub-packages
        SalesReport salesReport = new SalesReport();
        EmployeeReport employeeReport = new EmployeeReport();

        // Print both reports
        salesReport.printSalesData();
        System.out.println();
        employeeReport.printEmployeeData();

        System.out.println("\n✅ Combined Company Report Generated Successfully!");
    }
}

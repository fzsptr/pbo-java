import model.*;
import controllers.*;
import javax.swing.SwingUtilities;
import views.*;

public class RentalApp {
    public static void main(String[] args) {
        AdminController adminController = new AdminController();
        CustomerController customerController = new CustomerController();

        // Launch Admin View
        SwingUtilities.invokeLater(() -> new AdminView(adminController));
        SwingUtilities.invokeLater(() -> new CustomerView(customerController));
    }
}
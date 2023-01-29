package lld.solidPrinciples;

public class SingleResponsibilityPrinciple {
    /**
     * ================================
     * Single Responsibility Principle
     * ================================
     *
     * A class should do one thing only therefore it should have only a single reason to change
     *
     * */

    /** Bad Example - Below class have 3 responsibilities hence 3 reason to change. */
    class Invoice {
        String nameOfObject;
        double price;
        int quantity;

        public double calculateTotal(){
            return price * quantity;
        }

        public void printInvoice(){
            // Logic to print invoice
        }

        public void saveInvoice(){
            // Logic to save invoice to database
        }
    }

    /** Solution -> Break down classes based on responsibilities */

    class InvoiceV2 {
        String nameOfObject;
        double price;
        int quantity;

        public double calculateTotal(){
            return price * quantity;
        }
    }

    class InvoicePrinter {
        private Invoice invoice;

        public void printInvoice(){
            // Logic to print invoice
        }
    }

    class InvoiceDao {
        private Invoice invoice;

        public void saveInvoice(){
            // Logic to save invoice to database
        }
    }
}

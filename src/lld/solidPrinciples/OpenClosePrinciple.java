package lld.solidPrinciples;

public class OpenClosePrinciple {
    /**
     * ================================
     * Open Close Principle
     * ================================
     *
     * A class should Open to extend, closed for modification
     *
     * */


    class Invoice {
        String nameOfObject;
        double price;
        int quantity;
    }

    /** Class to save Invoice into DB */
    class InvoiceDao {
        private Invoice invoice;

        public void saveToDb(){
            // Logic to print invoice
        }
    }

    /**
     * Assume new requirement came to save Invoice into file
     * */

    // Bad example
    class InvoiceDaoV2 {
        private Invoice invoice;

        public void saveToDb(){
            // Logic to print invoice
        }

        public void saveToFile(){
            // Logic to print invoice
        }
    }

    /** Solution -
     * Create an Interface and extend it everytime for new requirement.
     * Do not modify code in already tested class
     * */

    interface InvoiceDaoInterface {
        void save();
    }

    class databaseDao implements InvoiceDaoInterface{

        @Override
        public void save() {
            // Logic to save into db
        }
    }

    class fileDao implements InvoiceDaoInterface{
        @Override
        public void save() {
            // Logic to save into file
        }
    }
}

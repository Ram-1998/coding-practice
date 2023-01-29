package lld.solidPrinciples;

public class DependencyInversionPrinciple {

    /**
     * ================================
     * Interface Segregation Principle
     * ================================
     *
     *
     * Our classes should depend upon interfaces or abstract classes instead of concrete classes and functions.
     *
     * */


    /**
     * BAD Example
     * In the below example, if we want to create a new macbook with bluetooth keyboard then it's not possible
     * */

    interface Keyboard{}

    class WiredKeyboard implements Keyboard{

    }

    class BluetoothKeyboard implements Keyboard{

    }

    class Macbook{
        private WiredKeyboard wiredKeyboard;

        public Macbook() {
            this.wiredKeyboard = new WiredKeyboard();
        }
    }

    /**
     * Solution : use Interface, not concrete classes and pass the required type.
     * */

    class MacbookV2{
        private Keyboard keyboard;

        public MacbookV2(Keyboard keyboard) {
            this.keyboard = keyboard;
        }
    }

}

package lld.solidPrinciples;

public class InterfaceSegregationPrinciple {

    /**
     * ================================
     * Interface Segregation Principle
     * ================================
     *
     *
     * The principle states that many client-specific interfaces are better than one general-purpose interface.
     * Clients should not be forced to implement a function they do no need.
     *
     * */

    interface RestaurantEmployee{
        void washDishes();
        void takeOrder();
        void cookFood();
    }

    /**
     * Waiter class is implementing wash dishes and cook food method also which is not it's work
     * */
    class Waiter implements RestaurantEmployee{

        @Override
        public void washDishes() {

        }

        @Override
        public void takeOrder() {

        }

        @Override
        public void cookFood() {

        }
    }

    /**
     * Solution - Break down interfaces and segregate based on responsibilities
     * */

    interface WaiterInterface{
        void takeOrder();
        void serveOrder();
    }

    interface ChefInterface{
        void prepareMenu();
        void cookFood();
    }

    class WaiterV2 implements  WaiterInterface{

        @Override
        public void takeOrder() {
            // Logic to take orders
        }

        @Override
        public void serveOrder() {
            // Logic to serve orders
        }
    }

    class Chef implements  ChefInterface{

        @Override
        public void prepareMenu() {
            // Logic to prepare menu
        }

        @Override
        public void cookFood() {
            // Logic to cook food
        }
    }

}

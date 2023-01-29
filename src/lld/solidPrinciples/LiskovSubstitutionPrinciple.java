package lld.solidPrinciples;

public class LiskovSubstitutionPrinciple {

    /**
     * ================================
     * Open Close Principle
     * ================================
     *
     * Subclasses should be substitutable for their base classes.
     *
     * given that class B is a subclass of class A, we should be able to pass an object of class B to any method that
     * expects an object of class A and the method should not give any weird output in that case.
     *
     * */

    interface Bike {
        void turnOnEngine();
        void accelerate();
    }

    class MotorCycle implements Bike{

        boolean engine;
        int speed;

        MotorCycle(){}

        @Override
        public void turnOnEngine() {
            this.engine = true;
        }

        @Override
        public void accelerate() {
            this.speed = this.speed + 10;
        }
    }

    class Cycle implements Bike{
        int speed;

        @Override
        public void turnOnEngine() {
            throw new RuntimeException("Not supported in cycle");
        }

        @Override
        public void accelerate() {
            this.speed = this.speed + 10;
        }
    }

    public void main(String[] args) {
        Bike b1 = new MotorCycle();
        Bike b2 = new Cycle();

        run(b1);
        run(b2);
    }

    /**
     * This function will throw error for b2 which should not be a case
     * It is breaking the behaviour of the program if there is any after steps of the code.
     * */
    private static void run(Bike bike){
        bike.turnOnEngine();
        bike.accelerate();
    }

}

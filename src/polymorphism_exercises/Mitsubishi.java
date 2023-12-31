package polymorphism_exercises;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " start!";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerate!";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brake!";
    }
}

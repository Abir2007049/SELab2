public interface Shape{
    void draw();
}
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}

class Singleton {
    private static Singleton ins = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (ins == null)
            ins = new Singleton();
        return ins;
    }
}


public class ShapeFactory {
    private static ShapeFactory ins = null;
    private ShapeFactory(){

    }

    public static ShapeFactory getInstance() {
        if (ins == null)
            ins = new ShapeFactory();
        return ins;
    }


   
}
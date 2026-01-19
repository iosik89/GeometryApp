import com.geometry.threed.Cube;
import com.geometry.threed.Sphere;
import example.geometry.shapes.*;
import example.geometry.utils.GeometryUtils;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);

        GeometryUtils.compareAreas(circle,rectangle);

        Sphere sphere = new Sphere(5.0);
        Cube cube = new Cube(3.0);

        System.out.println(sphere + " | Объем: " + sphere.getVolume());
        System.out.println(cube + " | Объем: " + cube.getVolume());

        System.out.println("Circle area: " + circle.area());
        System.out.println("Circle perimeter: " + circle.perimeter());

        System.out.println("Rectangle area: " + rectangle.area());
        System.out.println("Rectangle perimeter: " + rectangle.perimeter());

        System.out.println("Triangle area: " + triangle.area());
        System.out.println("Triangle perimeter: " + triangle.perimeter());
    }
}


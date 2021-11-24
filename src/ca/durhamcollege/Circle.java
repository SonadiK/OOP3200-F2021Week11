package ca.durhamcollege;

public class Circle extends Shape
{
    // private instance members
    private Vector2D center;
    private float radius;

    // public properties
    public Vector2D getCenter()
    {
        return center;
    }

    public void setCenter(Vector2D center)
    {
        super.setVertex(center);
        this.center = center;
    }

    public float getRadius()
    {
        return radius;
    }

    public void setRadius(float radius)
    {
        this.radius = radius;
    }

    public void set(Vector2D center, float radius)
    {
        //super.setVertex(center);
        setCenter(center);
        setRadius(radius);
    }

    public float getCircumference()
    {
        return (float)(Math.PI * radius *2);
    }

    public float getArea()
    {
        return (float) Math.pow(Math.PI * radius, 2);
    }

    // constructor
    public Circle(Vector2D center, float radius)
    {
        super();
        set(center, radius);
    }
    // private methods

    // public methods
    @Override
    public String toString()
    {
        String output_string = "";
        output_string += "-----------------------------------------------------\n";
        output_string += "Center        : " + getCenter() + " \n";
        output_string += "Radius        : " + getRadius() + " \n";
        output_string += "Area          : " + getArea() + " \n";
        output_string += "Circumference : " + getCircumference() + " \n";
        output_string += "-----------------------------------------------------\n";

        return output_string;
    }


}

package ca.durhamcollege;

public class Line
{
    // private instance members
    private Vector2D start;
    private Vector2D end;
    private float length;

    // public properties
    public Vector2D getStart() {
        return start;
    }

    public void setStart(Vector2D start) {
        this.start = start;
    }

    public Vector2D getEnd() {
        return end;
    }

    public void setEnd(Vector2D end) {
        this.end = end;
    }

    public void set(Vector2D start, Vector2D end)
    {
        setStart(start);
        setEnd(end);
    }

    public float getLength()
    {
        return Vector2D.distance(getStart(), getEnd());
    }


    // constructors
    Line()
    {
        set(Vector2D.zero(), Vector2D.zero());
    }

    Line(Vector2D start, Vector2D end)
    {
        set(start, end);
    }
    // private methods

    // public methods
    @Override
    public  String toString()
    {
        //String output_string = "";
        return  "start: " + getStart().toString() + " end: " + getEnd().toString() + " length: " + getLength();
        //return output_string;
    }
}

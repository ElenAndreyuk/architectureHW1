package ru.geekbrains.lesson1.store3D.models;

public class Flash {
    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash() {
    }
    public void rotate(Angle3D angle3D){
        Angle3D angle = getAngle();
        angle = angle + angle3D;
        setAngle(angle);
    }
    public void move(Point3D point3D){
        setLocation(point3D);
    }


    public Point3D getLocation() {
        return location;
    }

    public void setLocation(Point3D location) {
        this.location = location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public void setAngle(Angle3D angle) {
        this.angle = angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

}

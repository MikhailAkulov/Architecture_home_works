package ru.geekbrains.home_work_1.modelelements;

import java.util.Collection;

public class Flash {

    private Collection<Point3D> location;
    private Collection<Angle3D> angle;
    private Color color;
    private Float power;

    public Flash(Collection<Point3D> location, Collection<Angle3D> angle, Color color, Float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
    }

    public Collection<Point3D> getLocation() {
        return location;
    }

    public Collection<Angle3D> getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Float getPower() {
        return power;
    }

    public void setPower(Float power) {
        this.power = power;
    }

    public void rotate(Angle3D angle){
        // TODO: something logic
    }

    public void move (Point3D point) {
        // TODO: something logic
    }
}
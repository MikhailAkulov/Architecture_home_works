package ru.geekbrains.home_work_1.modelelements;

import java.awt.*;

public class Flash {

    //TODO: Доработать

    private Point3D location;
    private Angle3D angle;
    private Color color;
    private float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
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

    public void rotate(Angle3D angle){
        short x = (short) (this.angle.getHorizontalAngle()+angle.getHorizontalAngle());
        if (x>360){
            this.angle.setHorizontalAngle((short)(x-360));
        } else if(x<0){
            this.angle.setHorizontalAngle((short)(360-x));
        } else {
            this.angle.setHorizontalAngle(x);
        }

        short y = (short) (this.angle.getVerticalAngle()+angle.getVerticalAngle());
        if (y>360){
            this.angle.setHorizontalAngle((short)(y-360));
        } else if(y<0){
            this.angle.setHorizontalAngle((short)(360-y));
        } else {
            this.angle.setHorizontalAngle(y);
        }
    }

    public void move (Point3D point) {
        this.location.setX(this.location.getX()+point.getX());
        this.location.setY(this.location.getY()+point.getY());
    }
}

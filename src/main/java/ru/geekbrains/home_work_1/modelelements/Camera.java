package ru.geekbrains.home_work_1.modelelements;

public class Camera {

    //TODO: Доработать

    private Point3D location;
    private Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
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

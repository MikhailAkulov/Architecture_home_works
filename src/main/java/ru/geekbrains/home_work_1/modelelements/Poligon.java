package ru.geekbrains.home_work_1.modelelements;

import java.util.Collection;

public class Poligon {

    private Collection<Point3D> points;

    public Collection<Point3D> getPoints() {
        return points;
    }

    public Poligon(Collection<Point3D> points) {
        this.points = points;
    }
}
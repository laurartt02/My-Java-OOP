package com.laurartt02.exercises.oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape{
    Point bottomRight;
    Point upperLeft;

    public Rectangle(String id, String color, Point bottomRight, Point upperLeft) {
        super(id, color);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    @Override
    public double getPerimeter() {
        return ((bottomRight.x - upperLeft.x) + (upperLeft.y - bottomRight.y)) * 2;
    }

    @Override
    public double getArea() {
        return (bottomRight.x - upperLeft.x) * (upperLeft.y - bottomRight.y);
    }

    @Override
    public void move(Point movement) {
        upperLeft.translate(movement.x, movement.y);
        bottomRight.translate(movement.x, movement.y);
    }

    @Override
    public void resize(double scale) {
        bottomRight.x = (int) (upperLeft.x + ((bottomRight.x - upperLeft.x) * scale));
        bottomRight.y = (int) (upperLeft.y + ((upperLeft.y - bottomRight.y) * scale));
    }

    public String toString() {
        return "Rectangle{" + "upperLeft=" + upperLeft + ", bottomRight=" + bottomRight + ", id=" + id + ", color=" + color + "}";
    }
}

package com.laurartt02.exercises.oop.basic;

import java.awt.*;
import java.util.Arrays;

/**
 * An irregular polygon on a 2D plane capable of calculating its perimeter and area
 */
public class Polygon {
    final Point[] vertices;

    /**
     * Constructs a new polygon from an array of points representing the vertices
     * @param vertices the Point array representing the vertices
     */
    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    /**
     * Returns the numbers of vertices
     * @return the number of vertices
     */
    public int getVerticesCount() {
        return vertices.length;
    }

    /**
     * Returns the perimeter of the polygon
     * @return the perimeter of the polygon
     */
    public double getPerimeter() {
        double perimeter = 0.0;
        for(int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            perimeter += Math.hypot(vertices[i].x - vertices[next].x, vertices[i].y - vertices[next].y);
        }
        return perimeter;
    }

    /**
     * Returns the area of the polygon
     * @return the area of the polygon
     */
    public double getArea() {
        double area = 0.0;
        for(int i = 0; i < vertices.length; i++) {
            int next = (i + 1) % vertices.length;
            area += (vertices[i].x * vertices[next].y) - (vertices[i].y * vertices[next].x);
        }
        return Math.abs(area / 2.0);
    }

    @Override
    public String toString() {
        return "Polygon{" + "vertices=" + Arrays.toString(vertices) + "}";
    }
}
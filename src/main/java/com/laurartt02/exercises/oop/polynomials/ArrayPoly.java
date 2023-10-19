package com.laurartt02.exercises.oop.polynomials;

import java.util.Arrays;

/**
 * Polynomial with coefficients stored as a double[]
 *
 * @author lauraratti
 */
public class ArrayPoly extends AbstractPoly {
    final double[] coefficients;
    public ArrayPoly(double[] coefficients) {
        this.coefficients = coefficients;
    }
    @Override
    public double coefficient(int degree) {
        return coefficients[degree];
    }

    @Override
    public double[] coefficients() {
        return Arrays.copyOf(coefficients, coefficients.length);
    }

    @Override
    public int degree() {
        return coefficients.length - 1;
    }

    @Override
    public Poly derivative() {
        return new ArrayPoly(derive());
    }
}

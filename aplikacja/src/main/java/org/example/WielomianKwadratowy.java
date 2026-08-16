package org.example;

public class WielomianKwadratowy {
    private double a;
    private double b;
    private double c;

    public WielomianKwadratowy(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double obliczDelta() {
        return (b * b) - (4 * a * c);
    }

    public Wynik obliczMiejscaZerowe() {
        double delta = obliczDelta();

        if (a == 0) {
            return new Wynik(delta, null, null, "To nie jest funkcja kwadratowa (a=0)!");
        }

        if (delta > 0) {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            return new Wynik(delta, x1, x2, "Równanie ma dwa pierwiastki rzeczywiste.");
        } else if (delta == 0) {
            double x0 = -b / (2 * a);
            return new Wynik(delta, x0, null, "Równanie ma jeden pierwiastek podwójny.");
        } else {
            return new Wynik(delta, null, null, "Brak pierwiastków rzeczywistych (Delta < 0).");
        }
    }
}

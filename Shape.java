class Shape {
    void printShape() {
        System.out.println("This is a shape");
    }
}

class Rectangle extends Shape {
    void printRectangle() {
        System.out.println("This is a rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is a circular shape");
    }
}

class Square extends Rectangle {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

class Main {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printRectangle();
        square.printSquare();
    }
}

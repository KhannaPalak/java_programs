public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("Square is a rectangle");
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.printShape();     
        sq.printRectangle();  
    }
}
public class Rectangle extends Shape {

    private int sideA = 0, sideB = 0;

    public Rectangle() {
    }


    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("sideA="+sideA+" sideB="+sideB);
    }

    @Override
    public boolean equals(Object obj) {
        Rectangle rectangle = (Rectangle) obj;
    if (this.sideA == rectangle.sideA && this.sideB == rectangle.sideB && this.getColor())

}

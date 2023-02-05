public class Program {
    public static void main(String[] args) {
        
        Square square = new Square(4);
        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(3);
        Triangle triangle = Triangle.newBuilder(5, 10, 15);
        Figure[] figus = new Figure[]{square,rectangle,circle,triangle};
        MyCollection my = new MyCollection(figus);
        // MyCollection.add(triangle);
        // MyCollection.add(square);
        // MyCollection.add(triangle);
        // MyCollection.add(rectangle);
        // MyCollection.remove(circle);
        MyCollection.getAllInfo();
        MyCollection.replaceFig(square, Triangle.newBuilder(1, 2, 3));
        System.out.println();
        MyCollection.getAllInfo();
        MyCollection.add(new Square(3));
        System.out.println();
        MyCollection.getAllInfo();


    }
    
}

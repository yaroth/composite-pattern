/** Client */
public class Main {
    public static void main(String[] args) {
        //Initialize four ellipses ('Leafs')
        Ellipse ellipse1 = new Ellipse(1);
        Ellipse ellipse2 = new Ellipse(2);
        Ellipse ellipse3 = new Ellipse(3);
        Ellipse ellipse4 = new Ellipse(4);
        Ellipse ellipse5 = new Ellipse(5);

        //Creates two composite graphics containing the ellipses
        CompositeGraphic graphic2 = new CompositeGraphic(2);
        graphic2.add(ellipse1);
        graphic2.add(ellipse2);
        graphic2.add(ellipse3);

        CompositeGraphic graphic3 = new CompositeGraphic(3);
        graphic3.add(ellipse4);

        //Create another graphics that contains graphic2 which itself contains graphic3
        CompositeGraphic graphic1 = new CompositeGraphic(1);
        graphic1.add(ellipse5);
        graphic1.add(graphic2);
        graphic2.add(graphic3);

        CompositeGraphic graphic5 = new CompositeGraphic(5);
        graphic3.add(graphic5);

        //Prints the complete graphic .
        graphic1.print();
    }
}
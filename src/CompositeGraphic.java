import java.util.ArrayList;

/** "Composite" */
class CompositeGraphic implements Graphic {

    private int id;

    //Collection of child graphics.
    private final ArrayList<Graphic> childGraphics = new ArrayList<>();

    public CompositeGraphic(int id) {
        this.id = id;
    }

    //Adds the graphic to the composition.
    public void add(Graphic graphic) {
        childGraphics.add(graphic);
    }

    //Prints the graphic.
    @Override
    public void print() {
        System.out.println("Graphic " + id);
        for (Graphic graphic : childGraphics) {
            graphic.print();  //Delegation
        }
    }
}
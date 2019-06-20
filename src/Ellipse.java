/** "Leaf" */
class Ellipse implements Graphic {

    private int id = 0;


    public Ellipse(int id) {
        this.id = id;
    }
    //Prints the graphic.
    @Override
    public void print() {
        System.out.println("Ellipse " + id);
    }
}
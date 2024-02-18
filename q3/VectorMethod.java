public class VectorMethod implements Visitor{

    @Override
    public void visit(Triangle shape) {
        System.out.println("Saving the triangle... with base = "+shape.getBase()
            +" height = "+shape.getHeight()+" at position "+shape.getxPos()+", "
            +shape.getyPos()+" as vector");
    }

    @Override
    public void visit(Circle shape) {
        System.out.println("Saving the circle... with radius = "+shape.getRadius()
        +" at position "+shape.getxPos()+", "+shape.getyPos()+ "as vector");
    }

    @Override
    public void visit(Rectangle shape) {
        System.out.println("Saving the circle... with width = "+shape.getWidth()
        +" height = "+shape.getHeight()+" at position "+shape.getxPos()+", "+shape.getyPos()
        + "as vector");
    }
    
}

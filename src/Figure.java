public abstract class Figure implements IFigure {

    private String edgeColor;
    private String bgColor;
    private Rectangle rectangle;

    public Figure() {

    }

    public String getEdgeColor() {
        return edgeColor;
    }

    public void setEdgeColor(String edgeColor) {
        this.edgeColor = edgeColor;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public String toString() {
        return "The edge color of the figure is " + edgeColor + ", the background color is " + bgColor + ", the area is " + rectangle + " and ";
    }

}

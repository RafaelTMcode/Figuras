public abstract class Figura implements IFigura {

    private String colorBorde;
    private String colorFondo;
    private Rectangulo rectangulo;

    public Figura(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        this.colorBorde = colorBorde;
        this.colorFondo = colorFondo;
        this.rectangulo = rectangulo;
    }

    public Figura() {

    }

    public String getColorBorde() {
        return colorBorde;
    }

    public void setColorBorde(String colorBorde) {
        this.colorBorde = colorBorde;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public Rectangulo getRectangulo() {
        return rectangulo;
    }

    public void setRectangulo(Rectangulo rectangulo) {
        this.rectangulo = rectangulo;
    }

    @Override
    public String toString() {
        return "La Figura tiene el color del borde " + colorBorde + ", el color del fondo " + colorFondo + ", su area es " + rectangulo + " y ";
    }

}

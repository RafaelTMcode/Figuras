public class Rayo extends Figura implements IFigura {

    public Rayo(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
        //TODO Auto-generated constructor stub
    }

    public Rayo() {

    }

    @Override
    public void Draw() {
        System.out.println("Rayo");
        
    }

    @Override
    public String toString() {
        return super.toString() + "es una Rayo";
    }


    
}
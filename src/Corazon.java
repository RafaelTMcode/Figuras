public class Corazon extends Figura implements IFigura{

    public Corazon(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
        //TODO Auto-generated constructor stub
    }

    public Corazon() {

    }

    @Override
    public void Draw() {
        System.out.println("Corazon");
        
    }

    @Override
    public String toString() {
        return super.toString() + "es una Corazon";
    }
 
    
}

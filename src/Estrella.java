public class Estrella extends Figura implements IFigura {

    public Estrella(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
        //TODO Auto-generated constructor stub
    }

    public Estrella() {

    }

    @Override
    public void Draw() {
        System.out.println("Estrella");
        
    }

    @Override
    public String toString() {
        return super.toString() + "es una Estrella";
    }

   
    
}

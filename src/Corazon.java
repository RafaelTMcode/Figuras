public class Corazon extends Figura{

    public Corazon(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
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

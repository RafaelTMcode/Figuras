public class Estrella extends Figura {

    public Estrella(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
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

public class Rayo extends Figura {

    public Rayo(String colorBorde, String colorFondo, Rectangulo rectangulo) {
        super(colorBorde, colorFondo, rectangulo);
    }

    public Rayo() {

    }

    @Override
    public void Draw() {//TODO d
        System.out.println("Rayo");
        
    }

    @Override
    public String toString() {
        return super.toString() + "es una Rayo";
    }
                

    
}

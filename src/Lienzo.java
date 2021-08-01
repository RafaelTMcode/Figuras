import java.util.ArrayList;
import java.util.List;

public class Lienzo {

    Figura figura;
    IFigura iFigura;
    final List<Figura> lista = new ArrayList<Figura>();

    public void add(Figura figura, Rectangulo rectangulo){
        figura.setRectangulo(rectangulo);
        lista.add(figura);
    }

    Figura getSelected(Punto punto){

        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getRectangulo().bottom==punto.x && lista.get(i).getRectangulo().left==punto.y){
                return lista.get(i);
                
            }
        }
        return null;
       
        
    }

}

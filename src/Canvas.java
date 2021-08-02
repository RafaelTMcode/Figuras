import java.util.ArrayList;
import java.util.List;

public class Canvas {

    final List<Figure> figureList = new ArrayList<Figure>();//L

    public void add(Figure figure, Rectangle rectangulo){
        figure.setRectangle(rectangulo);
        figureList.add(figure);
    }

    Figure getSelected(Point punto){

        for(int i=0;i<figureList.size();i++){
            if(figureList.get(i).getRectangle().bottom==punto.x && figureList.get(i).getRectangle().left==punto.y){
                return figureList.get(i);
                
            }
        }
        return null;
       
        
    }

}

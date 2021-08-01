

public class Rectangulo {

    public final int left;
    public final int right;
    public final int top;
    public final int bottom;
    //public final int height;
    //public final int widht;

    Rectangulo(Punto start, Punto end){
        this.left=start.x;
        this.right=end.x;
        this.top=start.y;
        this.bottom=end.y;
    }

    @Override
    public String toString() {
        return "Bottom: " + bottom + ", Left: " + left + ", Right: " + right + ", Top: " + top;
    }

    


    

}

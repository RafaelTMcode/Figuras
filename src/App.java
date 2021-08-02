public class App {
    public static void main(String[] args) throws Exception {

        Canvas canvas = new Canvas();

        Figure figure1 = Build.build(enumFigure.STAR);
        figure1.setEdgeColor("red");
        figure1.setBgColor("purple");
        figure1.getClass().getName();
        canvas.add(figure1, new Rectangle(new Point(2, 2), new Point(3, 3)));

        for(int i=0; i< canvas.figureList.size();i++){
            System.out.println(canvas.figureList.get(i));
        }

    }
}

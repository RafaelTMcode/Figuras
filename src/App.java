public class App {
    public static void main(String[] args) throws Exception {

        Lienzo lienzo = new Lienzo();

        Figura figura1 = Build.build(enumFigura.ESTRELLA);
        figura1.setColorBorde("rojo");
        figura1.setColorFondo("amarillo");
        figura1.getClass().getName();
        lienzo.add(figura1, new Rectangulo(new Punto(2, 2), new Punto(3, 3)));

        for(int i=0; i< lienzo.lista.size();i++){
            System.out.println(lienzo.lista.get(i));
        }

    }
}

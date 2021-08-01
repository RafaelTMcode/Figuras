public class App {
    public static void main(String[] args) throws Exception {

        Lienzo lienzo = new Lienzo();

        Figura figura1 = Build.build("ESTRELLA");
        figura1.setColorBorde("rojo");
        figura1.setColorFondo("amarillo");
        figura1.getClass().getName();
        lienzo.add(figura1, new Rectangulo(new Punto(2, 2), new Punto(3, 3)));

        for(int i=0; i< lienzo.lista.size();i++){
            System.out.println(lienzo.lista.get(i));
        }
        

        //System.out.println("Bienvenido a la fabrica de figuras");
        //System.out.println("¿Que figura quieres fabricar?");

        //Elige una de las tres figuras posibles

        //System.out.println("¿De que color quieres el borde de la figura?");
        //mandamos el valor a draw

        //System.out.println("¿De que color quieres el fondo de la figura?");
        //mandamos el valor a draw

        //
        // llamamos a los metodos necesarios
        //

        //ya tenemos el objeto creado




        // sacamos por pantalla que figura se ha fabricado
        //System.out.println("¿Que figura quieres fabricar?");



/*         if(enumFigura==Figura.RAYO){
            return new Rayo();
        }
        else if(figuras==Figura.CORAZON){
            return new corazon;
        }
            return new estrella; */
    }
}

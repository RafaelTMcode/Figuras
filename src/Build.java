public class Build {

    static Figura build(enumFigura enumFigura) {

        if (enumFigura == enumFigura.CORAZON) {
            return new Corazon();
        } else if (enumFigura == enumFigura.ESTRELLA) {
            return new Estrella();
        } else {
            return new Rayo();
        }
     
    }

}
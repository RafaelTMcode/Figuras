public class Build {

    static Figura build(String figura) {

        if (figura == enumFigura.CORAZON.name()) {
            return new Corazon();
        } else if (figura == enumFigura.ESTRELLA.name()) {
            return new Estrella();
        } else if (figura == enumFigura.RAYO.name()) {
            return new Rayo();
        }
        return null;
    }

}
public class Build {

    static Figure build(enumFigure enumFigure) {

        if (enumFigure == enumFigure.HEART) {
            return new Heart();
        } else if (enumFigure == enumFigure.STAR) {
            return new Star();
        } else {
            return new Thunder();
        }
     
    }

}
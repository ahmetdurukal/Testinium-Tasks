public class SchoolLesson {
    private SchoolEnumLesson name;
    private double vizeNote;
    private double finalNote;

    public SchoolLesson() {
    }

    public SchoolLesson(SchoolEnumLesson name, double vizeNote, double finalNote) {
        this.name = name;
        this.vizeNote = vizeNote;
        this.finalNote = finalNote;
    }

    public double lesonAverage(){
        double average = getVizeNote()*0.4+getFinalNote()*0.6;
        return average;
    }


    public SchoolEnumLesson getName() {
        return name;
    }

    public void setName(SchoolEnumLesson name) {
        this.name = name;
    }

    public double getVizeNote() {
        return vizeNote;
    }

    public void setVizeNote(double vizeNote) {
        this.vizeNote = vizeNote;
    }

    public double getFinalNote() {
        return finalNote;
    }

    public void setFinalNote(double finalNote) {
        this.finalNote = finalNote;
    }
}

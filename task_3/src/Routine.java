public class Routine {

    int hourIndex;
    String courseName;


    public Routine(int hourIndex) {
        this.hourIndex = hourIndex;
    }

    public int getHourIndex() {
        return hourIndex;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

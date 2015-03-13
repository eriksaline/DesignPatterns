package za.ac.cput.AshDesign.behavioural.momento;

/**
 * Created by student on 2015/03/12.
 */
public class MarksInfo {

    String studentName;
    int subjectCode;
    int marks;

    public MarksInfo(String studentName, int subjectCode, int marks) {
        this.studentName = studentName;
        this.subjectCode = subjectCode;
        this.marks = marks;
    }

    public String toString() {
        return "Student Name: " + studentName + ", Subject Code: " + subjectCode + ", Marks: " + marks;
    }

    public void setSubjectCodeAndMarks(int subjectCode, int marks) {
        this.subjectCode = subjectCode;
        this.marks = marks;
    }

    public Memento save() {
        return new Memento(studentName, subjectCode, marks);
    }

    public void restore(Object objMemento) {
        Memento memento = (Memento) objMemento;
        studentName = memento.mementoStudentName;
        subjectCode = memento.mementoSubjectCode;
        marks = memento.mementoMarks;
    }

    private class Memento {
        String mementoStudentName;
        int mementoSubjectCode;
        int mementoMarks;

        public Memento(String studentName, int subjectCode, int marks) {
            mementoStudentName = studentName;
            mementoSubjectCode = subjectCode;
            mementoMarks = marks;

        }
    }
}

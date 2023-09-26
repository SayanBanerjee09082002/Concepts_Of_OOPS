package VI_CollectionFramework.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Candidate {
    int id;
    String student;
    int marks;

    public Candidate(int id, String student, int marks) {
        this.id = id;
        this.student = student;
        this.marks = marks;
    }

    public void printData() {
        System.out.println("ID: " + id + "\t\tStudent: " + student + "\t\tMarks: " + marks);
    }
}

class CompareMarks implements Comparator<Candidate> {
    @Override
    public int compare(Candidate c1, Candidate c2) {
        return c1.marks - c2.marks;
    }
}

public class I_Basics {



    public static void main(String[] args) {
        ArrayList<Candidate> array = new ArrayList<>();

        array.add(new Candidate(1, "Cena", 231));
        array.add(new Candidate(4, "Keys", 200));
        array.add(new Candidate(2, "Kate", 224));
        array.add(new Candidate(3, "Miles", 224));
        array.add(new Candidate(5, "Croft", 202));

        System.out.println("Unsorted Array");
        for (Candidate candidate : array)
            candidate.printData();

        Collections.sort(array, new CompareMarks());

        System.out.println("\nSorted Array According To Marks");
        for (Candidate candidate : array)
            candidate.printData();
    }
}

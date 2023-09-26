package VI_CollectionFramework.Comparator;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Comparator o=have only one abstract method compare, and some default methods

class JEECandidates extends Candidate {
    LocalDate dob;

    JEECandidates(int id, String student, int marks, LocalDate dob) {
        super(id, student, marks);
        this.dob = dob;
    }

    public void printData() {
        System.out.println("ID: " + super.id + "\t\tStudent: " + super.student + "\t\tMarks: " + super.marks + "\t\tDOB: " + dob);
    }

    public LocalDate getDob() {
        return  dob;
    }
}

class RankSort implements Comparator<JEECandidates> {
    @Override
    public int compare(JEECandidates c1, JEECandidates c2) {
        return c1.marks - c2.marks;
    }
}

public class II_MoreMethodsInComparator {
    public static void main (String[] args) {
        ArrayList<JEECandidates> array = new ArrayList<>();

        array.add(new JEECandidates(1, "Semma", 231, LocalDate.of(2002, 10, 17)));
        array.add(new JEECandidates(2, "Adarsh", 256, LocalDate.of(2002, 8, 19)));
        array.add(new JEECandidates(3, "Harsh", 189, LocalDate.of(2002, 4, 1)));
        array.add(new JEECandidates(4, "Mithil", 231, LocalDate.of(2002, 10, 4)));
        array.add(new JEECandidates(5, "Sparsh", 199, LocalDate.of(2002, 10, 17)));

        System.out.println("Unsorted Array");
        for (Candidate candidate : array)
            candidate.printData();

        Collections.sort(array, new CompareMarks());
        System.out.println("\nSorted Array According To Marks");
        for (Candidate candidate : array)
            candidate.printData();

        //Reversing the sort
        Collections.sort(array, new CompareMarks().reversed());
        System.out.println("\nSorted Array According To Marks Reversed");
        for (Candidate candidate : array)
            candidate.printData();

        //Taking dab as tiebreaker
        Collections.sort(array, new RankSort().reversed().thenComparing(JEECandidates::getDob));
        System.out.println("\nSorted Array According To Marks And Using DOB As Tien Breaker");
        for (Candidate candidate : array)
            candidate.printData();
    }
}

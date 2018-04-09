package practice11;

import java.util.ArrayList;

public class Klass {
    private int number;
    private Student leader;
    private ArrayList<Student> member;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return "Class " + this.number;
    }

    public void assignLeader(Student student) {
        if (member==null){
            member = new ArrayList<Student>();
        }
        if (!member.contains(student)) {
            System.out.print( "It is not one of us.\n");
        }else{
            this.leader = student;
            System.out.print("I am Tom. I know "+student.getName()+" become Leader of "+getDisplayName()+".\n");
        }
    }

    public void appendMember(Student student) {
        if (member == null) {
            member = new ArrayList<Student>();
        }
        member.add(student);
        System.out.print("I am Tom. I know "+student.getName()+" has joined "+getDisplayName()+".\n");

    }

    public boolean isIn(Student student) {
        return member.contains(student);
    }
}

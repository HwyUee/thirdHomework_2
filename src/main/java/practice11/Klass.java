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
        if (null != this.member && member.contains(student)) {
            this.leader = student;
        }
        else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        member=new ArrayList<Student>();
        member.add(student);
        Klass class1 = student.getKlass();
        //class1.get

        System.out.print("I am Tom. I know "+student+" become Leader of "+getDisplayName()+".\n");

    }
    public boolean isIn(Student student){
        return member.contains(student);
    }
}

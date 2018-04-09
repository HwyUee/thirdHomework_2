package practice11;

import java.util.HashSet;
import java.util.Iterator;

public class Teacher extends Person {
    private HashSet<Klass> classes;

    public HashSet<Klass> getClasses() {
        return classes;
    }

    public void setClasses(HashSet<Klass> classes) {
        this.classes = classes;
    }

    public Teacher(int id, String name, int age, HashSet<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String introduce() {
        if (classes == null) {
            classes=new HashSet<Klass>();
        }
        Iterator<Klass> it = classes.iterator();
        System.out.println(classes.size());
        if (classes.size() != 0) {
            if (classes.size() == 1) {

                return super.introduce() + " I am a Teacher. I teach Class " + it.next().getNumber() + ".";
            }
            else
            {
                String kl = it.next().getNumber()+"";
                while (it.hasNext()) {
                    kl = kl+", "+it.next().getNumber();
                }
                return super.introduce() + " I am a Teacher. I teach Class " + kl + ".";
            }
        }

        else return super.introduce() + " I am a Teacher. I teach No Class.";

    }

    public String introduceWith(Student student) {
        if (classes.contains(student.getKlass())) {
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        } else {
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public boolean isTeaching(Student student) {
        return classes.contains(student.getKlass());
    }


}
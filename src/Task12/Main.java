package Task12;

public class Main {

    public static void main(String[] args) {
	    //Task1
        var students = Student.getMass();//создаем массив

        System.out.println("Вывод массива студентов:");
        for(Student p:students){//вывод элементов массива
            System.out.println(p.toString());
        }
        System.out.println();
        //можем просто создать отдельно объекты класса
        Student student1=new Student(15,"Козлов",4);
        System.out.println("Создание 1 объекта класса Student:");
        System.out.println("LastName = "+student1.getLastName()+"\t"+
                "Age = "+student1.getAge()+"\t"+"Mark = "+student1.getMark());

        System.out.println("Изменяем значения поля оценки:");
        student1.setMark(2);
        System.out.println("LastName = "+student1.getLastName()+"\t"+
                "Age = "+student1.getAge()+"\t"+"Mark = "+student1.getMark());

        System.out.println();

        //task 2
        System.out.println("Task2");
        Rectangle rectangle=new Rectangle(5,2,true);
        rectangle.Square(rectangle.getA(),rectangle.getB());
        Paral paral=new Paral(5,2,3,true);//используется конструктор базового класса
        paral.Square(paral.getA(), paral.getB(),paral.getC());
        System.out.println(paral.getGeom());//getGeom есть в базовом класса
    }




}

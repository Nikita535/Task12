package Task12;

public class Student {

    //Поля студента (возраст,фамилия,оценка)
    private int age;
    private String LastName;
    private int mark;

    //конструктор
    public Student(int age, String lastName, int mark) {
        this.age = age;
        LastName = lastName;
        this.mark = mark;
    }

    //сетеры и гетеры для получения поля объякта или устанвки значения этого объекта
    public int getAge() {
        return age;
    }

    public String getLastName() {
        return LastName;
    }

    public int getMark() {
        return mark;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    //переопределение метода toString для более корректного вывода информации
    @Override
    public String toString() {
        return "age=" + age +
                " LastName=" + LastName  +
                " mark=" + mark
                ;
    }

    //массив с фамилиями студентов для псевдо-рандомного заполнения
    static String[] lastnames  = new String[] { "Sidorov", "Ivanov", "Kozlov" };

    public static Student[] getMass() {
        Student[] students=new Student[10];//создание массива из 10 элементов

        for (int i=0;i<10;i++){//цикл перебора
            int a=(int) (Math.random()*15+10);//генерация рандомных чисел в указанном диапазоне
            int b=(int) (Math.random()*2+3);
            students[i]=new Student(a,lastnames[i% lastnames.length],b);//создание объекта с указанными полями
            //lastnames[i% lastnames.length]  берет элемент из массива фамилий с индексом равным остатку от деления
            //количества студентов на длину массива lastnames
        }
        return students;//возвращает созданный и заполненный массив
    }
}

public class Main {
    public static void main(String[]args) {
        Student student = new Student("Popova", "Polina","PKS-419",4);
        Aspirant aspirant = new Aspirant("Smirnov","Pavel","PKS-419",4,"Kursach");
        Student sweet = new Aspirant("Petrov","Dima","PKS-419",5,"Rabota");

        System.out.println("Имя: " + student.firstName + " " + student.lastName + ", группа: " + student.group + ", средняя оценка: " + student.averageMark + ", стипендия: " + student.getscolarship());
        System.out.println("Имя: " + aspirant.firstName + " " + aspirant.lastName + ", группа: " + aspirant.group + ", средняя оценка: " + aspirant.averageMark + ", научная работа: " + aspirant.nauchnayaRabota + ", стипендия: " + aspirant.getscolarship());
        System.out.println("Имя: " + sweet.firstName + " " + sweet.lastName + ", группа: " + sweet.group + ", средняя оценка: " + sweet.averageMark + ", стипендия: " + sweet.getscolarship());

    }
}
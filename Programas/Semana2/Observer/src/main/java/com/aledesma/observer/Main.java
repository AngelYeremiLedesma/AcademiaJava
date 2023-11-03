package com.aledesma.observer;

public class Main {
    public static void main(String[] args) {

        //Creando el subject y sus observers
        System.out.println("************************************************************");
        Teacher teacher1 = new Teacher("Miguel");
        Student student1 = new Student("Angel",teacher1);
        Student student2 = new Student("Leonardo", teacher1);
        Student student3 = new Student("Bryan", teacher1);
        Student student4 = new Student("Said", teacher1);
        Student student5 = new Student("Guillermo", teacher1);
        Student student6 = new Student("Carlos", teacher1);

        teacher1.assignTask("Hagan un programa con Observer"); //asignando una tarea

        System.out.println("************************************************************");

        //Desuscribiendo algunos observadores de nuestro subject
        teacher1.detach(student6);
        teacher1.detach(student5);
        teacher1.detach(student3);
        teacher1.assignTask("Hagan un programa con Predicate");//asignando una tarea

        System.out.println("************************************************************");

        //Creando un nuevo observer y suscribiendo más observers
        Student student7 = new Student("Patrobas", teacher1);
        teacher1.attach(student3);
        teacher1.assignTask("Hagan simuladores");//asignando una tarea


    }
}

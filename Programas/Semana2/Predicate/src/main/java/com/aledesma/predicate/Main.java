package com.aledesma.predicate;

public class Main {
    public static void main(String[] args) {

        UserEntity user1 = new UserEntity("Angel","12345"); //Simula la data que pudiera venir de la BD

        UserEntity userInput = new UserEntity("",""); //Simula data de una request

        // se generan los predicates para verificar si username o password es vacío
        Predicado<UserEntity> pre1 = (t1,t2) -> t2.getUsername().isEmpty();
        Predicado<UserEntity> pre2 = (t1,t2) -> t2.getPassword().isEmpty();

        // se generan los predicates para evaluae si coinciden las credenciales
        Predicado<UserEntity> pre3 = (t1,t2) -> ((t1.getUsername().equals(t2.getUsername()))&&(t1.getPassword().equals(t2.getPassword())));

        // se prueban los predicates
        boolean emptyUsername = pre1.test(user1, userInput);
        boolean emptyPassword = pre2.test(user1, userInput);
        boolean login = pre3.test(user1, userInput);

        //Se hace demás lógica a partir de los resultados anteriores
        if(emptyUsername||emptyPassword){
            System.out.println("HttpStatus.BAD_REQUEST");
            System.out.println("Errors: {");
            if (emptyUsername){
                System.out.println("Empty field at username");
            }
            if (emptyPassword){
                System.out.println("Empty field at password");
            }
            System.out.println("}");
        }else{
            System.out.println("HttpStatus.OK");
            if(login)
                System.out.println("Log in correcto");
            else
                System.out.println("Username o password incorrecto");
        }
    }
}

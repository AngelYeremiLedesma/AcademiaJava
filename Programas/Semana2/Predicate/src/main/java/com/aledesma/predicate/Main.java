package com.aledesma.predicate;

public class Main {
    public static void main(String[] args) {

        UserEntity user1 = new UserEntity("Angel","12345");

        UserEntity userInput = new UserEntity("Angel","12345");

        Predicado<UserEntity> pre1 = (t1,t2) -> t2.getUsername().isEmpty();

        Predicado<UserEntity> pre2 = (t1,t2) -> t2.getPassword().isEmpty();

        Predicado<UserEntity> pre3 = (t1,t2) -> ((t1.getUsername().equals(t2.getUsername()))&&(t1.getPassword().equals(t2.getPassword())));

        boolean emptyUsername = pre1.test(user1, userInput);

        boolean emptyPassword = pre2.test(user1, userInput);

        boolean login = pre3.test(user1, userInput);

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

package com.aledesma.polimorfismo;

public abstract class User implements UserAuthService {

    private String username;
    private String password;

    @Override
    public void login(String username,String password) {
        if(this.password.equals(password)&&this.username.equals(username)){ //Verificacion de credenciales
            System.out.println("Successful Login " + this.username + "!");
        }else{
            System.out.println("Incorrect credentials");
        }
    }

    @Override
    public void register(String username,String password){//Asignación de atributos de objeto para el user
        this.username = username;
        this.password = password;
        System.out.println("Successful Sign up " + this.username + "!");
    }

    public abstract void doingMyActivity();//Metodo propio de cada clase hija

}

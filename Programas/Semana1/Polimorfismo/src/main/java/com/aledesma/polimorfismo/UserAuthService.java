package com.aledesma.polimorfismo;

public interface UserAuthService { //Interface para el Service de autenticacion
    public abstract void register(String name, String password);
    public abstract void login(String username,String password);

}

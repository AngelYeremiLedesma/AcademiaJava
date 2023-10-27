package com.aledesma.polimorfismo;

public interface UserAuthService {
    public abstract void register(String name, String password);
    public abstract void login(String username,String password);

}

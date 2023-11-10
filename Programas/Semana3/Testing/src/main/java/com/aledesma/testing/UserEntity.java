package com.aledesma.testing;

import java.util.Objects;

//Este entity básicamente consiste en los usuarios que se utilizarian para autenticacion o autorizacion
public class UserEntity {
    private Integer id;
    private String username;
    private String password;
    private String role;
    private boolean active;

    private static int counter = 0;


    public UserEntity(String username, String password, String role, boolean active) {
        this.id = ++counter; //La forma de asignar el id a partir de la variable estática
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public UserEntity(Integer id, String username, String password, String role, boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
    }

    public Integer getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public static void setCounter(int counter){
        UserEntity.counter = counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEntity that = (UserEntity) o;
        return id == that.id && active == that.active && Objects.equals(username, that.username) && Objects.equals(password, that.password) && Objects.equals(role, that.role);
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", active=" + active +
                '}';
    }
}

package com.aledesma.polimorfismo;

public class Principal {
    public static void main(String[] args) {

        User[] users = {new Admin(), new Customer(), new Vendor()};
        String[][] usersData = {
                {"admin","elAdminManda"},
                {"customer","aquiLoQueSobraEsBillete"},
                {"vendor","comprenComprenCompren"}
        };

        registerUsers(users, usersData);
        loginUsers(users, usersData);
        doingTheirsActivities(users);

    }

    private static void doingTheirsActivities(User[] users) {

        System.out.println("----------Doing their own activity-------------");
        for(User user: users){
            user.doingMyActivity();
        }
    }

    private static void registerUsers(User[] users, String[][] usersData) {

        System.out.println("----------Registering Users -------------");
        for(int i=0;i<users.length;i++){
            users[i].register(usersData[i][0],usersData[i][1]);
        }

    }

    private static void loginUsers(User[] users, String[][] usersData) {

        System.out.println("----------Logging Users -------------");
        for(int i=0;i<users.length;i++){
            users[i].login(usersData[i][0],usersData[i][1]);
        }
    }
}

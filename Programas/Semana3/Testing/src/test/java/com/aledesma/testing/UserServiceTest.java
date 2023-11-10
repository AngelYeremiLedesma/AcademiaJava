package com.aledesma.testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserServiceTest {

    private static UserService userService = new UserService();

    //Realizado una limpieza de la data y reinicio de la variable estatica Counter
    @BeforeEach
    public void initializing(){
        UserEntity.setCounter(0);
        UserRepository.clearSimulatedData();
    }

    @Test
    public void testCreate(){

        UserEntity esperado = new UserEntity(1,"Miguel","password","ADMIN",true);
        UserEntity obtenido = userService.createUser("Miguel","password","ADMIN",true);

        Assertions.assertEquals(esperado, obtenido);
    }

    @Test
    public void testRead(){

        UserEntity esperado = new UserEntity(1,"Yeremi","password","ADMIN",true);

        userService.createUser("Yeremi","password","ADMIN",true);
        UserEntity obtenido = userService.findUserById(1);

        Assertions.assertEquals(esperado,obtenido);
    }

    @Test
    public void testUpdate(){
        UserEntity esperado = new UserEntity(1,"Angel","passwordSegura","USER",false);

        userService.createUser("Yeremi","password","ADMIN",true);
        userService.updateUser(1,"Angel","passwordSegura","USER",false);

        UserEntity obtenido = userService.findUserById(1);

        Assertions.assertEquals(esperado,obtenido);
    }

    @Test
    public void testDelete(){

        userService.createUser("Yeremi","password","ADMIN",true);
        userService.createUser("Miguel","12345","ADMIN",true);
        userService.createUser("Bryan","Bryan27","USER", true);

        UserEntity creado = userService.findUserById(2);

        Assertions.assertNotNull(creado); //Funciona pues sí retorna un user encontrado

        userService.deleteUserById(2);

        UserEntity borrado = userService.findUserById(2);

        Assertions.assertNull(borrado);//Pasa la prueba, pues se eliminó el user y retorna null

    }
}

package com.aledesma.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Esta es una simulación de repository
public class UserRepository {

    //Este ArrayList es donde guardo temporalmente la data
    private static List<UserEntity> simulatedData= new ArrayList<>();

    //QUERY: SELECT * FROM users WHERE id = <id>
    public static UserEntity findById(int id){
        return simulatedData.stream().filter(u->u.getId()==id).findFirst().orElse(null);
    }

    //Dependiendo de si es contiene Id o no sería un:
    //QUERY: UPDATE users SET columna=nuevoValor WHERE id = <id>
    //QUERY: INSERT INTO users(<columnas>) VALUES(<valores>)
    public static UserEntity save(UserEntity userEntity){
        if(userEntity.getId()!=null){
            simulatedData = simulatedData.stream()
                .map(u->{
                    if (u.getId().equals(userEntity.getId())){
                        return new UserEntity(userEntity.getId(),userEntity.getUsername(), userEntity.getPassword(), userEntity.getRole(), userEntity.isActive());
                    }else{
                        return u;
                    }
                }).collect(Collectors.toList());
            return findById(userEntity.getId());
        }else{
            UserEntity userCreado = new UserEntity(userEntity.getUsername(), userEntity.getPassword(), userEntity.getRole(), userEntity.isActive());
            simulatedData.add(userCreado);
            return userCreado;
        }
    }

    //Aquí con streams y un filter elimino el elemnto por Id,
    //posiblemente en cuestión de tiempo y memoria no sea muy eficiente
    //pues está creando nuevos ArrayLists y recorriendolos
    //supongo que existen métodos propios de ArrayList para esto
    public static void deleteById(Integer id) {
        simulatedData = simulatedData.stream()
                .filter(u->!u.getId().equals(id))
                .collect(Collectors.toList());
    }

    public static void clearSimulatedData(){
        simulatedData.clear();
    }
}

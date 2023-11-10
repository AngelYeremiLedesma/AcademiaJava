# JUnit testing

En este proyecto desarrollado con Maven y JUnit 5:

- main:
	- UserEntity: entity que contiene atributos de utilidad para la autenticación y autorización de los usuarios, se sobreescribió equals para las pruebas
	- UserRepository: este repository simula la data a utilizar en un ArrayList, así como funciones de consulta con las que generalmente se contaría en un Repository como lo son:
		- findById(int id);
		- save(UserEntity userEntity);
		- deleteById(Integer id);
	- UserService: este service define métodos generales para el CRUD de usuarios, debido a que es un CRUD simple no involucra tanta lógica de negocio o verificaciones:
		- findUserById(int id);
		- createUser(UserEntity userEntity);
		- updateUser(UserEntity userEntity);
		- deleteUserById(Integer id);
- test: 
	-UserServiceTest: establece los siguientes tests:
		- initializing(): @BeforeEach, reinicia la data y el counter antes de cada test, ya que como se manejan algunos elementos estáticos, estos se inicializan al crear esas clases y se van modificando en cada test

		- testRead(): crea 1 user y después lo obtiene ingresando su Id, se verifica que sean iguales
		- testCreate(): crea 1 user y verifica que lo regresado coincida con los datos con que se creó ese user, se verifica que sean iguales 
		- testDelete(): se crean 3 users, se verifica que uno de ellos sí exista y no sea null, se elimina ese mismo y se verifica que al buscarlo por Id regrese Null
		- testUpdate(): se crea 1 user, se hace el update de ese user cambiando los datos pero manteniendo el id, y se verifica que al buscarlo de nuevo, coincida con los nuevos datos enviados

Al correr el programa, el resultado es el siguiente:

<p align="center">
  <img src="https://github.com/AngelYeremiLedesma/AcademiaJava/blob/main/Programas/Semana3/Testing/Ejecucion.png" alt="Ejecución del código">
</p>
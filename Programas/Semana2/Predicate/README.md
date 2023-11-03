#Predicate program

En este proyecto se cuenta con:

- UserEntity: es un POJO que contiene datos básicos de un user, como es username y password.
- Predicado: es una interfaz funcional que usa generics, recibe 2 objetos de tipo T, y devuelve un boolean
- Main: simula data para un usuario, donde tenemos el UserEntity con información ya guardada, y otro UserEntity con información que podría provenir de alguna otra parte. Básicamente se hacen 3 implementaciones de Predicado, donde se evalúan:
	-Si el username de entrada es vacío
	-Si el password de entrada es vacío
	-Si las credenciales coinciden 

Al correr el programa, el resultado dependerá de los valores que le demos al UserEntity de entrada, pudiendo tener los siguientes resultados:

<p align="center">
  <img src="https://raw.githubusercontent.com/AngelYeremiLedesma/AcademiaJava/main/Programas/Semana2/Predicate/Ejecucion1.png" alt="Ejecución del código">
</p>

<p align="center">
  <img src="https://raw.githubusercontent.com/AngelYeremiLedesma/AcademiaJava/main/Programas/Semana2/Predicate/Ejecucion2.png" alt="Ejecución del código">
</p>

<p align="center">
  <img src="https://raw.githubusercontent.com/AngelYeremiLedesma/AcademiaJava/main/Programas/Semana2/Predicate/Ejecucion3.png" alt="Ejecución del código">
</p>

<p align="center">
  <img src="https://raw.githubusercontent.com/AngelYeremiLedesma/AcademiaJava/main/Programas/Semana2/Predicate/Ejecucion4.png" alt="Ejecución del código">
</p>

# Programa Polimorfismo-Interfaces-Clases Abstractas

En este proyecto se cuenta con los siguientes elementos:

- Interface UserAuthService que declara métodos abstractos para el login y el register
- Clase Abstracta User, la cual implementa la interface UserAuthService e implementa concretamente los dos métodos de dicha interface, además declara atributos de un usuario como lo son su username y su password. Igualmente establece el contrato para un método que deberá implementar cada clase hija concreta.
- Clases concretas que extienden de User enfocadas a los tipos de roles Admin, Customer y Vendor, cada una implementa el método de su clase super doingMyActivity(), haciendo cada uno su propia actividad.
- Archivo main que:
	- Simula datos de entrada con el uso de dos arreglos, uno de la clase abstracta User, pero que contiene objetos de sus clases hijas concretas, y el otro un arreglo bidimensional que contiene users y passwords
	- Realiza las funciones de registrar y logging para cada uno de los elementos de arreglo, así como realizar el método propio de cada clase concreta, pero esto usando prolimorfismo.


Ejecución del código:

<p align="center">
  <img src="https://raw.githubusercontent.com/AngelYeremiLedesma/AcademiaJava/main/Programas/Semana1/Polimorfismo/Ejecucion.png" alt="Ejecución del código">
</p>




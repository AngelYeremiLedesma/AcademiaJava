# Observer program

En este proyecto se cuenta con:

- Subject: clase abstracta que establece nuestro sujeto a observar
- Observer: clase asbtracta que engloba a nuestros observadores
- Teacher: clase concreta que es un subject a observar
- Student: clase concreta observadora
- Main: Se genera una instancia de subject de tipo Teacher a estudiar, así como 6 observadores de tipo Student:
	- El teacher asigna una tarea, y sus 6 observadores confirman de recibido
	- Algunos students se desuscriben, y cuando el teacher asigna una nueva asignación, sólo los restantes confirman de recibido
	- Se suscriben otros students a dicho teacher, se asigna una nueva tarea y los nuevos ya también reciben la última tarea asignada.

Al correr el programa, el resultado dependerá de los valores que le demos al UserEntity de entrada, pudiendo tener los siguientes resultados:

<p align="center">
  <img src="https://github.com/AngelYeremiLedesma/AcademiaJava/blob/main/Programas/Semana2/Observer/Ejecucion.PNG" alt="Ejecución del código">
</p>


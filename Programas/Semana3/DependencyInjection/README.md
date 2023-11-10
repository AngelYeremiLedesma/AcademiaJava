# Inyección de dependencias

En este proyecto se cuenta con:

- Planta: es la interface que define el comportamiento de las plantas, para este caso tenemos cerales,frutas y hierbas especiales
- Parcela: es el elemento al cual se leinyectará el tipo de planta
- Injector: elemento que crea los objetos concretos que implementan planta y los inyecta en la parcerla
- Main: Se crean 3 parcerlas, cada una con su seción y número específicos de su ubiación, posteriormente con ayuda del inyector se les inyecta el tipo de planta a cultivar, hacen sus métodos propios, y luego se les inyecta un null cuando son cultivadas.

Al correr el programa, el resultado es el siguiente:

<p align="center">
  <img src="https://github.com/AngelYeremiLedesma/AcademiaJava/blob/main/Programas/Semana3/DependencyInjection/Ejecucion.png" alt="Ejecución del código">
</p>

# Programa Singleton

En este programa se utiliza el **patrón de diseño Singleton** para obtener una instancia de un Encoder el cual se podría usar para codificar las contrasenias que se guardarán en la Base de Datos.
En este caso la clase Encoder cuenta con un atributo name que para el único objeto instanciado es definido como BCryptEncoder.
Para la implementación del patrón de diseño Singleton:
- Se hace uso de una variable estática de tipo Encoder
- Se declara privado el constructor
- Se declara el método público getInstance() que verifica si la variable estática ya apunta hacia un objeto
  
Por su parte en el main se declaran 6 variables de referencia que debido al patrón antes descrito apuntan a un mismo objeto

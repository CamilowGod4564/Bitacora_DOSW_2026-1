# SEMANA 3 - PATRONES DE DISEÑO PARTE 2

## Ejercicios Hechos en Clase

### Factory Method - Comercio electronico
![](./docs/Semana3/FactoryMethod.png)

Para la solucion de este ejercicio me guie en los hechos en las seciones anteriores y 
en el laboratorio, simpre debe haber una clase abstracta de fabrica y otra interfaz 
que implementa un comportamiento comun en todas las clases a crear, en este caso 
en metodos de pago.
### Abstract Factory - Empresa de Videojuegos (Xbox y PlayStation)
![](./docs/Semana3/AbstractFactory.png)

Para este ejercicio, debemos saber bien cuales son las fabricas que queremos definir 
y cuales son las clases concretas que pertenecen a una misma abstraccion, por ejemplo 
el control de xbox y playStation son clases implementadas por la interfaz control, 
si planeamos bien las familias de objetos y las fabricas, queda muy bien hecho en codigo.
### Builder - Fabrica de juguetes
![](./docs/Semana3/Builder.png)

En este ejercicio me ayude de la IA al momento de representar la salida, es por eso que 
se ve la figura de la muñeca clasica y el muñeco de accion, ahora sobre el patron, comprendo
que aunque los distintos muñecos tengan los metodos de la interfaz en comun, a estos se les 
puede agregar muchas mas cosas sin cambiar ningun tipo de logica solamente como se requiera el 
muñeco.

### Adapter - Gasolineria Inteligente
![](./docs/Semana3/Adapter.png)



### Bridge - Figuras y Colores
![](./docs/Semana3/Bridge.png)

### Composite - Bodega de productos 
![](./docs/Semana3/Composite.png)


## Ejercicios Hechos en laboratorio

### Decorador - Simulador de batalla naval
![](./docs/Semana3/Decorator.png)

Para este ejercicio reforce el concepto de encapsulamiento, ya que en este un objeto base 
como el barco, se encapsula de acuerdo a lo que quiera el cliente, asi pues se agregan 
mas atributos y metodos incluso el mismo varias veces.

### Chain of responsability - Embajada de estados unidos
![](./docs/Semana3/ChainOfResponsability.png)

Aca se comprende un poco la idea de como pasar entre controladores, a manejar un poco mejor los condicionales.

### Command - Personajes de videojuegos
![](./docs/Semana3/Command.png)

### Iterator - Viaje a roma (diagrama)
### Strategy - Aplicacion de navegacion
![](./docs/Semana3/Strategy.png)


## PREGUNTAS FINALES

- ¿Qué entendía mal antes?

Antes sentia que los patrones de diseño son un tema demasiado extenso y dificil de comprender,
que cada patron tiene su forma de ser y aprenderselos seria algo muy complicado.
- ¿Qué entiendo ahora?

Entiendo que los patrones si son un tema extenso, pero con practica se sabe que todos 
respetan los principios SOLID, por lo que no van tan dispersos, tienen su propia logica 
pero la mayoria implementa interfaces comunes y abstracciones respetando su integridad.

- ¿Qué me falta reforzar?

Me falta reforzar los demas patrones de diseño no vistos aca y que sean un poco más complejos de entender.
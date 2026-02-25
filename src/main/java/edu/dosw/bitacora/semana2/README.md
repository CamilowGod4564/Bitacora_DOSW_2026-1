# SEMANA 2 - PATRONES DE DISEÑO

### 1. FACTORY METHOD
![](./docs/Semana2/FactoryMethod.png)

Para la logica de este problema nos guiamos en los ejercicios anteriores hechos en clase 
, asi pues, sabemos que debemos definir dos elementos clave para este patron, el primero la clase 
abstracta de fabrica que extiende de acuerdo al objeto que debamos crear y la interfaz que 
tiene los objetos en comun y que comparten su comportamiento.
### 2. ADAPTER
![](./docs/Semana2/Adapter.png)

Para este ejercicio tuvimos en cuenta que no debemos crear un adaptador por cada clase de impresion 
ya que la impresion simple es la que normalmente se usa en el sistema y la que requiere atributos adicionales 
es la impresion detallada, por ende para este si creamos un adapter que dado el mensaje, tambien contenga el autor y 
la fecha del mensaje.
### 3. MEMENTO
![](./docs/Semana2/Memento.png)

Este ejercicio en comparacion fue un poco mas complicado de entender de los demas, por un lado no abstraemos ni 
implementamos un comportamiento, ya que se encapsula un objeto con toda su informacion dentro de otro objeto, en este caso 
la clase con la que interactuamos es el editor, cuando queremos guardar algo llamamos al memento y el historial es una pila 
de mementos la cual usamos para guardarlos y restarurarlos cuando nos lo pida.
### 4. SOLID
![](./docs/Semana2/CalculadoraSolid.png)

Para el ultimo de los ejercicios tomamos en cuenta la información general de los principios solid, en primer lugar con (S)ingle 
responsability ya que las clases de suma, resta, multiplicacion y division tienen la unica tarea de operar dos numeros de acuerdo 
a su comportamiento unico, Luego esta (O)pen/close, ya que podemos añadir más operaciones sin tener que modificar la estructura interna 
o modificar codigo existente. Por último tenemos a (I)nterface segregation la cual, dejamos que las interfaces se encarguen 
del comportamiento mas no sus propias clases, implementando la interfaz operacion, todas las clases solo se encargan de sobreescribir 
de acuerdo a su logica mas no crear nuevos metodos ni comportamientos.

### PREGUNTAS FINALES
- ¿Qué entendía mal antes?

No entendia como funcionaba correctamente los patrones como el adapter o el memento, no entendia como aplicar los adaptadores ni como guardar 
copias de un objeto y guardarlas.

- ¿Qué entiendo ahora?

Ahora es mucho mas facil aplicar los patrones de diseño vistos en esta semana, la forma de aplicarlos y las partes comunes en cada patron de diseño.

- ¿Qué me falta reforzar?

Falta repasar mas sobre los otros patrones que casi no vemos en clase, saber mas su estructura y su funcion 
tal y como se hizo en los ejercicios de esta semana

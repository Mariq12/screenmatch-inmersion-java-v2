# <p align="center">Screenmatch de la inmersión java</p>

El código Java proporciona un programa interactivo que muestra información sobre 3 películas, como su título, fecha de lanzamiento, evaluación y sinopsis. Luego, solicita al usuario que ingrese tres calificaciones para la película y calcula la media de estas calificaciones. Finalmente, muestra la media calculada al usuario. 
Además, verifica una condición usando `if` y `else`.

---
## Breve explicación del código y los ciclos utilizados:

**1. Importación de paquetes:** Se importa la clase Scanner para permitir la entrada de datos desde el teclado.

**2. Declaración de variables de películas:** Se declaran matrices para almacenar los nombres de las películas, las fechas de lanzamiento, las evaluaciones, el estado de inclusión en el Plan Básico y las sinopsis de las películas.

**3. Inicio del bucle principal while:** El programa entra en un bucle while que se ejecuta mientras la variable continuar sea verdadera. Esta variable se utiliza para controlar si el usuario desea continuar interactuando con el programa.

**4. Mostrar películas disponibles:** Se muestra una lista numerada de películas disponibles para que el usuario las seleccione.

**5. Selección de película:** El usuario selecciona una película ingresando el número correspondiente. Se verifica si la opción ingresada es válida.

**7. Mostrar detalles de la película seleccionada:** Se muestran los detalles de la película seleccionada, incluyendo su nombre, fecha de lanzamiento, evaluación, estado de inclusión en el Plan Básico, sinopsis y si es una película popular o retro.

**8. Ingresar evaluaciones:** Se solicita al usuario que ingrese tres evaluaciones para la película seleccionada.

**9. Cálculo de la media de las evaluaciones:** Se calcula la media de las tres evaluaciones ingresadas.

**10. Preguntar al usuario si quiere continuar:** Se pregunta al usuario si desea elegir otra película o salir del programa.

**11. Cierre del Scanner:** Una vez que el usuario decide salir del programa, se cierra el objeto Scanner.

---

## Uso del ciclo While
El bucle `while` para permitir al usuario interactuar con el programa mientras desee explorar las películas y darles evaluaciones.

## Uso de ciclos For
Se usa el ciclo `for` para mostrar las películas disponibles, solicitar evaluaciones y calcular la media de las evaluaciones.

---

## Uso de condicionales IF Y ELSE
El programa verifica una condición:

`if`Si la pelicula es creada mayor o igual a 2003 nos muestra el mensaje que: 

        Película Popular en el momento

`else` Caso contrario muestra el mesaje:

        Película Retro que vale la pena ver

---
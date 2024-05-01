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

## Resultado

<p align="center">
  <img src="https://live.staticflickr.com/65535/53691679521_7f2ab42db4.jpg" alt="Paso 5"/>
</p>

## Tecnologías utilizadas durante el curso
* Java

## Tecnologías utilizadas durante el curso
* VsCode
* Maven
* Git

---

## Configuración

### JDK JAVA 
**Pasos:**

1. Descargar en el siguiente link la versión jdk-17:

        https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html

2. Instalar JDK

3. Configurar 

    **Pasos:**

    3.1. Ingresar a Editar variables de entorno del sistema desde el buscador de Windows.

<p align="center">
  <img src="https://live.staticflickr.com/65535/53690397931_335ee366a8.jpg" alt="Paso 1"/>
</p>

    3.2. Dar clic en Variables de entorno.

<p align="center">
  <img src="https://live.staticflickr.com/65535/53690611433_df0ed822d6.jpg" alt="Paso 2"/>
</p>

    3.3. Ir a la ruta del JDK 
        - Copiar la ruta del JDK.
            `C:\Program Files\Java\jdk-17`
        - Dar clic en `Editar la variable del sistema`.
        - Agregar el nombre de la variable `JAVA_HOME`
        - Pegar la ruta del JDK.
        - Clic en Aceptar

<p align="center">
  <img src="https://live.staticflickr.com/65535/53689516437_0d5b5c50fb.jpg" alt="Paso 3"/>
</p>
    
    3.4. Ingresar en en el `Path` de **variables del sistema** dando doble clic
        - Dar clic en nuevo.
        - Copiar la ruta del JDK
            `C:\Program Files\Java\jdk-17\bin`
        - Pegar la ruta del JDK.
        - Clic en Aceptar

<p align="center">
  <img src="https://live.staticflickr.com/65535/53690748379_622c125c14.jpg" alt="Paso 4"/>
</p>

---

### VsCode

   **Pasos:**

1. Descargar VsCode en el siguiente link de acuerdo al sistema operativo:

        https://code.visualstudio.com/

2. Instalar VsCode
Una vez descargado lo ejecutamos y dar clic en `Siguiente`.
3. Instalar desde VsCode la extensión:

       Extension Pack for Java

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692023848_2db0cf163e.jpg" alt="Paso 7"/>
</p>

---

        IntelliCode

<p align="center">
  <img src="https://live.staticflickr.com/65535/53692023858_90b54879ca.jpg" alt="Paso 8"/>
</p>


---

### Maven

**Pasos:**

1. Descargar en el siguiente link la versión apache-maven-3.9.6-bin.zip:

        https://maven.apache.org/download.cgi

2.  Descomprimir y copiar la carpeta en disco C
        
3.  Ingresar en el `Path` de **variables del sistema** dando doble clic
    **Pasos:**
    - Dar clic en nuevo.
    - Copiar la ruta del JDK
        `C:\Program Files\Java\jdk-17\bin`
    - Pegar la ruta del JDK.
    - Clic en Aceptar

---

### Git

**Pasos:**

1. Descarga el instalador de GIT, en este caso para Windows.
        
        https://git-scm.com/downloads

2. Descargado el instalador, hacer doble clic sobre el ejecutable para que comience el proceso de instalación.
3. Seguir las instrucciones que aparecerán en pantalla. Al igual que cualquier otro programa, aparecerá “Next” (siguiente) en varias ocasiones hasta que aparezca la opción “Finish” (terminar) para completar la instalación.
4. Abrir el símbolo del sistema y escribir los siguientes comandos en la terminal, se debe cambiar `Tu Nombre` y `ejemplo@email.com` por nuestra información:
    
        git config --global user.name "Tu nombre"

        git config --global user.email "ejemplo@email.com"


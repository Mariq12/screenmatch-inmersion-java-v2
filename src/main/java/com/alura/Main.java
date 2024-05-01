package com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------- Bienvenidos a la inmersión en Java --------\n");

        // Declaración de variables de las películas 
        String[] nombres = {"City Hunter", "Harry Potter 1 y la piedra filosofal", "Crepúsculo Luna Nueva", "Cantinflas el profe"};
        int[] fechasDeLanzamiento = {2024, 2001, 2009, 1971};
        double[] evaluaciones = {4.9,4.8, 4.2, 4.6};
        boolean[] incluidosEnElPlanBasico = {false, true, true, false};
        String[] sinopsis = {   
                "Un detective privado de puntería extraordinaria y mujeriego, se alía a regañadientes con la hermana de su difunto compañero para investigar su muerte",
                "Un niño descubre que es un mago y asiste a una escuela de magia",
                "Una joven se encuentra en un triángulo amoroso entre un vampiro y un hombre lobo",
                "Un maestro poco convencional transforma la vida de sus estudiantes"
        };
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar las películas disponibles
            System.out.println("Películas disponibles:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i]);
            }

            System.out.print("\nSeleccione una película (1-" + nombres.length + ") o ingrese 0 para salir: ");

            int opcionPelicula = teclado.nextInt();

            if (opcionPelicula == 0) {
                continuar = false; // Salir del bucle si se ingresa 0
                break;
            } else if (opcionPelicula < 1 || opcionPelicula > nombres.length) {
                System.out.println("Opción inválida. Por favor, seleccione una película válida.");
                continue; // Volver a solicitar la selección si la opción es inválida
            }

            // Índice de la película seleccionada (se resta 1 porque los índices comienzan en 0)
            int indicePelicula = opcionPelicula - 1;

            // Mostrar los detalles de la película seleccionada
            System.out.println("\nPelícula seleccionada: " + nombres[indicePelicula]);
            System.out.println("Fecha de Lanzamiento: " + fechasDeLanzamiento[indicePelicula]);
            System.out.println("Evaluación: " + evaluaciones[indicePelicula]);
            System.out.print("Incluida en el Plan Básico: ");
            if (incluidosEnElPlanBasico[indicePelicula]) {
                System.out.println("Si");
            } else {
                System.out.println("No");
            }
            System.out.println("Sinopsis: " + sinopsis[indicePelicula]);

            // Condición if y else para la fecha de lanzamiento
            if (fechasDeLanzamiento[indicePelicula] >= 2023) {
                System.out.println("Película Popular en el momento");
            } else {
                System.out.println("Película Retro que vale la pena ver");
            }

            System.out.println("\n----- Ingresa la nota que le darías a esta película -----");
            System.out.println("\nLa nota debe estar entre 1 a 5\n");

            // Solicitar las notas de la película
            double totalNotas = 0;
            int cantidadEvaluaciones = 3; // Variable para la cantidad de notas
            for (int i = 0; i < cantidadEvaluaciones; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double notaPelicula = teclado.nextDouble();
                totalNotas += notaPelicula;
            }

            // Calcular la media de las notas
            double media = totalNotas / cantidadEvaluaciones;
            String mediaFormateada = String.format("%.2f", media);
            System.out.println("\nLa media de la evaluación de " + nombres[indicePelicula] +
                    " es: " + mediaFormateada);

            // Preguntar al usuario si quiere continuar
            System.out.print("\n¿Desea elegir otra película? (Sí: 1, No: 0): ");
            int opcionContinuar = teclado.nextInt();
            if (opcionContinuar == 0) {
                continuar = false;
            }
        }

        // Cerrar el Scanner
        teclado.close();
    }
}



/*package com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------- Bienvenidos a la inmersión en Java --------\n");

        // Declaración de variables de las películas 
        String[] nombres = {"Harry Potter 1 y la piedra filosofal", "Crepúsculo Luna Nueva", "Cantinflas el profe"};
        int[] fechasDeLanzamiento = {2001, 2009, 1971};
        double[] evaluaciones = {4.8, 4.2, 4.6};
        boolean[] incluidosEnElPlanBasico = {true, true, false};
        String[] sinopsis = {
                "Un niño descubre que es un mago y asiste a una escuela de magia",
                "Una joven se encuentra en un triángulo amoroso entre un vampiro y un hombre lobo",
                "Un maestro poco convencional transforma la vida de sus estudiantes"
        };
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar las películas disponibles
            System.out.println("Películas disponibles:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i]);
            }

            System.out.print("\nSeleccione una película (1-" + nombres.length + ") o ingrese 0 para salir: ");

            int opcionPelicula = teclado.nextInt();

            if (opcionPelicula == 0) {
                continuar = false; // Salir del bucle si se ingresa 0
                break;
            } else if (opcionPelicula < 1 || opcionPelicula > nombres.length) {
                System.out.println("Opción inválida. Por favor, seleccione una película válida.");
                continue; // Volver a solicitar la selección si la opción es inválida
            }

            // Índice de la película seleccionada (se resta 1 porque los índices comienzan en 0)
            int indicePelicula = opcionPelicula - 1;

            // Mostrar los detalles de la película seleccionada
            System.out.println("\nPelícula seleccionada: " + nombres[indicePelicula]);
            System.out.println("Fecha de Lanzamiento: " + fechasDeLanzamiento[indicePelicula]);
            System.out.println("Evaluación: " + evaluaciones[indicePelicula]);
            System.out.println("Incluida en el Plan Básico: " + incluidosEnElPlanBasico[indicePelicula]);
            System.out.println("Sinopsis: " + sinopsis[indicePelicula]);

            // Condición if y else para la fecha de lanzamiento
            if (fechasDeLanzamiento[indicePelicula] >= 2023) {
                System.out.println("Película Popular en el momento");
            } else {
                System.out.println("Película Retro que vale la pena ver");
            }

            System.out.println("\n----- Ingresa la nota que le darías a esta película -----");
            System.out.println("\nLa nota debe estar entre 1 a 5\n");

            // Solicitar las notas de la película
            double totalNotas = 0;
            int cantidadEvaluaciones = 3; // Variable para la cantidad de notas
            for (int i = 0; i < cantidadEvaluaciones; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double notaPelicula = teclado.nextDouble();
                totalNotas += notaPelicula;
            }

            // Calcular la media de las notas
            double media = totalNotas / cantidadEvaluaciones;
            String mediaFormateada = String.format("%.2f", media);
            System.out.println("\nLa media de la evaluación de " + nombres[indicePelicula] +
                    " es: " + mediaFormateada);

            // Preguntar al usuario si quiere continuar
            System.out.print("\n¿Desea elegir otra película? (Sí: 1, No: 0): ");
            int opcionContinuar = teclado.nextInt();
            if (opcionContinuar == 0) {
                continuar = false;
            }
        }

        // Cerrar el Scanner
        teclado.close();
    }
}
*/



/*package com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n-------- Bienvenidos a la inmersión en Java --------\n");

        // Declaración de variables de las películas 
        String[] nombres = {"Harry Potter 1 y la piedra filosofal", "Crepúsculo Luna Nueva", "Cantinflas el profe"};
        int[] fechasDeLanzamiento = {2001, 2009, 1971};
        double[] evaluaciones = {4.8, 4.2, 4.6};
        boolean[] incluidosEnElPlanBasico = {true, true, false};
        String[] sinopsis = {
                "Un niño descubre que es un mago y asiste a una escuela de magia",
                "Una joven se encuentra en un triángulo amoroso entre un vampiro y un hombre lobo",
                "Un maestro poco convencional transforma la vida de sus estudiantes"
        };
        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar las películas disponibles
            System.out.println("Películas disponibles:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i]);
            }

            System.out.print("\n Seleccione una película (1-" + nombres.length + ") o ingrese 0 para salir: ");

            int opcionPelicula = teclado.nextInt();

            if (opcionPelicula == 0) {
                continuar = false; // Salir del bucle si se ingresa 0
                break;
            } else if (opcionPelicula < 1 || opcionPelicula > nombres.length) {
                System.out.println("Opción inválida. Por favor, seleccione una película válida.");
                continue; // Volver a solicitar la selección si la opción es inválida
            }

            // Índice de la película seleccionada (se resta 1 porque los índices comienzan en 0)
            int indicePelicula = opcionPelicula - 1;

            // Mostrar los detalles de la película seleccionada
            System.out.println("\nPelícula seleccionada: " + nombres[indicePelicula]);
            System.out.println("Fecha de Lanzamiento: " + fechasDeLanzamiento[indicePelicula]);
            System.out.println("Evaluación: " + evaluaciones[indicePelicula]);
            System.out.println("Incluida en el Plan Básico: " + incluidosEnElPlanBasico[indicePelicula]);
            System.out.println("Sinopsis: " + sinopsis[indicePelicula]);

            // Condición if y else para la fecha de lanzamiento
            if (fechasDeLanzamiento[indicePelicula] >= 2023) {
                System.out.println("Película Popular en el momento");
            } else {
                System.out.println("Película Retro que vale la pena ver");
            }

            System.out.println("\n----- Ingresa la nota que le darías a esta película -----");
            System.out.println("\nLa nota debe estar entre 1 a 5\n");

            // Solicitar las 3 notas de la película
            double totalNotas = 0;
            for (int i = 0; i < 3; i++) {
                System.out.print("Nota " + (i + 1) + ": ");
                double notaPelicula = teclado.nextDouble();
                totalNotas += notaPelicula;
            }

            // Calcular la media de las notas
            double media = totalNotas / 3;
            System.out.println("\nLa media de la evaluación de " + nombres[indicePelicula] +
                    " es: " + media);

            // Preguntar al usuario si quiere continuar
            System.out.print("\n¿Desea elegir otra película? (Sí: 1, No: 0): ");
            int opcionContinuar = teclado.nextInt();
            if (opcionContinuar == 0) {
                continuar = false;
            }
        }

        // Cerrar el Scanner
        teclado.close();
    }
}
*/




/*package com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");

        // Declaración de variables
        String[] nombres = {"Harry Potter 1 (y la piedra filosofal)", "Crepúsculo Luna Nueva", "Cantinflas el profe"};
        int[] fechasDeLanzamiento = {2001, 2009, 1971};
        double[] evaluaciones = {4.8, 4.2, 4.6};
        boolean[] incluidosEnElPlanBasico = {true, true, false};
        String[] sinopsis = {
                "Un niño descubre que es un mago y asiste a una escuela de magia",
                "Una joven se encuentra en un triángulo amoroso entre un vampiro y un hombre lobo",
                "Un maestro poco convencional transforma la vida de sus estudiantes"
        };

        Scanner teclado = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            // Mostrar las películas disponibles
            System.out.println("Películas disponibles:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i]);
            }

            System.out.println("Seleccione una película (1-" + nombres.length + ") o ingrese 0 para salir:");

            int opcionPelicula = teclado.nextInt();

            if (opcionPelicula == 0) {
                continuar = false; // Salir del bucle si se ingresa 0
                break;
            } else if (opcionPelicula < 1 || opcionPelicula > nombres.length) {
                System.out.println("Opción inválida. Por favor, seleccione una película válida.");
                continue; // Volver a solicitar la selección si la opción es inválida
            }

            // Índice de la película seleccionada (se resta 1 porque los índices comienzan en 0)
            int indicePelicula = opcionPelicula - 1;

            // Mostrar los detalles de la película seleccionada
            System.out.println("\nPelícula seleccionada: " + nombres[indicePelicula]);
            System.out.println("Fecha de Lanzamiento: " + fechasDeLanzamiento[indicePelicula]);
            System.out.println("Evaluación: " + evaluaciones[indicePelicula]);
            System.out.println("Incluida en el Plan Básico: " + incluidosEnElPlanBasico[indicePelicula]);
            System.out.println("Sinopsis: " + sinopsis[indicePelicula]);

            // Solicitar las 3 notas de la película
            double totalNotas = 0;
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingresa la nota #" + (i + 1) + " que le darías a esta película:");
                double notaPelicula = teclado.nextDouble();
                totalNotas += notaPelicula;
            }

            // Calcular la media de las notas
            double media = totalNotas / 3;
            System.out.println("La media de la evaluación de " + nombres[indicePelicula] +
                    " es: " + media);

            // Preguntar al usuario si quiere continuar
            System.out.println("¿Desea elegir otra película? (Sí: 1, No: 0)");
            int opcionContinuar = teclado.nextInt();
            if (opcionContinuar == 0) {
                continuar = false;
            }
        }

        // Cerrar el Scanner
        teclado.close();
    }
}
*/




/*package com.alura;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");
        
        // Declaración de variables
        String[] nombres = {"Harry Potter 1 (y la piedra filosofal)", "Crepúsculo Luna Nueva", "Cantinflas el profe"};
        int[] fechasDeLanzamiento = {2001, 2009, 1971};
        double[] evaluaciones = {4.8, 4.2, 4.6};
        boolean[] incluidosEnElPlanBasico = {true, true, false};
        String[] sinopsis = {
                "Un niño descubre que es un mago y asiste a una escuela de magia",
                "Una joven se encuentra en un triángulo amoroso entre un vampiro y un hombre lobo",
                "Un maestro poco convencional transforma la vida de sus estudiantes"
        };

        // Ciclo para cada película
        Scanner teclado = new Scanner(System.in);
        while (true) {
            // Mostrar las películas disponibles
            System.out.println("Películas disponibles:");
            for (int i = 0; i < nombres.length; i++) {
                System.out.println((i + 1) + ". " + nombres[i]);
            }
            System.out.println("Seleccione una película (1-" + nombres.length + ") o ingrese 0 para salir:");

            int opcion = teclado.nextInt();
            if (opcion == 0) {
                break; // Salir del bucle si se ingresa 0
            } else if (opcion < 1 || opcion > nombres.length) {
                System.out.println("Opción inválida. Por favor, seleccione una película válida.");
                continue; // Volver a solicitar la selección si la opción es inválida
            }

            // Índice de la película seleccionada (se resta 1 porque los índices comienzan en 0)
            int indicePelicula = opcion - 1;

            // Mostrar los detalles de la película seleccionada
            System.out.println("\nPelícula seleccionada: " + nombres[indicePelicula]);
            System.out.println("Fecha de Lanzamiento: " + fechasDeLanzamiento[indicePelicula]);
            System.out.println("Evaluación: " + evaluaciones[indicePelicula]);
            System.out.println("Incluida en el Plan Básico: " + incluidosEnElPlanBasico[indicePelicula]);
            System.out.println("Sinopsis: " + sinopsis[indicePelicula]);

            // Solicitar la evaluación de la película
            System.out.println("Ingresa la nota que le darías a esta película:");
            double notaPelicula = teclado.nextDouble();

            // Calcular la nueva media de la evaluación
            double mediaEvaluacion = (evaluaciones[indicePelicula] + notaPelicula) / 2;
            System.out.println("La nueva media de la evaluación de " + nombres[indicePelicula] +
                    " es: " + mediaEvaluacion);
        }

        // Cerrar el Scanner
        teclado.close();
    }
}
*/
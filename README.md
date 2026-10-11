# Práctica: Método de Gauss-Jordan

**Materia:** Métodos Numéricos  
**Unidad:** 3  
**Institución:** Instituto Tecnológico Superior de Xalapa  
**Lenguaje:** Java

## 1. Descripción del proyecto

El objetivo de esta práctica es implementar el método de Gauss-Jordan en Java para resolver un sistema de ecuaciones lineales. Para ello, se reutiliza el método de eliminación gaussiana de la práctica anterior y se agregan los procedimientos necesarios para normalizar los pivotes y eliminar los coeficientes que se encuentran por encima de la diagonal principal.

Al finalizar, la matriz aumentada se transforma en una matriz identidad y las soluciones se obtienen directamente de la última columna.

## 2. Estructura modular

El proyecto está dividido en cuatro clases:

- **defMatrizz.java:** define y devuelve la matriz aumentada del sistema de ecuaciones.
- **Gauss.java:** realiza la eliminación gaussiana para convertir la matriz en una matriz triangular superior.
- **GaussJordan.java:** reutiliza el método de Gauss y realiza la normalización de los pivotes y la eliminación de los coeficientes superiores.
- **LanzadorGaussJordan.java:** contiene el método `main`, ejecuta el programa y muestra la matriz reducida y las soluciones.

La implementación utiliza el paso de referencias de la matriz para que las modificaciones realizadas por los métodos se reflejen en el mismo arreglo.

## 3. Requisitos

- Tener instalado el JDK de Java.
- Contar con IntelliJ IDEA o una terminal compatible con Java.

## 4. Cómo compilar y ejecutar

Los siguientes comandos se ejecutan desde la carpeta que contiene los archivos `.java`. En este proyecto, las clases no utilizan una declaración `package`.

### Compilar

```bash
javac -d out src/defMatrizz.java src/Gauss.java src/GaussJordan.java src/LanzadorGaussJordan.java
```

### Ejecutar

```bash
java -cp out LanzadorGaussJordan
```

También es posible ejecutar el programa directamente desde IntelliJ IDEA abriendo `LanzadorGaussJordan.java` y seleccionando la opción Run.

## 5. Sistema de prueba

Se utiliza el siguiente sistema de ecuaciones:

```text
3x - 0.1y - 0.2z = 7.85
0.1x + 7y - 0.3z = -19.3
0.3x - 0.2y + 10z = 71.4
```

## 6. Salida de consola

```text
Matriz aumentada original:
    3.0000   -0.1000   -0.2000    7.8500
    0.1000    7.0000   -0.3000  -19.3000
    0.3000   -0.2000   10.0000   71.4000

Matriz reducida (identidad y soluciones):
    1.0000    0.0000    0.0000    3.0000
    0.0000    1.0000    0.0000   -2.5000
    0.0000    0.0000    1.0000    7.0000

Soluciones del sistema:
x1 = 3.0000
x2 = -2.5000
x3 = 7.0000
```

## 7. Conclusión

La implementación permitió comprender cómo funciona el método de Gauss-Jordan para resolver sistemas de ecuaciones lineales. La reutilización de la eliminación gaussiana facilitó el desarrollo del algoritmo y evitó repetir código. Además, la separación en clases permitió organizar mejor las responsabilidades del programa y obtener las soluciones directamente a partir de la matriz reducida.

Como mejora, se puede incorporar el intercambio automático de filas para trabajar con sistemas que presenten pivotes iguales a cero o muy pequeños.
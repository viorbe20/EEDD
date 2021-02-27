package Bisiesto;

/****************************************************************************
 * Pruebas JUnit de esBisiesto
 * ****************************************************************************
*Propósito
*****************************************************************************
*Aprender a crear clases de JUnit desde Eclipse
*
*****************************************************************************
*Descripción de la tarea
*****************************************************************************
*Implementa el programa de la tarea Camino básico esBisiesto.
*Crea una nueva clase de JUnit 5 para probar el método de la clase que calcula.
*Crea los asserts necesarios para ejecutar las pruebas que diseñaste en dicha tarea anterior.
*Ejecuta dicha tarea y comprueba si el código presenta alguna anomalía.
*****************************************************************************
*@author Virginia Ordoño Bernier
*@date febrero 2021
*****************************************************************************
 */

public class bisiesto {

  // Si es divisible entre 4 y no es divisible entre 100 o es divisible entre 100 y 400.
  public boolean esBisiesto(int year) {
    if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)) {
      return true;
    } else {
      return false;
    }
  }

  public bisiesto() {}
}




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
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;

public class bisiestoTest {
 
  
  @BeforeAll        //Se ejecuta al inicio.
  static void setUpBeforeClass() throws Exception {
    System.out.println("Inicializando JUnit.");
  }
  
  @AfterAll     //Se ejecuta al final del programa.
  static void setUpAfterAll() throws Exception {
    System.out.println("Ha finalizado JUnit.");
  }
  
  bisiesto a;       //Objeto de clase bisiesto.
  
  @BeforeEach       //Se crea el objeto antes de cada test.
  void before(){
   a = new bisiesto();    

  }
  
  /*
   * Los test siguen un orden cronológico en función del año introducido.
   */
  @Test
  @Order(1)
  void testEs1900() {
      boolean b = a.esBisiesto(1900);
      assertFalse(b); 
  }
  @Test
  @Order(2)
  void testEs2000() {
      boolean b = a.esBisiesto(2000);
      assertTrue(b);  
  }
  
  @Test
  @Order(3)
  void testEs2019() {
      boolean b = a.esBisiesto(2019);
      assertFalse(b); 
  }
  
  @Test
  @Order(4)
  void testEs2020() {
      boolean b = a.esBisiesto(2020);
      assertTrue(b);  
  }
}
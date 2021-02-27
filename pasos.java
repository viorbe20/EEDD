package Pasos ;

/**************************************************************************
 * Pruebas JUnit de Pasos
 * **************************************************************************
*Propósito
**************************************************************************
*Aprender a crear clases de JUnit desde Eclipse.
*Conocer las anotaciones @BeforeEach, @AfterEach, @BeforeAll y @AfterAll.
*Aprender a probar las excepciones lanzadas por un método
*
***************************************************************************
*Descripción de la tarea
*Dado el siguiente código de la clase Pasos que resuelve el problema planteado en la 
*tarea Cases de equivalencia y valores límite app nº de pasos, 
*codificar las clase JUnit 5 que implemente los casos de prueba diseñados en la tarea previamente citada.
***************************************************************************
*@author Virginia Ordoño Bernier
*@date febrero 2021
***************************************************************************
 */

public class pasos {

	public static void main(String[] args) {
		
	  pasos p = new pasos();
		
		switch(p.esfuerzo(2000)) {
		case -1:
			System.out.println("ERROR: No puede haber pasos negativos");
			break;
		case -2:
			System.out.println("ERROR: Creo que te has pasado de pasos");
			break;
		
		case 1:
			System.out.println("Mueve el culo");
			break;
		case 2:
			System.out.println("Vas mejorando");
			break;		
		case 3:
			System.out.println("Así me gusta");
			break;		
		case 4:
			System.out.println("My bien");
			break;	
		case 5:
			System.out.println("Eres una máquina");
			break;
		}

	}
	public int esfuerzo(int n){
		int salida=1;
		
		if(n<0) {
			return -1;
		}else if (n<1000) 
			salida = 1;
		else if(n>=1000 && n<2000) 
			salida = 2;
		else if(n>=2000 && n<4000) 
			salida = 3;
		else if(n>=4000 && n<6000) 
			salida = 4;
		else if(n>=6000 && n<999999999)
			salida = 5;
		else if(n>=999999999)
			return -2;
		
		return salida;
			
			
	}

}


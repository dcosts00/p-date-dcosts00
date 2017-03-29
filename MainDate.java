/** 
 * @author Dona Costa Suarez 
 * @version 2017
 */
package practicaDate;


public class MainDate
{
  public static void main(String args[]){
      Date today;
      today = new Date (22,3,2017);
      System.out.println("¿El numero de dias es correcto?"+today.monthsDayIsRight());
      System.out.println("El nombre del mes es: "+today.printMonthsName());
      System.out.println("El numero de dias del mes es: "+today.getNumberDaysMonth());
      System.out.println("La estacion a la que pertenece es: "+today.printMonthSeason());
      System.out.println("Los dias que faltan para que acabe el mes: "+today.printDaysLeft());
      System.out.println("Los meses que tienen el mismo numero de dias son: "+today.printMonthsSameAmountDays());
      System.out.println("Los meses que faltan para que acabe el año son: "+today.printMonthsLeft());
      System.out.println("Los dias que han pasado desde que empezo el anio son: "+today.countDays());
      System.out.println("Numero de intentos: "+today.getNumGuess());
  }
}

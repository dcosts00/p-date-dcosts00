/**
 * @author Dona Costa Suarez
 * @version 2017
 */

package practicaDate;

	
public class Date{

    private int day;
    private int month;
    private int year;

public Date(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
}


public String toString(){
	
return this.day+"/"+this.month+"/"+this.year;

}


public Date(int year){
    this.year = year;
    this.month = (int) (Math.random()*(12)+1);
    this.day = (int) (Math.random()*(getNumberDaysMonth(this.month))+1);
}

public int getDay(){
    return this.day;
}

public int getMonth(){
    return this.month;
}

public int getYear(){
    return this.year;
}

//Cuenta los dias desde el primer dia del anio hasta el dia actual
private int countDays(int day){
  int counter = this.day;
  for(int i = 1;i<this.month;i++){
      counter = counter + getNumberDaysMonth(i);
  }
  return counter;
}

//Imprime los nombres de cada mes
public String getMonthsName(){
	StringBuilder print = new StringBuilder();
  String monthName = "Enero";
  switch(this.month){

      case 1:
      monthName = "Enero";

          break;

      case 2:
      monthName = "Febrero";

          break;

      case 3:
          monthName = "Marzo";

          break;

      case 4:
          monthName = "Abril";

          break;

      case 5:
          monthName = "Mayo";

          break;

      case 6:
          monthName = "Junio";

          break;

      case 7:
          monthName = "Julio";

          break;

      case 8:
          monthName = "Agosto";

          break;

      case 9:
          monthName = "Septiembre";

          break;

      case 10:
          monthName = "Octubre";

          break;

      case 11:
          monthName = "Noviembre";

          break;

      case 12:
          monthName = "Diciembre";

          break;

  }
print.append(monthName);
  return print.toString();

}

private int getNumberDaysMonth(int month){
    int numDays = 0;
    switch(this.month){
        case 1: //next
        case 3: //next
        case 5: //next
        case 7: //next
        case 8: //next
        case 10: //next
        case 12:
            numDays = 31;
            break;
        case 4: //next
        case 6: //next
        case 9: //next
        case 11:
            numDays = 30;
            break;
        case 2:
            numDays = 28;
    }
    return numDays;
}
public String getWeekDay(){
	StringBuilder print = new StringBuilder();
	int sem = (countDays(day));
	String nameDay = "Domingo";
	if(day == 1 && month ==1){
		 nameDay = "Domingo"; 
		
		for(int i = day, j = sem; i<j;i++, j =(j%7)+1){
			if(i== 1){
				nameDay = "Domingo";
			}
			if(i==2){
				nameDay = "Lunes";
			}
			if(i==3){
				nameDay = "Martes";
			}
			if(i== 4){
				nameDay = "Miercoles";
			}
			if(i== 5){
				nameDay = "Jueves";
			}
			if(i== 6){
				nameDay = "Viernes";
			}
			if(i==7){
				nameDay = "Sabado";
			}
		}
		print.append(nameDay);
		}
	return print.toString();
	}

//Devuelve el mes de cada estacion
public String getMonthSeason(){
	StringBuilder print = new StringBuilder();
  String seasonName = "Invierno";
  switch(this.month){
      case 1: //next
      case 2:
          seasonName = "Invierno";
           break;
      case 3: 
             if(day<20){
                 seasonName = "Invierno";
              }
              if(day>19){
                  seasonName = "Primavera";
              }
            break;
      case 4: //next
      case 5:
          seasonName = "Primavera";
            break;
      case 6:
              if(day<21){
                  seasonName = "Primavera";
              }
              if(day>20){
                  seasonName = "Verano";
              }
            break;
      case 7: //next
      case 8: 
          seasonName = "Verano";
          break;
      case 9:
              if(this.day<22){
                  seasonName = "Verano";
              }
              if(this.day>21){
                  seasonName = "Otonio";
              }
          break;
      case 10: //next
      case 11: 
          seasonName = "Otonio";
          break;
      case 12:
              if(this.day<21){
                  seasonName ="Otonio";
              }
              if(this.day>20){
                  seasonName = "Invierno";
              }
          break;
      }
  print.append(seasonName);
  
      return print.toString();
}

public void setDay(int day){
    this.day = day;
}
public void setMonth(int month){
    this.month = month;
}
public void setYear(int year){
    this.year = year;
}

public boolean isSameYear(Date another){

    return (this.year==another.getYear());

}

public boolean isSameMonth(Date another){

    return (this.month==another.getMonth());
    
}

public boolean isSameDay(Date another){

    return (this.day==(another.getDay()));
}

public boolean isSame(Date another){

    return (this==another);
}

//Comprueba si el dia es correcto
public boolean monthsDayIsRight(){
        boolean dayIsRight = false;
        switch(this.month){
             case 1: //next
             case 3: //next
             case 5: //next
             case 7: //next
             case 8: //next
             case 10: //next
             case 12:
                    if( this.day <= this.getNumberDaysMonth()){
                        dayIsRight = true;
                    }
                break;
            case 4: //next
            case 6: //next
            case 9: //next
            case 11:
                    if(this.day <= this.getNumberDaysMonth()){
                        dayIsRight = true;
                    }
                break;
            case 2:
                    if(this.day <=this.getNumberDaysMonth()){
                        dayIsRight = true;
                    }
                break;
			
    }
    return dayIsRight;
}

//Obtiene el numero de dias de cada mes
public int getNumberDaysMonth(){
        return (this.getNumberDaysMonth(this.month));
}


//Imprime los meses que faltan hasta terminar el anio
public int printMonthsLeft(){
            int counter = 0;
    for(int i = this.month;i<12;i++){
        counter++;
    }
    return counter;
}

//Imprime los dias que faltan hasta terminar el mes
public int printDaysLeft(){
    for(int i =this.day;i<getNumberDaysMonth(this.month);i++){
        this.day = this.day + 1;
    }
    return this.day;
}

//Imprime los meses con el mismo numero de dias
public String printMonthsSameAmountDays(){
	StringBuilder print = new StringBuilder();
    for(int i=1;i<=12;i++){
        if(getNumberDaysMonth(i)==this.getNumberDaysMonth()){
            print.append(this.getMonthsName());
        }
    }
    return print.toString();
}

//Devuelve los dias desde el primer dia del a�o hasta el dia actual
public int countDays(){
	return countDays(this.day);
}

//Cuenta el numero de intentos hasta que se genera una fecha aleatoria igual a la actual
public int getNumGuess(){
    int counter = 0;
    Date randomDate;
    boolean end = false;
    do{
         randomDate = new Date(this.year);
            counter++;
            if(this.equals(randomDate)){
                end = true;
            }
    }while(!end);
    
   return counter;
}
	
	
}

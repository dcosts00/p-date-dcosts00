/**
 * @author Dona Costa Suarez
 * @version 2017
 */
public class Date
{
   public class Date{

    private int day;
    private int month;
    private int year;

public Date(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
}
public Date(int year){
    this.year = year;
    this.month = Math.random()*12+1;
    this.day = Math.random()*(getNumberDaysMonth(this.month))+1;
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

    return (this.year.compareTo(another.getYear()));

}

public boolean isSameMonth(Date another){

    return (this.month.compareTo(another.getMonth()));
    
}

public boolean isSameMonth(Date another){

    return (this.day.compareTo(another.getDay()));
}

public boolean isSame(Date another){

    return (this.compareTo(another));
}

public void printMonthsName(){
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

    return monthName.toString();

}

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
                     this.day <= this.getNumberDaysMonth();
                        dayIsRight = true;
                break;
            case 4: //next
            case 6: //next
            case 9: //next
            case 11:
                    this.day <= this.getNumberDaysMonth();
                        dayisRight = true;
                break;
            case 2:
                    this.day <=this.getNumberDaysMonth();
                        dayIsRight = true;
                break;
    }
    return dayIsRight;
}
public int getNumberDaysMonth(){
        return (this.getNumberDaysMonth(this.month));
}
public int printMonthSeason(){
    String seasonName;
    switch(this.month){
        case 1: //next
        case 2:
            seasonName = "Invierno";
             break;
        case 3: 
               if(this.day<20){
                   seasonName = "Invierno";
                }
                if(this.day>19){
                    seasonName = "Primavera";
                }
              break;
        case 4: //next
        case 5:
            seasonName = "Primavera";
              break;
        case 6:
                if(this.day<21){
                    seasonName = "Primavera";
                }
                if(this.day>20){
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
        return seasonName.toString();

}
public int printMonthsLeft(){
            int counter = 0;
    for(int i = this.month;i<12;i++){
        counter++;
    }
    return counter;
}
public int printDaysLeft(){
    for(int i =this.day;i<getNumberDaysMonth(this.month);i++){
        this.day = this.day + 1;
    }
    return this.day;
}
public void printMonthsSameAmountDays(){
    for(int i=1;i<=12;i++){
        if(getNumberDaysMonth(i)==this.getNumberDaysMonth()){
            this.printMonthNames();
        }
    }
}

public int countDaysSinceTheFirstOfTheYear(){
    int counter = this.day;
    for(int i = 1;i<this.month;i++){
        counter = counter + getNumberDaysMonth(i);
    }
    return counter;
}
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
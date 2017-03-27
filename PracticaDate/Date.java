public class Date{

	private int day;
	private int month;
	private int year;

public Date(int day,int month,int year){
	this.day=day;
	this.month=month;
	this.year=year;
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

public int getNumberDaysMonth(){
	int numDays = 0;
	switch(this.month){
		case 01: //next
		case 03: //next
		case 05: //next
		case 07: //next
		case 08: //next
		case 10: //next
		case 12:
			numDays = 31;
			break;
		case 04: //next
		case 06: //next
		case 09: //next
		case 11:
			numDays = 30;
			break;
		case 02:
			numDays = 28;
	}
	return numDays;
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

public int printMonthsName(){
	String monthName;
	switch(this.month){

		case 01:
			monthName = "Enero";
			break;
		case 02:
			name = "Febrero";
			break;
		case 03:
			monthName = "Marzo";
			break;
		case 04:
			monthName = "Abril";
			break;
		case 05:
			monthName = "Mayo";
			break;
		case 06:
			monthName = "Junio";
			break;
		case 07:
			monthName = "Julio";
			break;
		case 08:
			monthName = "Agosto";
			break;
		case 09:
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
	return monthName;
}

public boolean monthsDayIsRight(){



}








	
	



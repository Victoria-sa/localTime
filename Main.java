package locaDate;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner lector= new Scanner(System.in);
//		System.out.println("Dime tu fecha de nacimiento [dd-mm-aaaa]");
//		String fechaN=lector.nextLine();
//		String[]fechaNde=fechaN.split("-");
//		String diaN=fechaNde[0];
//		String mesN=fechaNde[1];
//		String anioN=fechaNde[2];
//		//La fecha de nacimiento la quiero convertir en un objeto localDat
//		
//		//parse -> convierte
//		fechaN=anioN+ "-"+mesN+ "-"+diaN;
//		LocalDate fechaNN=LocalDate.parse(fechaN);//el parse espera una cadena de caracteres string
//	System.out.println(fechaNN.getDayOfWeek());
//		System.out.println();
//		//Aumentar la fecha: funcion plus (sumar) y minus(restar)
//		LocalDate mas70=fechaNN.plus(70,ChronoUnit.YEARS);
//		System.out.println("Te jubilaras en el año:"+mas70);
//	//ChronoUnit.Years *ChronoUnit.Days*ChronoUnit.Months
//		System.out.println("********************");
//		
//		//guardar enBBDD-> aa-mm-dd<-
		LocalDate hoy=LocalDate.now();
//		//System.out.println("Fecha nacimiento->"+fechaN);
//		System.out.println("Hoy es ->"+hoy);
//		System.out.println(hoy.getDayOfWeek());//dia semana nombre
//		System.out.println(hoy.getMonth());//nombre mes
//		System.out.println(hoy.getYear());//	
//		System.out.println(hoy.getDayOfMonth());//1...31
//		System.out.println(hoy.getMonthValue());//1...12
//		Period aniosJub=Period.between(mas70, hoy);
//		System.out.println("Te faltan para jubilarte "+ aniosJub);
//		System.out.println("Dime la fecha de nacimiento de tu madre [yyyy-mm-dd)");
//		LocalDate fechaMama=LocalDate.parse(lector.nextLine());
//		Period xPeriodo=Period.between(fechaNN, fechaMama);//cuantos años tenia mama cuando naci
//		System.out.println(" Mi madre tenia "+ xPeriodo);
//		//años bisiestos(leap year)
//		System.out.println("Dime una fecha cualquiera y compruebo si es bisiesto  -> [yyyy-mm-dd");
//		LocalDate bisiesto= LocalDate.parse(lector.nextLine());
//		boolean bisiestoR=bisiesto.isLeapYear();
//		if(bisiestoR) {
//			System.out.println("Es un Año bisiesto");
//			
//		}else {
//			System.out.println("No es bisiesto ");
//		}
		//Formatear segun nuestra forma d ver la fecha(Local)-> patter(patron, forma de ver las cosas)
		DateTimeFormatter formato=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
		//Esta linea de comandos para buscar fecha !!GUARDARLA LA DE ARRIB
		System.out.println(hoy.format(formato));
		DateTimeFormatter formato1=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato1));
		DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato2));
		DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
		System.out.println(hoy.format(formato3));
		DateTimeFormatter formato0=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(hoy.format(formato0));
		
	}

}

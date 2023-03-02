package localTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class MainlTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LocalTime ahora=LocalTime.now();
		
		System.out.println(ahora);
		for( int i=1;i<=10;i++) {
			ahora=ahora.plus(1,ChronoUnit.SECONDS);
			System.out.println(ahora);
		
	}

	
		// TODO Auto-generated method stub
	
	}

}

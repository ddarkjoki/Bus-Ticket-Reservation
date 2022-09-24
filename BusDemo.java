package busReservation;
import java.util.Scanner; 
import java.util.ArrayList;

public class BusDemo {
	public static void main(String[] args) {
		
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		//adding new bus values
		buses.add(new Bus(1,"Madurai",true,2));
		buses.add(new Bus(2,"kanyakumari",false,50));
		buses.add(new Bus(3,"Bengaluru",true,48));
		
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		//displaying bus informations
		for(Bus b:buses) {
			System.out.println(b.displayBusInfo());
		}
		//Ticket booking conformation
		while(userOpt==1) {
			System.out.println("Enter 1 to Book and 2 to Exit");
			userOpt = scanner.nextInt();
			if(userOpt == 1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings,buses)) {
					bookings.add(booking);
					System.out.println("Your Booking is Confirmed");
				}
				else {
					System.out.println("Sorry, Bus is Full, Try Another Bus or Date.");
				}
				
				//exit
				if(userOpt==2){
					userOpt = 0;	
				}
				
			}
			//if User Entered Wrong Option
			if(userOpt!=1 && userOpt!=2) {
				System.out.println("You are Choosing Wrong Option,Please Try Again!\n");
				System.out.println("Enter 1 to Book and 2 to Exit");
				userOpt = scanner.nextInt();
				if(userOpt == 1) {
					Booking booking = new Booking();
					if(booking.isAvailable(bookings,buses)) {
						bookings.add(booking);
						System.out.println("Your Booking is Confirmed");
					}
					else {
						System.out.println("Sorry, Bus is Full, Try Another Bus or Date.");
					}
				}
			}
			else {
				System.out.println("Thank You!"); 
			}
		}
	}
}
	          
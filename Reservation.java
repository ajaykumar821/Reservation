package college;
import java.util.Scanner;

class Rail{
	String name ;
	int fare,seats,ticket; 

	public Rail(String name ,int  fare ,int seats) {
		// TODO Auto-generated constructor stub
		 			this.name = name;
			        this.fare = fare;
			        this.seats = seats;
	}
		    void bookTicket(int ticket) {
		    	this.ticket=ticket;
		    	
		        if(this.seats>0) {
		        	System.out.println("Your "+ticket+" seats number are :");
		        	for(int i=0;i<ticket;i++) {
		        	     int p=seats-i;
		        	     System.out.println(p);
		        	}
		        	System.out.println("Your "+ticket+" tickets are confirmed ! \n HAPPY JOURNEY");
		            this.seats = this.seats - ticket;
		        }
		        else
		        	System.out.println("Sorry ! ,Not available");
}

		    void getStatus() {
		    	System.out.println(" Welcome to the  " +this.name+" seats available in the train are "+this.seats);
		    	
		    }
		    
		    void getFareinformation() {
		  
		    	System.out.println("Rs."+this.fare);
		    }
		    
		    void cancelTicket(int ticket) {
		    	this.ticket=ticket;
		        this.seats = this.seats + ticket;
		    System.out.println("Your "+ ticket+" Ticket is cancel ! Your payment is refund within 24 Hours--");
		    }
}

public class Reservation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rail train1 = new Rail("InterCity",50,800); 
		Rail train2 = new Rail("Purnagiri",60,80);
		Rail train3 = new Rail("avadh assam",134,670); 
		Rail train4 = new Rail("sram jivi",120,440);
		Rail train5 = new Rail("raj rani",130,120);
		Rail train6 = new Rail("aala hazrat",130,120);
		System.out.println("----*****Welcome to the our Service*******-----");
		train1.getStatus();
		train1.getFareinformation();
		train1.bookTicket(5);
		train1.getStatus();
		train1.cancelTicket(2);
		train1.getStatus();
		
//		String From, To;
//		System.out.println("Choose Destination");
//		From = sc.nextLine();
//		System.out.println("");
//		System.out.println("To ");
//		To = sc.nextLine();
		
	}
	}

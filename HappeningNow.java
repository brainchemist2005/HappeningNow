import java.util.Scanner;
import java.util.GregorianCalendar;

public class HappeningNow {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		GregorianCalendar date = new GregorianCalendar();
		Event[] events = new Event[5];
		Event event1 = null;
		String answer = "NULL";
		
		
		while(answer.equals("leave") != true)
		{
			System.out.println("Do you want to create a normal event, a sponsored event, do you want to donate or leave ? : ");
			answer = sc.nextLine();
			
		if(answer.equals("sponsored event") == true)
		{
			System.out.println("Enter the name of the event: ");
			answer = sc.nextLine();
			System.out.println("Enter the location of the event: ");
			String answer1 = sc.nextLine();
			System.out.println("Enter the date of the event: (Y/M/D)");
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			date.setWeekDate(year,month , day);
			System.out.println("Enter the target amount of the event: ");
			int amount = sc.nextInt();
			System.out.println("Enter the categroy of the event: ");			
			String category = sc.next();			
			event1 = new SponsoredEvent(answer,answer1,date,category,amount);
			events[0] = event1;
			System.out.println(event1.toString());
		}
		
		else if(answer.equals("normal event") == true)
		{
			System.out.println("Enter the name of the event: ");
			answer = sc.nextLine();
			System.out.println("Enter the location of the event: ");
			String answer1 = sc.nextLine();
			System.out.println("Enter the date of the event: (Y/M/D)");
			int year = sc.nextInt();
			int month = sc.nextInt();
			int day = sc.nextInt();
			date.setWeekDate(year,month , day);
			System.out.println("Enter the categroy of the event: ");			
			String category = sc.next();
			
			event1 = new Event(answer,answer1,date,category);
			events[0] = event1;
			
			event1.toString();
		}
		
		else if(answer.equals("donate") == true)
		{
			if(event1 instanceof SponsoredEvent == true)
			{
				//here (type casting)!
				System.out.println("The target amount for this event is : " + ((SponsoredEvent) event1).getTarget() + "and the total donations are " + ((SponsoredEvent)event1).totalDonations);
				System.out.println("Enter the amount you are willing to donate: ");
				double fee = sc.nextDouble();
				((SponsoredEvent)event1).totalDonations += fee;
			}
			
			else 
			{
				System.out.println("You can't donate for this event");	
			}
		}
		
		
		}
		
		
		for(Event e : events)
		{
			System.out.println(e);
		}
		System.out.println("BYE !");
		
	}
}

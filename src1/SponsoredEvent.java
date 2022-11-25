import java.util.GregorianCalendar;

public class SponsoredEvent extends Event{
	public double totalDonations;
	private int target;
	
	public SponsoredEvent(String name,String location, GregorianCalendar date, String categroy,int target)
	{
		super(name,location,date,categroy);
		this.target = target;
	}
	
	public void setTarget(int target)
	{
		this.target = target;
	}
	
	public int getTarget()
	{
		return target;
	}
	
	public String toString()
	{
		return super.getName() + " " + target + " " + totalDonations ;
	}
}

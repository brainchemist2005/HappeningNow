import java.util.GregorianCalendar;


public class Event {
	private String name;
	public String location,perfomer;
	public GregorianCalendar date;
	public Category Category;
	
	public Event(String name,String location, GregorianCalendar date, String categroy)
	{
		this.name = name;
		this.location = location;
		this.date = date;
		this.Category = Category.valueOf(categroy);
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		return name + " " + location +" " + perfomer + " " + date + " " ; /*+ Category.valueOf(category)*/
	}
	
}

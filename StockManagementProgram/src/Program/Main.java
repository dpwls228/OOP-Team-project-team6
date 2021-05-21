/**
 * Main class (private variable(input data) setter&getter)
 * @author ParkYeJin
 * @version alpha 0.1.0
 * @date 2021.05.20

 */
import java.util.Scanner;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	/*
	//input private variable for searching
	private String stockName;
	private String stockExpire;
	private int stockNumber;

	//Default Constructor
	public Main() {
		stockName = null;
		stockExpire = null;
		stockNumber = 0;
	}
	//Constructor
	public Main(String stockName, String stockExpire, int stockNumber)
	{
		this.stockName = stockName;
		this.stockExpire = stockExpire;
		this.stockNumber = stockNumber;
	}
	
	//Public getter and setter for private variables
	public String getStockName() { 
		return stockName;
	}
	
	public String getStocExpire() {
		return stockExpire;
	}
	
	public int getStockNumber() {
		return stockNumber;
	}
	
	public void setStockName(String stockName)
	{
		this.stockName = stockName;
	}
	
	public void setStockExpire(String stockExpire)
	{
		this.stockExpire = stockExpire;
	}
	
	public void setStockNumber(int stockNumber)
	{
		this.stockNumber = stockNumber;
	}
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//file load
		
		
		//if condition, break loop-> goto, because to inform stock the shortage
		Timer time = new Timer();
		TimerTask timeTask = new TimerTask() {
		
		@Override
		public void run() {
			//to inform stock the shortage
			System.out.println("heelo");
			}
		};
		time.schedule(timeTask,5000,20000); //timer set

		while(true)
		{
			Scanner keyboard = new Scanner(System.in);
			int trigger = keyboard.nextInt();
			
			if (trigger == 0) //realtime
			{
				//realtime class call
			}
			if (trigger == 1) //search
			{
				//search class call
			}
			if (trigger == 0) //Store
			{
				//Store class call
			}
		}
		
	}

}

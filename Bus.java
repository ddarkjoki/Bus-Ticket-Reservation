package busReservation;

public class Bus {
	private int busNo;
	private String destination;
	private boolean ac;
	private int capacity; 
	
	public Bus(int no,String destination,boolean ac,int cap){
		busNo = no;
		this.destination=destination;
		this.ac = ac;
		capacity = cap;
	}
	
	public int getBusNo(){ 
		return busNo;
	}
	
	public String destination() {
		return destination;
	}
	
	public boolean getAc(){
		return ac;
	}
	public int getCapacity(){ 
		return capacity;
	}
	
	
	public String displayBusInfo(){
		return "Bus No:" + busNo +", Destination: "+destination +", Ac:" + ac + ", Total Capacity: " + capacity;
	}
	
}	



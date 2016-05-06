package mains;

public class Checkers extends Pieces{
	private boolean king;
	private String color;
	
		
	public Checkers(){
		super();
		king = false;
		color = "N/A";
		
		
	}
	public Checkers(int x, int y){
		super(x,y);
		king = false;
		color = "N/A";
		
		
	}
	public Checkers(int x, int y, String n, String c){
		super(x,y,n);
		king = false;
		color = c;
		
		
	}
	public Checkers(int x, int y, String n, String c, boolean k){
		super(x,y,n);
		king = k;
		color = c;
		
		
	}
	
	public void kingState(boolean k){
		king = k;
	}
	
	public boolean isKing(){
		
		return king;
	}
	
	public void setColor(String c){
		color = c;
	}
	public String getColor(){
		return color;
	}
	@Override
	public String toString() {
		if(getColor() == "black" &&  king == true){
			return "B";
		}
		else if(getColor() == "black" &&  king== false){
			return "b";
		}
		else if(getColor() == "red" &&  king == true){
			return "R";
		}
		else if(getColor() == "red" && !king == false){
			return "r";
		}
		else{
			return " ";
		}
	}
}

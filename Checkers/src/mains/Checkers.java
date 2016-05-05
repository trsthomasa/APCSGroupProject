package mains;

public class Checkers extends Pieces{
	private boolean king;
	private String color;
	private String name;
	
	
	public Checkers(){
		king = false;
		color = "red";
		name = "checker";
	}
	
	public Checkers(String col){
		king = false;
		color = col;
		name = "checker";
	}
	public Checkers(String col, String nam){
		king = false;
		color = col;
		name = nam;
	}
	
	public Checkers(boolean tr){
		king = tr;
	}

	public void move(int Dx, int Dy){
		
		
	}
	
	public boolean isKing() {
		return king;
	}

	public void setKing(boolean king) {
		this.king = king;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
	
}

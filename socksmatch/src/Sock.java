
public class Sock {
	
	private int sockId;
	private String sockColor;
	private String sockSide;
	
	public Sock(int sockId, String sockColor, String sockSide) {
		this.sockId = sockId;
		this.sockColor = sockColor;
		this.sockSide = sockSide;
	}
	
	public int getSockId() {return this.sockId;}
	public String getSockColor() {return this.sockColor;}
	public String getSockSide() {return this.sockSide;}
	
	public void setSockId(int sockId) {this.sockId = sockId;}
	public void setSockColor(String sockColor) {this.sockColor = sockColor;}
	public void setSockSide(String sockSide) {this.sockSide = sockSide;}
	
	public boolean isApair(Sock anotherSock) {
		boolean isPair = false;
		if(this.getSockColor().equalsIgnoreCase(anotherSock.getSockColor()) && !(this.getSockSide().equalsIgnoreCase(anotherSock.getSockSide()))) {
			isPair = true;
		}
		return isPair;
	}

}

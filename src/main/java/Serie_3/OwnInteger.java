package Serie_3;



public class OwnInteger{

	private Integer wert;
	private OwnInteger next;
	
	public OwnInteger(){
		this.wert = 0;
	}
	
	public OwnInteger(Integer wert){
		this.wert = wert;
	}
	
	public OwnInteger(Integer wert, OwnInteger next){
		this.wert = wert;
		this.next = next;
	}
	
	
	
	public void set(Integer wert){
		this.wert = wert;
	}
	
	public Integer get(){
		return this.wert;
	}
	
	public void setNext(OwnInteger next){
		this.next = next;
	}
	
	public OwnInteger getNext(){
		return this.next;
	}
	
	public void changeNext(OwnInteger element){
		this.next = element;
	}
	
	@Override
	public String toString(){
		return wert.toString();
	}
	
	@Override
	public int hashCode(){
		return wert;
	}
	
	@Override
	public boolean equals(Object obj){
		if (obj instanceof OwnInteger == false){
			return false;
		}
		if (this.hashCode() == ((OwnInteger)obj).hashCode()){
			return true;
		}
		return false;
	}
}

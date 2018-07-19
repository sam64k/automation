package objectProperties;

public enum ObjectProperties {
	name("30"),Uname("Xpath1=>xpath"),Pwd("Xpath=>xpath2");
	
	ObjectProperties(String value){
		this.property= value;
	}
	
	String property;
	public void setProperty(String property){
		this.property = property;
	}
	
	public String getProperty(){
		return this.property;

	}
}
package ustbatchno3.DI_SetterInjuction;

public class Roles {
	
	public String char_name;
	public String getChar_name() {
		return char_name;
	}
	public void setChar_name(String char_name) {
		this.char_name = char_name;
	}
	public String getResponsibility() {
		return responsibility;
	}
	public void setResponsibility(String responsibility) {
		this.responsibility = responsibility;
	}
	public String responsibility;
	@Override
	public String toString() {
		return "Roles [char_name=" + char_name + ", responsibility=" + responsibility + "]";
	}
	
	public  void display() {
		System.out.println("name="+char_name+"responsibility"+responsibility);
	}
}
	

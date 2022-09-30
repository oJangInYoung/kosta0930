package kosta;

public class hello {
    String name;
    String title;
    
   
    

	public hello(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}
	
	public void print() {
	
		name = "안녕하세요";
	    title = "조";
	    System.out.println("name" + name);
	    System.out.println("title" + title);
	}
}

public class Sale implements Entity {
   private int id;
   private String name;
   
   public Sale() {
	   
   }
   
   public int getId() {
	return id;
}

    public void setId(int id) {
	this.id = id;
}

    public String getName() {
	return name;
}

    public void setName(String name) {
	this.name = name;
}

   public Sale(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

 
   
}

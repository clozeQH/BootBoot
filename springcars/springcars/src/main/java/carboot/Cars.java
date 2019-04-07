package carboot;

public class Cars {

	   public Cars(String name, String manufacturer) {
			super();
			this.name = name;
			this.manufacturer = manufacturer;
		}
	    
	   private String name;
	   private String manufacturer;
	   
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getManufacturer() {
			return manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}
		
}

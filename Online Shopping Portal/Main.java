public class Main {
	public static void main(String[] args) {
		//write the logic for the main function
      Customers customerObj1 = new Customers(1001, "Saakshi", 9000000000L, "Bangalore", "16-Jul-1990", 'F', "Lakme Kajal, Salwar");
      Customers customerObj2 = new Customers(1008, "Rahul", 9000000001L, "Chennai", "27-Jan-1992", 'M', "T-Shirt, Jeans");
      Suppliers supplierObj1 = new Suppliers(7901, "ABC Traders", 8000000000L, "Mumbai", 10, "Paid", 4.75);
      Suppliers supplierObj2 = new Suppliers(7972, "XYZ Enterprises", 8000000900L, "Kolkata", 7, "Unaid", 4.35);
      customerObj1.displayProfileDetails();
      customerObj2.displayProfileDetails();
      supplierObj1.displayProfileDetails();
      supplierObj2.displayProfileDetails();
      customerObj1.editAddress("Coimbatore");
      //customerObj2.editAddress();
      supplierObj1.editAddress("Delhi");
      //supplierObj2.editAddress();
      customerObj1.placeOrder();
      supplierObj1.increaseStockLevel(5);
      supplierObj2.increaseStockLevel(10);
      
    }	
}

class Users 
{
  public int id;
  public String name;
  public long mobileNumber;
  public String address;
  public String newAddress;
  public void editAddress(String newAddress)
  {
    System.out.println(name+", "+address);
    this.address = newAddress;
    System.out.println(name+", "+address);
  }
    
  public void displayProfileDetails()
  {
    System.out.println(name+", "+mobileNumber);
  } 
}

class Customers extends Users
{

public String dateOfBirth;
public char gender;
public String orderHistory;
		public Customers(int id, String name, long mobileNumber, String address, String dateOfBirth, char gender, String orderHistory)
        {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.orderHistory = orderHistory;
        }
        
        
        public void placeOrder()
        {
        System.out.println("Order placed successfully!");
        }
}

class Suppliers extends Users {
		
        public int itemsStock;
        public String paymentStatus;
        public double feedbackRating;
        public int addStock;
        public Suppliers(int id, String name, long mobileNumber, String address, int itemsStock, String paymentStatus, double feedbackRating)
        {
        this.id = id;
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.itemsStock = itemsStock;
        this.paymentStatus = paymentStatus;
        this.feedbackRating = feedbackRating;
        }
        public void increaseStockLevel(int addStock)
        {
        this.itemsStock = itemsStock + addStock;
        System.out.println(name+", "+itemsStock);
        }
}
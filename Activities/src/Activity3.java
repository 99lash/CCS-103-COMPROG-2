public class Activity3 {
	
	static int softdrinks=0, containerPrice=0, orderQty=0, addOnsQty=0, addOnsPrice=0, totalPayment=0;
	static String container, addOns;   
	public static void main(String[] args){
	
		softdrinks = Integer.valueOf( args[0]);
		container = args[1];
		orderQty = Integer.valueOf(args[2]);
		addOns = args[3];
		addOnsQty = Integer.valueOf(args[4]);

		Orders(softdrinks, container, addOns);
	}
	
	static void Orders(int softdrinks, String container, String addOns){
		
		switch(softdrinks){
			
			case 1 :  System.out.println("You ordered: Coke");
				if(container.equals("C")){
					System.out.println("Container: Can");
					containerPrice = 30;
				}
				else if(container.equals("b1")){
					System.out.println("Container: 8oz");
					containerPrice = 12;
				}
				else if(container.equals("b2")){
					System.out.println("Container: 12oz");
					containerPrice = 15;
				}
				else if(container.equals("b3")){
					System.out.println("Container: 18oz");
					containerPrice = 18;
				}
				else{
					System.out.println("Invalid selection");
					break;
				}
				
				if(addOns.equals("C")){
					System.out.println("Add ons: Cups");
					addOnsPrice = 5;
				}
				else if(addOns.equals("I")){
					System.out.println("Add ons: Ice");
					addOnsPrice = 2;
				}
				else if(addOns.equals("O")){
					System.out.println("Add ons: None");
				}
				else{
					System.out.println("Invalid input");
					break;
				}
				
				Compute(orderQty, addOnsQty);

				break;
				
			
			case 2 :  
				System.out.println("You ordered: Pepsi");
				if(container.equals("C")){
					System.out.println("Container: Can");
					containerPrice = 30;
				}
				else if(container.equals("b1")){
					System.out.println("Container: 8oz");
					containerPrice = 12;
				}
				else if(container.equals("b2")){
					System.out.println("Container: 12oz");
					containerPrice = 15;
				}
				else if(container.equals("b3")){
					System.out.println("Container: 18oz");
					containerPrice = 18;
				}
				else{
					System.out.println("Invalid selection");
					break;
				} 

				if(addOns.equals("C")){
					System.out.println("Add ons: Cups");
					addOnsPrice = 5;
				}
				else if(addOns.equals("I")){
					System.out.println("Add ons: Ice");
					addOnsPrice = 2;
				}
				else if(addOns.equals("O")){
					System.out.println("Add ons: None");
				}
				else{
					System.out.println("Invalid input");
					break;
				}

				Compute(orderQty, addOnsQty);

				break;
				
			case 3 :  
				System.out.println("You ordered: RC");
				if(container.equals("C")){
					System.out.println("Container: Can");
					containerPrice = 30;
				}
				else if(container.equals("b1")){
					System.out.println("Container: 8oz");
					containerPrice = 12;
				}
				else if(container.equals("b2")){
					System.out.println("Container: 12oz");
					containerPrice = 15;
				}
				else if(container.equals("b3")){
					System.out.println("Container: 18oz");
					containerPrice = 18;
				}
				else{
					System.out.println("Invalid selection");
					break;
				} 

				if(addOns.equals("C")){
					System.out.println("Add ons: Cups");
					addOnsPrice = 5;
				}
				else if(addOns.equals("I")){
					System.out.println("Add ons: Ice");
					addOnsPrice = 2;
				}
				else if(addOns.equals("O")){
					System.out.println("Add ons: None");
				}
				else{
					System.out.println("Invalid input");
					break;
				}

				Compute(orderQty, addOnsQty);

				break;
				
			case 4 :  
				System.out.println("You ordered: Royal");
				if(container.equals("C")){
					System.out.println("Container: Can");
					containerPrice = 30;
				}
				else if(container.equals("b1")){
					System.out.println("Container: 8oz");
					containerPrice = 12;
				}
				else if(container.equals("b2")){
					System.out.println("Container: 12oz");
					containerPrice = 15;
				}
				else if(container.equals("b3")){
					System.out.println("Container: 18oz");
					containerPrice = 18;
				}
				else{
					System.out.println("Invalid selection");
					break;
				} 
				
				if(addOns.equals("C")){
					System.out.println("Add ons: Cups");
					addOnsPrice = 5;
				}
				else if(addOns.equals("I")){
					System.out.println("Add ons: Ice");
					addOnsPrice = 2;
				}
				else if(addOns.equals("O")){
					System.out.println("Add ons: None");
				}
				else{
					System.out.println("Invalid input");
					break;
				}
				Compute(orderQty, addOnsQty);

				break;
				
			case 5 :  
				System.out.println("You ordered: Sprite");
				if(container.equals("C")){
					System.out.println("Container: Can");
					containerPrice = 30;
				}
				else if(container.equals("b1")){
					System.out.println("Container: 8oz");
					containerPrice = 12;
				}
				else if(container.equals("b2")){
					System.out.println("Container: 12oz");
					containerPrice = 15;
				}
				else if(container.equals("b3")){
					System.out.println("Container: 18oz");
					containerPrice = 18;
				}
				else{
					System.out.println("Invalid selection");
					break;
				} 

				if(addOns.equals("C")){
					System.out.println("Add ons: Cups");
					addOnsPrice = 5;
				}
				else if(addOns.equals("I")){
					System.out.println("Add ons: Ice");
					addOnsPrice = 2;
				}
				else if(addOns.equals("O")){
					System.out.println("Add ons: None");
				}
				else{
					System.out.println("Invalid input");
					break;
				}

				Compute(orderQty, addOnsQty);
				
				break;
				

			default: 
				System.out.println("Invalid selection!");
				break;
			
		}
	}
	
	
	static void Compute(int orderQty, int addOnsQty){
		if(addOns.equals("O")){
		addOnsQty = 0;			
		}
		int totalOrderQtyPrice = orderQty * containerPrice;
		int totalAddOnsQtyPrice = addOnsQty * addOnsPrice;
		
		totalPayment = totalAddOnsQtyPrice + totalOrderQtyPrice;

		System.out.println("Total Payment: " +  totalPayment);
	}
}
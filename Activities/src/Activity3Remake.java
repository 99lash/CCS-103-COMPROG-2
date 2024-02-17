public class Activity3Remake {

	static int softdrinks=0, order_Qty=0, addOns_qty=0, containerPrice=0, addOnsPrice=0, totalPayment=0;
	static String container, addOns, orderHolder; 

	public static void main(String[] args) {
		softdrinks = Integer.valueOf(args[0]);
		container = (args[1]);
		order_Qty = Integer.valueOf(args[2]);
		addOns = (args[3]);
		addOns_qty = Integer.valueOf(args[4]); 

		Order(softdrinks, container, addOns);
	}


	static void Order(int softdrinks, String container, String addOns){
		switch(softdrinks){
			
			case 1 :
				orderHolder = "Coke";
				break;

			case 2 :
				orderHolder = "Pepsi";
				break;

			case 3 :
				orderHolder = "RC";
				break;
			
			case 4 :
				orderHolder = "Sprite";
				break;
		
			case 5 :
				orderHolder = "Royal";
				break;

			default :
				System.out.println("Invalid");
				break;
		}

		switch (container) {
			case "C" :
				container = "Can";
				containerPrice = 30;
				break;

			case "B1" :
				container = "Bottle 18oz";
				containerPrice = 18;
				break;
			
			case "B2" :
				container = "Bottle 15oz";
				containerPrice = 15;
				break;

		case "B3" :
				container = "Bottle 12oz";
				containerPrice = 12;
				break;
		
			default:
				System.out.println("Invalid");
				break;
		}

		switch (addOns) {
			case "C" :
				addOns = "Cup";
				addOnsPrice = 5;
				break;

			case "I" :
				addOns = "Ice";
				addOnsPrice = 2;
				break;
			
			case "O" :
				addOns = "None";
				addOnsPrice = 0;
				break;
		
			default:
				System.out.println("Invalid");
				break;
		}

		Compute(order_Qty, addOns_qty);
		// System.out.println("You ordered: " + orderHolder + " in " + container + " " + order_Qty + "x  and with add-ons of: " + addOns + " " +addOns_qty + "x");
		System.out.printf("You ordered: %s", orderHolder);
		System.out.println();
		System.out.printf("Container: %s %dx", container, order_Qty);
		System.out.println();
		System.out.printf("Add-ons: %s %dx ", addOns, addOns_qty);
		System.out.println();
		System.out.printf("Total payment: PHP: %d ", totalPayment);
	}

	static void Compute(int order_Qty, int addOnsQty){
		if(addOns.equals("None")) addOnsQty=0;

		int totalCost1 = order_Qty * containerPrice;
		int totalCost2 = addOnsQty * addOnsPrice ;

		totalPayment = totalCost1 + totalCost2;
	}
}
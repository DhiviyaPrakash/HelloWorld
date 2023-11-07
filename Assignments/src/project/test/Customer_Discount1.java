package project.test;

public class Customer_Discount1 {
       static double amount;
       double discount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer_Discount1 totalAmt = new Customer_Discount1(1000,600,1500,2000,1450);
		double finalamount = totalAmt.checkDiscount(amount);
		System.out.println("The total purchased amount is:"+amount);
		  System.out.println("The finalamount is:"+ finalamount);
	}
	public Customer_Discount1(int a, int b,int c,int d,int e)
	{
		 amount = a+b+c+d+e;
	}
      double checkDiscount( double price)
     {
    	  if(price > 5000)
    	  {
    	  discount = (price*20)/100;
    	  }
    	   double finalprice = price - discount;
    	   return finalprice;
     }
}

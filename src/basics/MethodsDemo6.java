package basics;

public class MethodsDemo6 {
	
	//instance methods
	void login() {
		System.out.println("login method");
	}
	
	void searchProduct() {
		System.out.println("searchProduct method");
	}
	
	void addToCart() {
		System.out.println("addToCart method");
	}
	
	static void payment() {
		System.out.println("payment method");
	}
	
	void purchase() {
		login();
		searchProduct();
		addToCart();
		MethodsDemo6.payment();
		System.out.println("purchase method");
	}
	
	public static void main(String[] args) {
		
		MethodsDemo6 obj=new MethodsDemo6();
		obj.purchase();
		
	}

}

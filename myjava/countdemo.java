class counter{

	static int count = 0;

	counter(){

		count++;

	}

	void display(){

		System.out.println("count : " + count);
	}
}

class countdemo{

	public static void main(String[] args) {

		counter c1 = new counter();
		c1.display();

		counter c2 = new counter();
		c2.display();

		counter c3 = new counter();
		c3.display();
		
	}
}
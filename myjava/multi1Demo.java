class run1 implements Runnable{

	public void run(){

		for( ; ;){

			System.out.println("hii");

			try{

				Thread.sleep(1000);

			}catch(Exception e){}
		}

	}

}



class run2 implements Runnable{

	public void run(){

		System.out.println("Hello");

		for( ; ;){

			try{

				Thread.sleep(2000);
				
			}catch(Exception e){

				
			}
		}

	}

}


class multi1Demo{

	public static void main(String[] args) {

		run1 r1 = new run1();
		run2 r2 = new run2();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		
	}
}
class run1 implements Runnable{

	public void run(){



		for(int i = 0 ; i <= 20 ;i++){

			if(i%2==0){

				System.out.println("Even Number : " + i);
			}

			try{

				Thread.sleep(500);

			}catch(Exception e){}
		}

	}

}



class run2 implements Runnable{

	public void run(){


		for(int i = 0 ; i <= 20 ;i++){

			if(i%2!=0){
				
				System.out.println("Odd Numbers : " +i);
			}

			try{

				Thread.sleep(1000);
				
			}catch(Exception e){

				
			}
		}

	}

}


class multi2Demo{

	public static void main(String[] args) {

		run1 r1 = new run1();
		run2 r2 = new run2();

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		
	}
}
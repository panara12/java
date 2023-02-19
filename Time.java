class timing{

	int hh;
	int mm;

	timing(){

		hh = 0;
		mm = 0;
	}

	timing(int x , int y){

		hh = x;
		mm = y;

	}

	void displaydata(){

		System.out.println("Hours : " + hh);
		System.out.println("Minute : " + mm);
	}

	timing add(timing b){

		timing temp = new timing();

		// temp.hh = hh + b.hh;
		// temp.mm = mm = b.mm;

		temp.mm = this.mm + b.mm;

		temp.hh = this.hh +b.hh + (temp.mm/60);

		temp.mm = temp.mm%60;

		return temp;


	}
}


class time{

	public static void main(String[] args) {

		timing t1 = new timing(5 , 35);

		// t1.setdata(5 , 35);

		timing t2 = new timing(6 , 45);

		// t2.setdata(6 ,45);

		timing t3 = new timing();

		t3 = t1.add(t2);

		t1.displaydata();
		t2.displaydata();
		t3.displaydata();
		
	}
}
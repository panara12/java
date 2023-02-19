interface eventlistener{

	public void performEvent();

}

interface mouseListener extends eventlistener{

	public void mouseClicked();
	public void mousePressed();
	public void mouseRealesed();
	public void mouseMoved();
	public void mouseDragged();

}

interface keyListner extends eventlistener{

	public void keyPressed();
	public void keyReleased();

}

class eventDemo implements mouseListener , keyListner{

	public void performEvent(){

		System.out.println("Perform Your Event");

	}
	public void mouseClicked(){

		System.out.println("Mouse Clicked");

	}
	public void mousePressed(){

		System.out.println("Mouse Pressed");

	}
	public void mouseRealesed(){

		System.out.println("Mouse Realesed");

	}
	public void mouseMoved(){

		System.out.println("Mouse Moved");

	}
	public void mouseDragged(){

		System.out.println("Mouse Dragged");

	}
	public void keyPressed(){

		System.out.println("Key Pressed");

	}
	public void keyReleased(){

		System.out.println("Key Released");

	}


}

class abst4demo{

	public static void main(String[] args) {

		eventDemo ed = new eventDemo();

		ed.performEvent();
		ed.mouseClicked();
		ed.mousePressed();
		ed.mouseRealesed();
		ed.mouseMoved();
		ed.mouseDragged();
		ed.keyPressed();
		ed.keyReleased();
		

	}

}
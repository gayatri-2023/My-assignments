package Week3.day3;

public class Automation  extends MultipleLangauge{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Automation var= new Automation();
		var.python();
		var.Selenium();
		var.Java();
		var.Ruby();
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		
		System.out.println("This is method selenium from interface TestTool");
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("This is method Java from interface Language");
	}

	@Override
	public void Ruby() {						//unimplemented method in abstract class
		// TODO Auto-generated method stub
		System.out.println("This is method Ruby from abstract class 'Multiple language'");
	}

}

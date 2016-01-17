package view;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FormController {
	public TextField name;
	public TextField street;
	public TextField city;
	public TextField state;
	public TextField zip;
	public Button submit;

	public void handleSubmit(){
		System.out.println(name.getText() + "\n" + street.getText() + "\n" + city.getText() + "," + state.getText() + " " + zip.getText());
	}
}

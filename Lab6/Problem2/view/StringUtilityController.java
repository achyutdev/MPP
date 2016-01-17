package view;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class StringUtilityController {
	public TextField input;
	public TextField output;
	public Button countLetters;
	public Button revLetters;
	public Button remDuplicate;

	public void handlerCountLetter() {
		output.setText(input.getText().length() + "");
	}

	public void handlerRevLetter() {
		String strInput = input.getText();
		String revStr="";
		for (int i = strInput.length()-1; i >=0 ; i--) {
			revStr+=strInput.charAt(i);
		}
		output.setText(revStr);

	}

	public void handlerRemDuplicate() {
		String strInput = input.getText();
		String remDuplicate="";
		for (int i = 0; i < strInput.length()-1; i++) {
			if(!remDuplicate.contains(strInput.charAt(i)+"")){
				remDuplicate+=strInput.charAt(i);
			}
		}
		output.setText(remDuplicate);
	}

}

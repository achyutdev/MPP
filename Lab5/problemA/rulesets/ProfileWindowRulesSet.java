package lab.problemA.rulesets;

import java.awt.Component;

import lab.problemA.RulesSet;
import lab.problemA.windows.ProfileWindow;

public class ProfileWindowRulesSet implements RulesSet {
	String id;
	String firstName;
	String lastName;
	String fevMovie;
	String fevResturent;
	ProfileWindow profile;

	@Override
	public void applyRules(Component ob) throws RuleException {
		profile = (ProfileWindow) ob;
		setParameter();

		// Rules
		fevMovNotFevResturent();
		nonEmptyField();
		idNumericRule();
		nameNotSymboleRule();

	}

	private void fevMovNotFevResturent() throws RuleException {
		if (fevMovie.equals(fevResturent)) {
			throw new RuleException("Fevorite Movie and Fevorite Resturent cant be same.");
		}
	}

	private void nonEmptyField() throws RuleException {
		if (id.equals("") || firstName.equals("") || lastName.equals("") || fevMovie.equals("")
				|| fevResturent.equals("")) {
			throw new RuleException("All Field must be filled.");
		}

	}

	private void idNumericRule() throws RuleException {
		try {
			Integer.parseInt(id);
		} catch (Exception e) {
			throw new RuleException("ID must be Numaric.");
		}

	}

	private void nameNotSymboleRule() throws RuleException {
		if (firstName.toUpperCase().matches(".*[^A-Z].*")) {
			throw new RuleException("Name only contain a-z.");
		}

	}

	private void setParameter() {
		id = profile.getIdValue();
		firstName = profile.getFirstNameValue();
		lastName = profile.getLastNameValue();
		fevMovie = profile.getFavoriteMovieValue();
		fevResturent = profile.getFavoriteRestaurantValue();
	}

}

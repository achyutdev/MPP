package lab.problemA.rulesets;

import java.awt.Component;

import lab.problemA.RulesSet;
import lab.problemA.windows.AddrWindow;

public class AddrWindowRulesSet implements RulesSet{
	String zip;
	String state;
	String id;
	String street;
	String city;
	AddrWindow addrwindow;
	
	
	public AddrWindowRulesSet() {
		super();
	}
	
	@Override
	public void applyRules(Component ob) throws RuleException {
		addrwindow = (AddrWindow)ob;
		setParameter(addrwindow);
		nonEmptyRules();
		idNumericRules();
		zipCodeRules();
		stateRulse();
		idZipFieldRule();
		
	}

	private void setParameter(AddrWindow addr) {
		zip = addr.getZipValue();
		state = addr.getStateValue();
		id = addr.getIdValue();
		city = addr.getCityValue();
		street= addr.getStreetValue();
	}

	private void idZipFieldRule() throws RuleException {
		if(id.equals(zip)){
			throw new RuleException("Id and zip never equal.");
		}
	}

	private void stateRulse() throws RuleException {
		if(state.length()!=2){
			throw new RuleException("Your State name must be 2 Letter.");
		}else if(!state.toUpperCase().matches(".*[^A-Z].*")){
			throw new RuleException("State name only contain A-Z.");
		}
	}

	private void zipCodeRules() throws RuleException {
		try {
			
			int zipCode= Integer.parseInt(zip);
			if(zipCode+"".length()!=5){
				throw new RuleException("Zip Code must be 5 digit.");
			}
			
		} catch (Exception e) {
			throw new RuleException("Zip Code must be Numaric.");
		}
		
	}

	private void idNumericRules() throws RuleException {
		try {
			Integer.parseInt(id);
		} catch (Exception e) {
			throw new RuleException("ID must be Numaric.");
		}
	}

	private void nonEmptyRules() throws RuleException {
		if(id.equals("")||street.equals("")||city.equals("")||state.equals("")||zip.equals("")){
			throw new RuleException("All Field must be filled.");
		}
		
	}

}

package lab.problemA;

import java.awt.Component;

import lab.problemA.rulesets.RuleException;

public interface RulesSet {
	public void applyRules(Component ob) throws RuleException;
}

package problem2.bugreporter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import problem2.classfinder.ClassFinder;

/**
 * This class scans the package lesson10.labs.prob2.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 *
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "problem2.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		Map<String,List<String>> reports = new HashMap<>();

		for (Class<?> class1 : classes) {
			if (class1.isAnnotationPresent(BugReport.class)){
				List<String> tmp = new ArrayList<String>();
				BugReport test = class1.getAnnotation(BugReport.class);
				tmp.add( test.reportedBy());
				tmp.add(test.getClass().getName());
				tmp.add(test.description());
				tmp.add(test.severity()+"");
				reports.put(test.assignedTo(), tmp);
			}
		}
		try(  PrintWriter out = new PrintWriter( "bugreport.txt" )  ){
			Set<String> assignPersons = reports.keySet();
			for (String string : assignPersons) {
				out.println(string);
				List<String> details = reports.get(string);
				out.println("\treportedBy: " + details.get(0));
				out.println("\tclassname: "+details.get(1));
				out.println("\tdescription: "+ details.get(2));
				out.println("\tseverity: "+details.get(3));
				System.out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}


}

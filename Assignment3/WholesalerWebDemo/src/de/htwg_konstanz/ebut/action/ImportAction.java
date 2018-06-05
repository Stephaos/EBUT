/**
 * 
 */
package de.htwg_konstanz.ebut.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import de.htwg_konstanz.ebus.wholesaler.demo.IAction;

/**
 * @author markus
 *
 */
public class ImportAction implements IAction {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response, ArrayList<String> errorList) {

		return null;
	}

	@Override
	public boolean accepts(String actionName) {

		return false;
	}


}

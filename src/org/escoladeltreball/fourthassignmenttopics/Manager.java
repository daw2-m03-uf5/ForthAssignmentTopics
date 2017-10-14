/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.util.Comparator;
import java.util.List;

/**
 * @author jmendez
 *
 */
public interface Manager {
	/**
	 * This method returns the next ITV
	 * 
	 * @return the next ITV
	 * @throws Exception when empty
	 */
	public abstract ITV getNext() throws Exception;
	
	/**
	 * This method returns a sorted list according to a comparator expression
	 * 
	 * @param comparator the sorting expression
	 * @return a sorted list according to a comparator expression
	 * @throws Exception when null
	 */
	public abstract List<ITV> sort(Comparator<ITV> comparator) throws Exception;
	
	/**
	 * This method returns a list of ITV's from where
	 *   
	 * @param where the place
	 * @return a list of ITV's from where
	 * @throws Exception when where is null
	 */
	public abstract List<ITV> from(String where) throws Exception;
	
}

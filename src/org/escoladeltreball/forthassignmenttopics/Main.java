/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

/**
 * @author jmendez
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		ITVManagerImpl manager = new ITVManagerImpl("itv");
		//System.out.println(manager.sort(new ITVDateComparator()));
		System.out.println(manager.getNext());
	}

}

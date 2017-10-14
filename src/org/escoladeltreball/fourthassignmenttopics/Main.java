/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

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
//		System.out.println(manager.sort((ITV itv1, ITV itv2) -> itv1.getWhere().compareTo(itv2.getWhere())));
//		System.out.println(manager.getNext());
		System.out.println(manager.from("terrassa"));
	}

}

/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

import java.util.Comparator;

/**
 * @author jmendez
 *
 */
public class ITVDateComparator implements Comparator<ITV> {

	/**
	 * 
	 */
	public ITVDateComparator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(ITV itv1, ITV itv2) {
		// TODO Auto-generated method stub
		return itv1.getDate().compareTo(itv2.getDate());
	}

}

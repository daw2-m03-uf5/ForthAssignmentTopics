/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author jmendez
 *
 */
public class ITVManagerImpl extends ITVManager {

	/**
	 * @param itvFile
	 * @throws Exception
	 */
	public ITVManagerImpl(String itvFile) throws Exception {
		super(itvFile);
	}

	/* (non-Javadoc)
	 * @see org.escoladeltreball.fourthassignmenttopics.Manager#getnext()
	 */
	@Override
	public ITV getNext() throws Exception {
		LocalDateTime now = LocalDateTime.now();
		List<ITV> itvsSortedByDate = sort(new ITVDateComparator());
		for (ITV itv: itvsSortedByDate) {
			if (now.isBefore(itv.getDate())) {
				return itv;
			}
		}
		return null;
	}

	@Override
	public List<ITV> sort(Comparator<ITV> comparator) throws Exception {
		List<ITV> itvsSorted = new ArrayList<>(itvs);
		Collections.sort(itvsSorted, comparator);
		return itvsSorted;
	}

	@Override
	public List<ITV> from(String where) throws Exception {
		List<ITV> ret = itvs.stream().filter(itv -> itv.getWhere().equals(where)).collect(Collectors.toList());
		return ret;
	}

	@Override
	public List<ITV> from(LocalDateTime ini, LocalDateTime fin) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


}

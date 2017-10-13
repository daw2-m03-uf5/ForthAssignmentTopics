/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

import java.time.LocalDateTime;

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
	 * @see org.escoladeltreball.forthassignmenttopics.Manager#getnext()
	 */
	@Override
	public ITV getNext() throws Exception {
		LocalDateTime now = LocalDateTime.now();
		
		return null;
	}

}

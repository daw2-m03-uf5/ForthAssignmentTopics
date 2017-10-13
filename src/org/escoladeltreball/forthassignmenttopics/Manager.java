/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

import java.util.Comparator;
import java.util.List;

/**
 * @author jmendez
 *
 */
public interface Manager {
	/**
	 * Retorna el següents vechicle en funció de la data i hora del sistema
	 * @return
	 * @throws Exception
	 */
	public abstract ITV getNext() throws Exception;
	
	public abstract List<ITV> sort(Comparator<ITV> comparator) throws Exception;
	
}

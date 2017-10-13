/**
 * 
 */
package org.escoladeltreball.forthassignmenttopics;

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
}

/**
 * 
 */
package org.escoladeltreball.fourthassignmenttopics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author jmendez
 * 
 * Natural order
 *
 */
public class ITV implements Comparable<ITV> {

	private long id;
	private String plate;
	private LocalDateTime date;
	private String where;

	/**
	 * @param id
	 * @param plate
	 * @param date
	 * @param where
	 */
	public ITV(long id, String plate, LocalDateTime date, String where) {
		this.id = id;
		this.plate = plate;
		this.date = date;
		this.where = where;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @return the plate
	 */
	public String getPlate() {
		return plate;
	}

	/**
	 * @param plate
	 *            the plate to set
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}

	/**
	 * @return the date
	 */
	public LocalDateTime getDate() {
		return date;
	}

	/**
	 * @param date
	 *            the date to set
	 */
	public void setDate(LocalDateTime date) {
		this.date = date;
	}


	/**
	 * @return the where
	 */
	public String getWhere() {
		return where;
	}

	/**
	 * @param where
	 *            the where to set
	 */
	public void setWhere(String where) {
		this.where = where;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ITV)) {
			return false;
		}
		ITV other = (ITV) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("ITV [id=%s, plate=%s, date=%s, where=%s]", id, plate, date, where);
	}

	/**
	 * negatiu si el id d'aquesta itv es mes petit que l'id de itv 0 si són iguals
	 * positiu si el id d'aquesta itv es mes gran que l'id de itv
	 */
	@Override
	public int compareTo(ITV itv) {
		return (int) (id - itv.id);
	}

}

/**
 * 
 */
package com.noxfl.axolotl.dao.udemy;

import java.util.List;

/**
 * @author Fernando Nathanael
 *
 */
public interface DAO<E, T> {

	public List<E> findAll();
	public E findById(T id);
	public void save(E e);
	public void deleteById(T id);
	
}

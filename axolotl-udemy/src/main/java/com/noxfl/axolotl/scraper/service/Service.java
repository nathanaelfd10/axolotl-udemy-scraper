/**
 * 
 */
package com.noxfl.axolotl.scraper.service;

import java.util.List;

/**
 * @author Fernando Nathanael
 *
 */
public interface Service<E, T> {
	
	public List<E> findAll();
	public E findById(T t);
	public void save(E e);
	public void deleteById(T t);
	
}

/**
 * 
 */
package com.noxfl.axolotl.model.udemy;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Fernando Nathanael
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
//@RequiredArgsConstructor

@Entity
@Table(name = "price")
public class Price {

	public Price(int courseId, boolean isPaid, int price, int priceDiscount, String currency,
			String currencySymbol) {
		this.courseId = courseId;
		this.isPaid = isPaid;
		this.price = price;
		this.priceDiscount = priceDiscount == 0 ? price : priceDiscount;
		this.currency = currency;
		this.currencySymbol = currencySymbol;
	}

	@Id
	@NonNull
	private int courseId;

	@OneToOne
	@PrimaryKeyJoinColumn(name = "price")
	private CourseDetail courseDetail;

	@NonNull
	private boolean isPaid;

	@NonNull
	private int price;

	@NonNull
	private int priceDiscount;

	@NonNull
	private String currency;

	@NonNull
	private String currencySymbol;

}

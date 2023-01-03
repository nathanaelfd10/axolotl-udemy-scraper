/**
 * 
 */
package com.noxfl.axolotl.model.udemy;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
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

@Entity
@Table(name = "category")
public class Category {

	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Course> courses;

	@Id
	@Column(name = "category_id")
	private int categoryId;

	@Column(name = "url")
	private String url;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "breadcrumb")
	private String breadcrumb;

}
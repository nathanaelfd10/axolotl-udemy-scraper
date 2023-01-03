/**
 * 
 */
package com.noxfl.axolotl.model.udemy;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
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

@Table(name = "topic")
@Entity
public class Topic {

	@OneToMany(mappedBy = "topic", cascade = CascadeType.ALL)
	private List<Course> courses;

	@Id
	@NonNull
	private int topicId;

	@NonNull
	private String title;

	@NonNull
	private String url;

}

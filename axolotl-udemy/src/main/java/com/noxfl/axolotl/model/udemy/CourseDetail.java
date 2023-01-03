/**
 * 
 */
package com.noxfl.axolotl.model.udemy;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
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

@Entity
@Table(name = "course_detail")
public class CourseDetail {

	/**
	 * @param level
	 * @param contentDuration
	 * @param numLecture
	 * @param price
	 * @param numSubscriber
	 * @param numReview
	 * @param lastChecked
	 */
	public CourseDetail(String level, double contentDuration, int numLecture, Price price, int numSubscriber,
			int numReview, String lastChecked) {
		this.level = level;
		this.contentDuration = contentDuration;
		this.numLecture = numLecture;
		this.price = price;
		this.numSubscriber = numSubscriber;
		this.numReview = numReview;
		this.lastChecked = lastChecked;
	}

	@Id
	@NonNull
	private int courseId;

	@OneToOne
	@PrimaryKeyJoinColumn(name = "courseDetail")
	private Course course;

	@NonNull
	private String level;

	@NonNull
	private double contentDuration;

	@NonNull
	private int numLecture;

	@OneToOne(mappedBy = "courseDetail", cascade = CascadeType.ALL)
	@JoinColumn(name = "course_id")
	@NonNull
	private Price price;

	@NonNull
	private int numSubscriber;

	@NonNull
	private int numReview;

	@NonNull
	private String lastChecked;

}
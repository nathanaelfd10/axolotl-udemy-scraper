/**
 * 
 */
package com.noxfl.axolotl.model.udemy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author Fernando Nathanael
 *
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "course")

public class Course {

	@Cascade(CascadeType.SAVE_UPDATE)
	@ManyToOne
	@JoinColumn(name = "topic_id", nullable = true)
	private Topic topic;

	@Cascade(CascadeType.SAVE_UPDATE)
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = true)
	private Category category;

	@Id
	@NonNull
	@Column(name = "course_id")
	private int courseId;

	@NonNull
	@Column(name = "title")
	private String title;

	@NonNull
	@Column(name = "url")
	private String url;

	@NonNull
	@Column(name = "date_published")
	private String datePublished;

	@OneToOne(mappedBy = "course", cascade = javax.persistence.CascadeType.ALL)
	private CourseDetail courseDetail;

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", url=" + url + ", datePublished=" + datePublished
				+ "]";
	}

}
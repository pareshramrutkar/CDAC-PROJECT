package com.Dac.BackEnd.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "issued_book")
public class IssuedBooks {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "sr_no")
	private int id;
	private int stud_id;
	private int book_id;
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	
	public IssuedBooks() {
		super();
	}

	public IssuedBooks(int id, int stud_id, int book_id, Date start_date,
			Date end_date) {
		super();
		this.id = id;
		this.stud_id = stud_id;
		this.book_id = book_id;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getStud_id() {
		return stud_id;
	}


	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}


	public int getBook_id() {
		return book_id;
	}


	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}



	public Date getStart_date() {
		return start_date;
	}


	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}


	public Date getEnd_date() {
		return end_date;
	}


	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	@Override
	public String toString() {
		return "IssuedBooks [id=" + id + ", stud_id=" + stud_id + ", book_id=" + book_id + ", start_date=" + start_date
				+ ", end_date=" + end_date + "]";
	}

	




	






	

	
	
	
	
}

package Researcher;

import java.util.Date;

public class ResearchPaper {
	private String journal;
	private String author;
	private Date date;
	private Integer citations;
	private Integer pages;
	private String title;

	public ResearchPaper(String journal, String author, Date date, Integer citations, Integer pages, String title) {
		super();
		this.journal = journal;
		this.author = author;
		this.date = date;
		this.citations = citations;
		this.pages = pages;
		this.title = title;
	}

	public String getJournal() {
		return journal;
	}

	public void setJournal(String journal) {
		this.journal = journal;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getCitations() {
		return citations;
	}

	public void setCitations(Integer citations) {
		this.citations = citations;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCitation(Format f) {
		return "Num of citations " + citations;
	}
}
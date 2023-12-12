package Researcher ;

import java.sql.Date;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ResearchPaper
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String journal;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String author;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public Date date;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int citations;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int pages;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String title;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ResearchPaper(){
		
	}

	public ResearchPaper(String journal, String author, Date date, int citations, int pages, String title) {
		this();
		this.journal = journal;
		this.author = author;
		this.date = date;
		this.citations = citations;
		this.pages = pages;
		this.title = title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getCitation(Format f ) {
		// TODO implement me
		return "";	
	}

	@Override
	public String toString() {
		return "ResearchPaper [journal=" + journal + ", author=" + author + ", date=" + date + ", citations="
				+ citations + ", pages=" + pages + ", title=" + title + "]";
	}
	
}


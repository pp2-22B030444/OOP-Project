package Researcher ;

import java.util.Comparator;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */
public  interface Researcher 
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addResearchPaper(ResearchPaper paper2 ) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addResearchProject(ResearchProject project2 ) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int calculateHIndex(LowHIndexSupervisorException parameter) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String getCitation() ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @return 
	 * @generated
	 * @ordered
	 */
	
	public  void getResearchPapers(List<ResearchPaper> l) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @return 
	 * @generated
	 * @ordered
	 */
	
	public  void getResearchProjects(List<ResearchProject> l) ;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void printPapers(Comparator<ResearchPaper> comparator2 ) ;
	
	
}


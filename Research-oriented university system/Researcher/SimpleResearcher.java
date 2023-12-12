package Researcher ;

import java.util.Comparator;
import java.util.List;

import Employee.Instructor;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class SimpleResearcher extends Instructor implements Researcher
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<ResearchProject> researchProjects;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<ResearchPaper> researchPapers;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public int hIndex;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public SimpleResearcher(){
		super();
	}

	@Override
	public void addResearchPaper(ResearchPaper paper2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addResearchProject(ResearchProject project2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int calculateHIndex(LowHIndexSupervisorException parameter) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getCitation() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void printPapers(Comparator<ResearchPaper> comparator2) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void getResearchPapers(List<ResearchPaper> l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getResearchProjects(List<ResearchProject> l) {
		// TODO Auto-generated method stub
		
	}


}


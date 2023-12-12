package Researcher ;

import java.util.List;

import Employee.Employee;

/**
 * <!-- begin-user-doc -->
 * <!--  end-user-doc  -->
 * @generated
 */

public class ResearchProject
{
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public String topic;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<ResearchPaper> publishedPapers;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public List<Researcher> participants;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 */
	public ResearchProject(){
		
	}
    
	public ResearchProject(String topic, List<ResearchPaper> publishedPapers, List<Researcher> participants) {
		super();
		this.topic = topic;
		this.publishedPapers = publishedPapers;
		this.participants = participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addParticipant(Employee employee) {
		// TODO implement me	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!--  end-user-doc  -->
	 * @generated
	 * @ordered
	 */
	
	public void addPublishedPaper(ResearchPaper paper ) {
		// TODO implement me	
	}

	@Override
	public String toString() {
		return "ResearchProject [topic=" + topic + ", publishedPapers=" + publishedPapers + ", participants="
				+ participants + "]";
	}
	
}


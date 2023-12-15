package Researcher;

import java.util.Comparator;
import java.util.List;

public class SimpleResearcher implements Researcher{
	private Researcher researcher;
	private List<ResearchProject> researchProjects;
	private List<ResearchPaper> researchPapers;
	private Integer hindex;
	
	
	public SimpleResearcher(Researcher researcher, List<ResearchProject> researchProjects,
			List<ResearchPaper> researchPapers, Integer hindex) {
		super();
		this.researcher = researcher;
		this.researchProjects = researchProjects;
		this.researchPapers = researchPapers;
		this.hindex = hindex;
	}

	@Override
	public List<ResearchProject> getResearchProjects() {
		// TODO Auto-generated method stub
		return researchProjects;
	}

	@Override
	public void addResearchProject(ResearchProject project2) {
		// TODO Auto-generated method stub
		researchProjects.add(project2);
	}

	@Override
	public List<ResearchPaper> getResearchPapers() {
		// TODO Auto-generated method stub
		return researchPapers;
	}

	@Override
	public void addResearchPaper(ResearchPaper paper2) {
		// TODO Auto-generated method stub
		researchPapers.add(paper2);
	}

	@Override
	public int CalculateHIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void printPapers(Comparator<ResearchPaper> comparator2) {
		// TODO Auto-generated method stub
		researchPapers.stream().sorted(comparator2).forEach(System.out::println);
	}
	
}

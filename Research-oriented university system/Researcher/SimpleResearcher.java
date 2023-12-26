package Researcher;



import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Employee.User;

public class SimpleResearcher extends User implements Researcher{
	private User user;
	private List<ResearchProject> researchProjects;
	private List<ResearchPaper> researchPapers;
	private Integer hindex;


	public SimpleResearcher(User user, List<ResearchProject> researchProjects,
			List<ResearchPaper> researchPapers, Integer hindex) {
		super();
		this.user = user;
		this.researchProjects = researchProjects;
		this.researchPapers = researchPapers;
		this.setHindex(hindex);
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
		List<Integer> citations = researchPapers.stream().map(n->n.getCitations()).sorted().collect(Collectors.toList());
        int n = citations.size();

        for (int i = 0; i < n; i++) {
            int hIndex = n - i;
            if (citations.get(i) >= hIndex) {
                return hIndex;
            }
        }

        return 0;
	}

	@Override
	public void printPapers(Comparator<ResearchPaper> comparator2) {
		// TODO Auto-generated method stub
		researchPapers.stream().sorted(comparator2).forEach(System.out::println);
	}

	public Integer getHindex() {
		return hindex;
	}

	public void setHindex(Integer hindex) {
		this.hindex = hindex;
	}

}

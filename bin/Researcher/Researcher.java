package Researcher;

import java.util.Comparator;
import java.util.List;

public interface Researcher {
	public List<ResearchProject> getResearchProjects();
	public void addResearchProject(ResearchProject project2);
	public List<ResearchPaper> getResearchPapers();
	public void addResearchPaper(ResearchPaper paper2);
	public int CalculateHIndex();
	public void printPapers(Comparator<ResearchPaper> comparator2);
}

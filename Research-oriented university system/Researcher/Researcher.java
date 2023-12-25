package Researcher;

import java.util.Comparator;
import java.util.List;

public interface Researcher {
	List<ResearchProject> getResearchProjects();
	void addResearchProject(ResearchProject<?> project2);
	List<ResearchPaper> getResearchPapers();
	void addResearchPaper(ResearchPaper paper2);
	int CalculateHIndex();
	void printPapers(Comparator<ResearchPaper> comparator2);
}
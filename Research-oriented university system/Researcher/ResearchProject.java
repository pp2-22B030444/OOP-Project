package Researcher;

import java.util.*;

public class ResearchProject<User> {
	private String topic;
	private List<ResearchPaper> publishedPapers;
	private List<User> participants;

	public ResearchProject(String topic, List<ResearchPaper> publishedPapers, List<User> participants) {
		super();
		this.topic = topic;
		this.publishedPapers = publishedPapers;
		this.participants = participants;
	}

	public void addParticipant(User u) {
		participants.add(u);
	}
	public void addPublishedPapers(ResearchPaper p) {
		publishedPapers.add(p);
	}
}
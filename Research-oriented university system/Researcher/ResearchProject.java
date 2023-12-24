package Researcher;

import java.util.*;

public class ResearchProject<User> {
	private String topic;
	private List<ResearchPaper> publishedPapers;
	private List<User> participants;

	public ResearchProject(String topic, List<ResearchPaper> publishedPapers, List<User> participants) {
		super();
		this.setTopic(topic);
		this.publishedPapers = publishedPapers;
		this.participants = participants;
	}

	public void addParticipant(User u) {
		participants.add(u);
	}
	public void addPublishedPapers(ResearchPaper p) {
		publishedPapers.add(p);
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}
}
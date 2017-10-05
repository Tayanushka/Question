package org.itstep;

import java.util.List;

public class ChoiceResponse {
	private long id;
	private long questioId;
	private List<String> responses;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getQuestioId() {
		return questioId;
	}

	public void setQuestioId(long questioId) {
		this.questioId = questioId;
	}

	public List<String> getResponses() {
		return responses;
	}

	public void setResponses(List<String> responses) {
		this.responses = responses;
	}

	public ChoiceResponse() {

	}

	public ChoiceResponse(long id, long questioId, List<String> responses) {
		this.id = id;
		this.questioId = questioId;
		this.responses = responses;
	}

}

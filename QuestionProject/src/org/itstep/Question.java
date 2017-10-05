package org.itstep;

public class Question {

	private long id;
	private String question;
	private boolean isRequired;
	private boolean withChoice;
	private String response;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public boolean isRequired() {
		return isRequired;
	}

	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}

	public boolean isWithChoice() {
		return withChoice;
	}

	public void setWithChoice(boolean withChoice) {
		this.withChoice = withChoice;
	}

	public String getResponse() {
		return response;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	public Question() {

	}

	public Question(long id, String question, boolean isRequired, boolean withChoice, String response) {

		this.id = id;
		this.question = question;
		this.isRequired = isRequired;
		this.withChoice = withChoice;
		this.response = response;
	}
}

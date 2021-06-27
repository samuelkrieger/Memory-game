package br.com.samuel.jogomemoria.api.model.request;

public class ScoreRequest {
	
	private long id;
	
	private String name;

	private double value;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	 


}

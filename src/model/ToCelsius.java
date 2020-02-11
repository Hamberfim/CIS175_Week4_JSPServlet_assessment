package model;

public class ToCelsius {
	private double fahrTemp;
	private double celsiusTemp;
	
	public ToCelsius() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public ToCelsius(double fahrTemp) {
		super();
		this.fahrTemp = fahrTemp;
	}



	public double getFahrTemp() {
		return fahrTemp;
	}


	public void setFahrTemp(double fahrTemp) {
		this.fahrTemp = fahrTemp;
	}


	public double getCelsiusTemp() {
		return celsiusTemp;
	}


	public void setCelsiusTemp(double fahrTemp) {
		celsiusTemp = ((fahrTemp - 32)*5)/9;
	}
	
	
	public double ConvertToCelsius(double fahrTemp) {
		return celsiusTemp = ((fahrTemp - 32)*5)/9;
		

	}


	@Override
	public String toString() {
		return "ToCelsius [fahrTemp=" + fahrTemp + ", celsiusTemp=" + ConvertToCelsius(fahrTemp) + "]";
	}







}

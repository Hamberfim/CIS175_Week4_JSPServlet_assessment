package model;

public class ToFahrenheit {
	private double celsTemp;
	private double convertToFahrenheitResults;
	
	public ToFahrenheit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ToFahrenheit(double celsTemp) {
		super();
		this.celsTemp = celsTemp;
	}

	public double getCelsTemp() {
		return celsTemp;
	}

	public void setCelsTemp(double celsTemp) {
		this.celsTemp = celsTemp;
	}

	public double getConvertToFahrenheitResults() {
		return convertToFahrenheitResults;
	}

	public void setConvertToFahrenheitResults(double convertToFahrenheitResults) {
		this.convertToFahrenheitResults = convertToFahrenheitResults;
	}
	
	public double ConvertToFahrenheit(double celsTemp) {
		return  convertToFahrenheitResults = 9 * (celsTemp / 5) + 32;
	}

	@Override
	public String toString() {
		return "ToFahrenheit [celsTemp=" + celsTemp + ", convertToFahrenheitResults=" + ConvertToFahrenheit(celsTemp)
				+ "]";
	}


	
	

}

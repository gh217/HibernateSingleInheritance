package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("car")
public class FourWheels extends Vechicle{

	private String wheelsFour;

	public String getWheelsFour() {
		return wheelsFour;
	}

	public void setWheelsFour(String wheelsFour) {
		this.wheelsFour = wheelsFour;
	}
	
}

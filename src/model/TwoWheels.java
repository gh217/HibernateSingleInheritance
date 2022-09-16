package model;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
// value
@DiscriminatorValue("bike")
public class TwoWheels extends Vechicle{

	private String wheelsTwo;

	public String getWheelsTwo() {
		return wheelsTwo;
	}

	public void setWheelsTwo(String wheelsTwo) {
		this.wheelsTwo = wheelsTwo;
	}

	
	
}

package model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity
public class UserDetails {
	
	@Id
	@GeneratedValue
    private int userId;
    private String userName;
    
    @OneToMany(mappedBy = "user")
    private Set<Vechicle> vechicles=new HashSet<>();

    
	public Set<Vechicle> getVechicles() {
		return vechicles;
	}

	public void setVechicles(Set<Vechicle> vechicles) {
		this.vechicles = vechicles;
	}

	public int getUserId() {
        return userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

	
}

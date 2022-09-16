package controller;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


import model.FourWheels;
import model.TwoWheels;
import model.UserDetails;
import model.Vechicle;


public class Main {

	public static void main(String[] args) {
			
		
		
		UserDetails user = new UserDetails();
		user.setUserName("mo");
		
		TwoWheels vec1 = new TwoWheels();
		vec1.setVechicleName("Bike");
		vec1.setWheelsTwo("two Wheels");	
		
		
		FourWheels vec2 = new FourWheels();
		vec2.setVechicleName("car");
		vec2.setWheelsFour("four Wheels");
		
		user.getVechicles().add(vec2);
		user.getVechicles().add(vec1);
		
		vec1.setUser(user);
		vec2.setUser(user);
		
        try {
        	
        	SessionFactory factory = new Configuration()
    				.configure("config.xml")			
    				.addAnnotatedClass(UserDetails.class)
    				.addAnnotatedClass(Vechicle.class)
    				.addAnnotatedClass(TwoWheels.class)
    				.addAnnotatedClass(FourWheels.class)
    				.buildSessionFactory();
            
            Session session = factory.openSession();
        	session.beginTransaction();
       
        	session.save(user);
        	session.save(vec1);
        	session.save(vec2);

        	
//        	Vechicle vecg=session.get(Vechicle.class, 2);
//		
//        	vecg.getUser().getUserId();
        	
//        	session.remove(session.get(
//        				UserDetails.class, 16));
        	
        	
//        	UserDetails us=session.get(UserDetails.class, 13);
//        	
//        	for(Vechicle v: us.getVechicle()) {
//        		v.setUser(null);
//        	}
//        	
        	
        	
            session.getTransaction().commit();
		} catch (Exception e) {
			System.err.println(e.getLocalizedMessage());
			e.getStackTrace();
			return;
		}
		System.out.println("Done");
		
		
	}

}

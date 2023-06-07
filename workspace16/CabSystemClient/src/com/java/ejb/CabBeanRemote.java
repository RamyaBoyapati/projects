package com.java.ejb;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Remote;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CabBeanRemote
 */
@Stateless
@Remote
public class CabBeanRemote implements CabBeanRemoteRemote {

    /**
     * Default constructor. 
     */
    public CabBeanRemote() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public User searchUser(int userId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Driver searchDriver(int driverId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Driver> showDriver() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addBooking(Booking booking) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
}

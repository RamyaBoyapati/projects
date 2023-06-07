package com.infinite.hib;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class VendorDAO {



   Connection connection;
    PreparedStatement pst;
    public int validate(String user,String pwd) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Login where userName=? and PassCode=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, pwd);
        ResultSet rs = pst.executeQuery();
       rs.next();
       int count =  rs.getInt("cnt");
		return count;
	}
    public String updateVendor(Vendor vendorNew) 
			throws ClassNotFoundException, SQLException {
		Vendor vendor = searchVendor(vendorNew.getVendorid());
		if (vendor!=null) {
			String cmd = "update vendor set  vendorPhoneNo=?, address1=?, address2=?,city=?,zipCode=?,username=?,password=? "
					+ " vendorname =? where vendorid=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			 pst.setString(1, vendorNew.getVendorname());
		        pst.setString(2, vendorNew.getVendorPhoneNo());
		        pst.setString(3, vendorNew.getAddress1());
		        pst.setString(4, vendorNew.getAddress2());
		        pst.setString(5, vendorNew.getCity());
		        pst.setString(6, vendorNew.getZipCode());
		        
			pst.executeUpdate();
			return "Employ Record Updated...";
		}
		return "Record Not Found...";
    }
    public String deleteVendor(String vendorid)
			throws ClassNotFoundException, SQLException {
		Vendor vendor = searchVendor(vendorid);
		if (vendor!=null) {
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from vendor where vendorid=?";
			pst = connection.prepareStatement(cmd);
			pst.setString(1, vendorid);
			pst.executeUpdate();
			return "Record Deleted...";
		}
		return "vendor Record Not Found...";
	}
    public String addVendor(Vendor vendor)
            throws ClassNotFoundException, SQLException {
        connection = ConnectionHelper.getConnection();
        String cmd = "insert into Vendor(vendorid,vendorname,vendorPhoneNo,address1,address2,city,zipCode,username,password) "
                + " values(?,?,?,?,?,?,?,?,?)";
        pst = connection.prepareStatement(cmd);
        pst.setString(1, vendor.getVendorname());
        pst.setString(2, vendor.getVendorPhoneNo());
        pst.setString(3, vendor.getAddress1());
        pst.setString(4, vendor.getAddress2());
        pst.setString(5, vendor.getCity());
        pst.setString(6, vendor.getZipCode());
        
        pst.executeUpdate();
        return "Record Inserted...";
    }
    public Vendor searchVendor(String vendorid)
			throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Vendor where vendorid=?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, vendorid);
		ResultSet rs = pst.executeQuery();
		Vendor vendor = null;
		if(rs.next()) {
			vendor = new Vendor();
			vendor.setVendorid(rs.getString("vendorid"));
			vendor.setVendorname(rs.getString("vendorname"));
			vendor.setVendorPhoneNo(rs.getString("vendorPhoneNo"));
			vendor.setAddress1(rs.getString("address1"));
			vendor.setAddress2(rs.getString("address2"));
			vendor.setCity(rs.getString("city"));
			vendor.setZipCode(rs.getString("zipCode"));
			
			
		}
		return vendor;
	}
    public List<Vendor> showVendor() throws 
	ClassNotFoundException, SQLException {
List<Vendor> vendorList = new ArrayList<Vendor>();
connection = ConnectionHelper.getConnection();
String cmd = "select * from Employ";
pst = connection.prepareStatement(cmd);
ResultSet rs = pst.executeQuery();
Vendor vendor = null;
while(rs.next()) {
vendor = new Vendor();
vendor.setVendorid(rs.getString("vendorid"));
vendor.setVendorname(rs.getString("vendorname"));
vendor.setVendorPhoneNo(rs.getString("vendorPhoneNo"));
vendor.setAddress1(rs.getString("address1"));
vendor.setAddress2(rs.getString("address2"));
vendor.setCity(rs.getString("city"));
vendor.setZipCode(rs.getString("zipCode"));

vendorList.add(vendor);
}
return vendorList;
}
}
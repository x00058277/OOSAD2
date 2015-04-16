/**
 * Licensee: Institute of Technology Tallaght
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateOrmweek10Data {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = ormweek10.Ormweek10PersistentManager.instance().getSession().beginTransaction();
		try {
			ormweek10.Employee lormweek10Employee = ormweek10.Employee.createEmployee();
			// Initialize the properties of the persistent object here
			lormweek10Employee.setName("David Prendergast");
			lormweek10Employee.setAddress("22 The Street");
			lormweek10Employee.setPps("00000P");
			lormweek10Employee.setMobile("0524865");
			lormweek10Employee.save();
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateOrmweek10Data createOrmweek10Data = new CreateOrmweek10Data();
			try {
				createOrmweek10Data.createTestData();
			}
			finally {
				ormweek10.Ormweek10PersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

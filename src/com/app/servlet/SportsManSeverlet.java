package com.app.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.Methods.SaveCricketreDetails;
import com.app.model.CricketerDetails;


public class SportsManSeverlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// 1. reading data from UI
		String name= request.getParameter("name");
		String age= request.getParameter("age");
		String bowlingStyle= request.getParameter("bowlingStyle");
		String battingStyle= request.getParameter("battingStyle");
		String role= request.getParameter("role");
		String country= request.getParameter("country");
		
		//2 converting age from String to integer
		int age1= Integer.parseInt(age);
		
		//3. creating Model class CricketerDetailsObject and seting data
		CricketerDetails cricket = new CricketerDetails();
		   cricket.setAge(age1);
		   cricket.setName(name);
		   cricket.setBowlingStyle(bowlingStyle);
		   cricket.setBattingStyle(battingStyle);
		   cricket.setRole(role);
		   cricket.setCountry(country);
		   
		// 4. creating object of SaveCricketerDetails Class object to save data into data base
		   
		   SaveCricketreDetails scd = new SaveCricketreDetails();
		     int sno = scd.saveDetails(cricket);
		 
		 //5.constructing one msg
		     String msg = "Cricketer Details is saved with sno:"+sno ;
		     
		 // 6. sending msg to UI
		     request.setAttribute("msg", msg);
		    request.getRequestDispatcher("index.jsp").forward(request, response);
		
	}

}

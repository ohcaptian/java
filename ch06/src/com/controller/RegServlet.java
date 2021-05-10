package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Userinfo;

/**
 * Servlet implementation class RegServlet
 */
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//��������
		String strUsername=request.getParameter("username");
		String strPwd=request.getParameter("pwd");
		String strPwd1=request.getParameter("pwd1");
		String strSex=request.getParameter("sex");
		String[] hobby=request.getParameterValues("hobby");
		
		//��֤����
		if(strUsername==null || strUsername.equals("") || strPwd==null || strPwd.equals("") || 
				strPwd1==null || strPwd1.equals("") || strSex==null || hobby==null){
			request.setAttribute("mess", "����Ϊ�գ�");
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		if(!strPwd.equals(strPwd1)){
			request.setAttribute("mess", "���벻һ�£�");
			RequestDispatcher dispatcher=request.getRequestDispatcher("reg.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
		//��������	
		//String[]->String
		String strHobby="";
		for(int i=0;i<hobby.length;i++){
			strHobby+=hobby[i]+",";
		}
				
		//ȥ��ĩβ��","
		if(!strHobby.equals("")){
			strHobby=strHobby.substring(0,strHobby.length()-1);
		}
		
		//
		Userinfo userinfo=new Userinfo();
		request.setAttribute("userinfo", userinfo);
		userinfo.setUsername(strUsername);
		userinfo.setPwd(strPwd);
		userinfo.setSex(strSex);
		userinfo.setHobby(strHobby);
		
		//
		RequestDispatcher dispatcher=request.getRequestDispatcher("regShow.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

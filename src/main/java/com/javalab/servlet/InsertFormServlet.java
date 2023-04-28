package com.javalab.servlet;

/*
 * 회원추가 할 화면을 보여주는 서블릿
 */


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalab.dao.MemberDAO;
import com.javalab.dto.MemberVO;

/**
 * Servlet implementation class InsertFormServlet
 */
@WebServlet("/insertForm")
public class InsertFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doHandle(request, response);
	}

	private void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 사용자가 입력한 한글 정보의 인코딩 처리
		request.setCharacterEncoding("utf-8");
		
		// 2. 사용자에게 보낼 컨텐츠의 인코딩 처리
		response.setContentType("text/html; charset=utf8");
		
		// 3. 데이터베이스 핸들링 담당 객체 생성
		MemberDAO dao = new MemberDAO();
		
		// 4. 파라미터 수집
		String id = request.getParameter("id");
		
		// 5. 화면에서 받은 id로 사용자 조회
		MemberVO member = dao.getMember(id);
		request.setAttribute("member", member);
		
		// 6. 추가된 사용자를 사용자 수정화면으로 전달
		RequestDispatcher dispatcher = request.getRequestDispatcher("memberInsertForm.jsp");
		dispatcher.forward(request, response);
	}
}
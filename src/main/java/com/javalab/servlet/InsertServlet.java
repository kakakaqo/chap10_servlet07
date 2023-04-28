package com.javalab.servlet;

/**
 * 회원 추가하는 서블릿
 */

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javalab.dao.MemberDAO;
import com.javalab.dto.MemberVO;

/**
 * Servlet implementation class DeleteServlet
 */
@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
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
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		
		// 5. 입력받은 정보로 MemberVO객체 생성
		MemberVO vo = new MemberVO(id, pwd, name, email);

		// 6. 추가 메소드 호출
		dao.insertMember(vo);
		
		// 7. 현재 프로그램의 컨텍스트 패스 얻기
		String contextPath = request.getContextPath();
		
		// 8.추가 작업 후에 회원 조회 리스트로 이동(사용자로부터 새로운 요청)
		response.sendRedirect(contextPath + "/list");
	}
}

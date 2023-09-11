package ex03_response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseServlet
 */
@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  
	  // 1. 요청 인코딩
	  request.setCharacterEncoding("UTF-8");
	  
	  // 2. 요청 파라미터
	  String gender  = request.getParameter("gender");
	  String domain  = request.getParameter("domain");
	  String content = request.getParameter("content");
	  String region  = request.getParameter("region");
	  
	  /* 
	                   요청 (Request)
	  클라이언트   ----------------------> 서버
	  클라이언트   <---------------------- 서버
	                   응답 (Response)
	  */                 
	                   
	  /*
	   * 응답 (Response)
	   * 1. 서버가 클라이언트에게 데이터를 보내는 것을 의미한다.
	   * 2. HttpServletResponse 클래스가 응답을 처리한다.
	   * 3. 응답 데이터의 타입(MIME TYPE)을 결정하고 응답한다.
	   *   1) text/html          : 태그를 만들어서 반환하는 경우
	   *   2) application/xml    : XML을 반환하는 경우
	   *   3) application/json   : JSON을 반환하는 경우
	   */
	  
	  // 3. 응답 데이터의 타입과 인코딩 설정
	  response.setContentType("text/html; charset=UTF-8");
	  
	  // 4. 응답 스트림 생성 (서버에서 내보내는 것이니, 출력스트림이다. 문자기반의 출력스트림인 Writer 생성)
	   
	  
	  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

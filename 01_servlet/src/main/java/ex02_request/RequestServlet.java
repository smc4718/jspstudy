package ex02_request;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/request")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RequestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HttpServletRequest request = 요청을 처리하는 아이.
		response.getWriter().append("Served at: ").append(request.getContextPath());
	   // getWriter() : 문자로 만들어 보내겠다.                ContextPath() : " /servlet " 이라고 텍스트가 빠져나온다.
	   // 출력결과 : Served at: /servlet
	  response.getWriter().append("안녕하세요.");
	  
	  // 1. 요청을 UTF-8로 인코딩한다. (★가장 먼저 기본적으로 해줘야함)
	  request.setCharacterEncoding("UTF-8");
	  
	  // 2. 요청 파라미터를 받는다. (요청 파라미터는 모두 String 타입이다.)
	  //  1) 요청 파라미터는 모두 String 타입이다.
	  //  2) 요청 파라미터가 없으면 null 값으로 처리된다.
	  String name = request.getParameter("name");
	  String strAge = request.getParameter("age");
	  
	  // 3. 요청 파라미터의 타입을 조정한다.
	  //   타입을 조정할 때 Exception이 발생하지 않도록 요청 파라미터의 null 처리가 필요하다.
	  
	  //  1) 고전 null 처리
	  /*
	  int age = 0;
	  if(strAge != null) {
	    age = Integer.parseInt(strAge);
	  }
	  */
	  
	  // 2) null 처리를 위한 java.util.Optional 클래스 (최신)
	  // Optional = 값이 없을 때 (Null값일 때), 대신 쓸 수 있는 값을 준다.
	  Optional<String> opt = Optional.ofNullable(strAge);
	  int age = Integer.parseInt(opt.orElse("0")); // opt로 감싼 strAge가 null이면 "0"을 꺼낸다.
	  
	  System.out.println(name + ' ' + age);

	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

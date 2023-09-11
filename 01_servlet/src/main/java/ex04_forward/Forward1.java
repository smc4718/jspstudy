package ex04_forward;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Forward1
 */
@WebServlet("/forward1")
public class Forward1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Forward1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	  /*
	   * forward
	   * 1. 다른 경로로 이동하는 방식 중 하나이다.
	   * 2. 다른 경로로 직접 요청 파라미터를 이동시킨다.  (ex: 고객센터에 질문했을 때, 해당과 관련있는 곳으로 직접 연결 시켜주는 것)
	   * 3. 경로를 작성할 때 URLMapping만 작성한다. (ContextPath는 작성하지 않는다. /servlet내부에 들어와서 이동하는 것이기 때문에 /servlet 은 빼주는 것.)
	   */
	  
	  // 요청의 전달 객체 생성 (forward2번으로 모두 가지고 간다.)
	  RequestDispatcher dispatcher = request.getRequestDispatcher("/forward2");
	  
	  // 전달 (어떤 요청이었는지, 어디로 응답해야되는지 다 넘겨준다).
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

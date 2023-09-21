package repository;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import domain.BookDto;

public class BookDao {
  
  // mybatis에서 사용하는 SqlSession을 만들 수 있는 SqlSessionFactory 선언
  private SqlSessionFactory factory;
  
  // Singleton Pattern
  private static BookDao dao = new BookDao();
  private BookDao() {
    // SqlSessionFactory 생성
    try {
      String resource = "mybatis/config/mybatis-config.xml";
      InputStream in = Resources.getResourceAsStream(resource);
      factory = new SqlSessionFactoryBuilder().build(in);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  public static BookDao getDao() {
    return dao;     
  }
  
  // 전체 개수 반환 메소드
  public int bookCount() {
    SqlSession ss = factory.openSession();
    int count = ss.selectOne("mybatis.mapper.book.bookCount");
    ss.close();
    return count;
  }
  
  // 목록 반환 메소드
  public List<BookDto> bookList(Map<String, Object> map) {
    SqlSession ss = factory.openSession();
    List<BookDto> list = ss.selectList("mybatis.mapper.book.bookList", map);
    ss.close();
    return list;
  }
  
  // 상세 반환 메소드
  
  
  // 등록 메소드
  
  
  // 수정 메소드
  
  
  // 삭제 메소드
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}

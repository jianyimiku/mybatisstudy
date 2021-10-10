import com.mybatis.pojo.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @author ：sjq
 * @date ：Created in 2021/10/7 下午10:40
 * @description：
 * @modified By：
 * @version: $
 */
public class CountryMapperTest {
    @Test
    public void testSelectAll(){
        try {
            Reader reader =
                    Resources.getResourceAsReader("mybatis-config.xml");
            SqlSessionFactory sqlSessionFactory
                    = new SqlSessionFactoryBuilder().build(reader);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            List<Country> selectAll = sqlSession.selectList("selectAll");
            System.out.println(selectAll);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

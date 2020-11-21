package dao; /**
 * @author 17694
 * @date 2020/11/19
 **/

import pojo.Student;

import java.sql.SQLException;
import java.util.List;

/**
 * 数据访问对象接口
 */
public interface Dao {
    public void add(Student s);
    public void update(Object o);
    public void delete(int id);
    public Object select(int id) throws SQLException;
    public List<Student> selectAll();
    //部分查询
    public List<Student> select(int start, int count);

}

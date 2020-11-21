package dao.daoImp;
import dao.Dao;
import pojo.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 * @author 17694
 * @date 2020/11/19
 **/

/**
 * @ClassName : Daoiml 
 * @Description : Dao接口的实现类  
 */
public class DaoImp implements Dao {
    //加载驱动类
    public DaoImp() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("没有该类");
        }

    }

    //连接数据库
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/student?characterEncoding=UTF-8", "root",
                "123456");
    }

    public int getTotal() {
        int total = 0;
        try (Connection c = getConnection(); Statement s = c.createStatement();) {
            String sql = "select count(*) from t_student";
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return total;
    }

    public void add(Student s) {
        // PreparedStatement 使用参数设置，可读性好，不易犯错
        String sql = "insert into t_student values(null,?,?,?,?)";
        try (Connection c = getConnection(); PreparedStatement p = c.prepareStatement(sql)) {
            p.setString(1, s.getBirth());
            p.setInt(2, s.getcNo());
            p.setString(3, s.getSex());
            p.setString(4, s.getsName());
            p.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(Object o) {

    }

    public void delete(int id) {

    }

    //根据Id查询用户，返回给实体类
    public Object select(int id) {
        Student s1 = new Student();
        try (Connection c = getConnection(); Statement s = c.createStatement()) {
            String sql = "select * from t_student where sno =" + id;
            ResultSet rs = s.executeQuery(sql);
            if (rs.next()) {

                s1.setsNo(rs.getInt(1));
                s1.setBirth(rs.getString(2));
                s1.setcNo(rs.getInt(3));
                s1.setSex(rs.getString(4));
                s1.setsName(rs.getString(5));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s1;
    }

    public List<Student> selectAll() {
        List<Student> Students = new ArrayList<Student>();
        String sql = "select * from t_student";
        try (Connection c = getConnection(); PreparedStatement p = c.prepareStatement(sql)) {
            ResultSet rs = p.executeQuery();
            while(rs.next()){
                Student s =new Student(rs.getNString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
                Students.add(s);
            }
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return Students;
    }
        public List<Student> select (int start, int count){
            List<Student> Students = new ArrayList<Student>();
            String sql = "select * from t_student order by sno desc limit ?,?";
            try (Connection c = getConnection(); PreparedStatement p = c.prepareStatement(sql)) {
                p.setInt(1,start);
                p.setInt(2,count);
                ResultSet rs = p.executeQuery();
                while(rs.next()){
                    Student s =new Student(rs.getInt(1),rs.getNString(2),rs.getInt(3),rs.getString(4),rs.getString(5));
                    Students.add(s);
                }
            } catch (SQLException s) {
                s.printStackTrace();
            }
            return Students;
        }
    }

package homework.day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcUtil {
    private static final JdbcUtil JDBC_UTIL = new JdbcUtil();
    private JdbcUtil(){

    }
    public static JdbcUtil getInstance(){
        return JDBC_UTIL;
    }

    public Connection getConnection() throws IOException {
        /*Properties properties = new Properties();
        String filePath = JdbcUtil.class.getResource("/").getFile().toString() + "jdbc.properties";
        InputStream is = new FileInputStream(filePath);
        properties.load(is);*/
        try {
            //Class.forName(properties.get("driver").toString());
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        /*System.out.println(properties.get("driver"));
        System.out.println(properties.get("username"));
        System.out.println(properties.get("password"));*/
        Connection connection = null;
        try {
            //connection = DriverManager.getConnection(properties.get("url").toString(),properties.get("username").toString(),properties.get("password").toString());
            connection = connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?characterEncoding=utf8","root","123456");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeResource(AutoCloseable autoCloseable){
        if(null != autoCloseable){
            try {
                autoCloseable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


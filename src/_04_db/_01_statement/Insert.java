package _04_db._01_statement;

import lombok.SneakyThrows;

import java.sql.DriverManager;

public class Insert {
    public static final String URL = "jdbc:mysql://localhost:3306/po_2309";

    @SneakyThrows
    public static void main(String[] args) {
        Class.forName("com.mysql.cj.jdbc.Driver");

        try (var cn = DriverManager.getConnection(URL, "root", "");
            var st = cn.createStatement()) {
            var query = "INSERT INTO staff(name, age, department, project) VALUES ('emloyee11', 25, 5, 3)";
            st.execute(query);
        }
    }
}

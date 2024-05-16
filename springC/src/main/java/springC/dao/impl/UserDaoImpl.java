package springC.dao.impl;

import lombok.Setter;
import org.springframework.jdbc.core.JdbcTemplate;
import springC.dao.UserDao;
import springC.pojo.Score;
import springC.pojo.User;
import springC.util.ScoreMapper;

import java.util.List;
import java.util.Scanner;

@Setter
public class UserDaoImpl implements UserDao {
    private User user;
    private JdbcTemplate jdbcTemplate;

    @Override
    public void find() {
        System.out.println("执行查询操作");
        String sql;
        List<Score> scoreList;
        switch (user.getName()) {
            case "admin":
                sql = "select * from score";
                scoreList = jdbcTemplate.query(sql, new ScoreMapper());
                for (Score score : scoreList) {
                    System.out.println(score);
                }
                break;
            case "register":
                Scanner scanner = new Scanner(System.in);
                System.out.println("输入查询学号：");
                String id = scanner.nextLine();
                sql = "select * from score where id = ?";
                scoreList = jdbcTemplate.query(sql, new ScoreMapper(), id);
                if(!scoreList.isEmpty()) {
                    for (Score score : scoreList) {
                        System.out.println(score);
                    }
                }else {
                    System.out.println("查询学号为空");
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void update() {
        System.out.println("执行修改操作");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入修改的学号：");
        String id = scanner.nextLine();
        System.out.println("请输入修改的课程：");
        String courseName = scanner.nextLine();
        System.out.println("请输入修改的成绩：");
        int courseScore = scanner.nextInt();
        String sql = "";
        switch (courseName) {
            case "mathScore":
                sql = "update score set mathScore = ? where id = ?";
                break;
            case "englishScore":
                sql = "update score set englishScore = ? where id = ?";
                break;
            case "programScore":
                sql = "update score set programScore = ? where id = ?";
                break;
            case "databaseScore":
                sql = "update score set databaseScore = ? where id = ?";
                break;
            default:
                break;
        }
        int row = jdbcTemplate.update(sql, courseScore, id);
        if (row == 1) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
    }
}

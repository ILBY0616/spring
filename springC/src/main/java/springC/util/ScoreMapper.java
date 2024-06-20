package springC.util;

import org.springframework.jdbc.core.RowMapper;
import springC.pojo.Score;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScoreMapper implements RowMapper<Score> {
    @Override
    public Score mapRow(ResultSet rs, int rowNum) throws SQLException {
        Score score = new Score();
        score.setId(rs.getString("id"));
        score.setName(rs.getString("name"));
        score.setMathScore(rs.getInt("mathScore"));
        score.setEnglishScore(rs.getInt("englishScore"));
        score.setProgramScore(rs.getInt("programScore"));
        score.setDatabaseScore(rs.getInt("databaseScore"));
        return score;
    }
}

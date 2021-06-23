package co.jp.socio.diversity.vos.repository;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


import co.jp.socio.diversity.vos.controller.MyErrorController;

public abstract class AbstractRepository{
		
	@Autowired
	protected JdbcTemplate jdbcManager;
	
	Logger log = LogManager.getLogger(MyErrorController.class);
	
	public int insert(String table, String[] values) {
		
		String sql = "insert into " + table + " values(";
		for (int i = 0 ; i < values.length; i++) {
			sql = sql + " ?,";
		}
		sql = sql.substring(0, sql.length() - 1);
		sql = sql + ")";
		log.debug("SQL: " + sql);
		return jdbcManager.update(sql, values);
	}
	
	public List<Map<String, Object>> selectAll(String table) {
		String sql = "select * from " + table;
		return jdbcManager.queryForList(sql);
	}
	
	/*
	 * public <T> List<T> selectList(String table) { String sql = "select * from " +
	 * table; return jdbcManager.queryForList(sql, null); }
	 */
	
	 public int count() {
	        return jdbcManager.queryForObject("select count(*) from user_info", Integer.class);
	    }

		/*
		 * public Map selectById(int id) { return
		 * jdbcManager.queryForObject("select id, name from users where id = ?", new
		 * UserRowMapper(), id); }
		 * 
		 * public List<Map> selectAll() { return
		 * jdbcManager.query("select id, name from users", new UserRowMapper()); }
		 */
	
	
}

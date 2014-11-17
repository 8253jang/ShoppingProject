package exam.shop.dao;

import java.sql.*;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.jdbc.core.*;
import org.springframework.stereotype.*;

import exam.shop.dto.*;

@Component
public class  ItemDAOImpl implements ItemDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// DataSource 이용해서 DataBase 연결
	/*public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}*/

	@Override
	public List<Item> findAll() {
		// TODO Auto-generated method stub
		
		String sql ="select * from items";
		
		List<Item> list = jdbcTemplate.query(sql, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int rowNum) throws SQLException {
				// TODO Auto-generated method stub
				
				Item item 
					= new Item(rs.getInt("item_id"), 
							   rs.getString("item_name"),
							   rs.getInt("price"),
							   rs.getString("description"),
							   rs.getString("pictureUrl"));
				
				
				
				return item;
			}
		});
		
		
		return list;
	}

	@Override
	public Item findByItemId(int itemId) {
		// TODO Auto-generated method stub
		String sql = "select * from items where item_id = ?"; 
		
		Item item = jdbcTemplate.queryForObject(sql, new Object[] { itemId }, new RowMapper<Item>() {

			@Override
			public Item mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Item item 
				= new Item(rs.getInt("item_id"), 
						   rs.getString("item_name"),
						   rs.getInt("price"),
						   rs.getString("description"),
						   rs.getString("pictureUrl"));
			
				return item;
			}
		});
		
		return item;
	}
}

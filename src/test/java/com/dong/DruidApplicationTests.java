package com.dong;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
class DruidApplicationTests {

	@Autowired
	DataSource dataSource;
	@Test
	void contextLoads() throws SQLException {
		// 查看默认数据源
		System.out.println("默认数据源："+dataSource.getClass());
		// 获得连接
		Connection connection = dataSource.getConnection();
		System.out.println("获得连接："+connection);
		DruidDataSource druidDataSource = (DruidDataSource) dataSource;
		System.out.println("最大连接数："+druidDataSource.getMaxActive());
		System.out.println("初始化连接数："+druidDataSource.getInitialSize());
		connection.close();
	}

}

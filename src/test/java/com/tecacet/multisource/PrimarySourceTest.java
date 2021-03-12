package com.tecacet.multisource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

@SpringBootTest
class PrimarySourceTest {

    @Resource
    DataSource dataSource;

    @Test
    void test() {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        template.execute("insert into test (id,name) values (2, 'Hello')");
        List rows = template.queryForList("select * from test");
        assertEquals(1, rows.size());
    }
}

package org.com.cay.spring.boot;

import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.DocumentResult;
import io.searchbox.core.Index;
import io.searchbox.core.Search;
import io.searchbox.core.SearchResult;
import org.com.cay.spring.boot.entity.Article;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot10ElasticsearchApplicationTests {

	//貌似jestClient不支持ElasticSearch6+
	@Autowired
	private JestClient jestClient;

	@Test
	public void createIndex() throws IOException {

		Article article = new Article();
		article.setId(1);
		article.setAuthor("吴承恩");
		article.setTitle("西游记");
		article.setContent("Hello World");

		//构建索引
		Index index = new Index.Builder(article).index("caychen").type("article").build();

		JestResult execute = jestClient.execute(index);
		System.out.println(execute.isSucceeded());
	}

	@Test
	public void search() throws IOException {
		String json = "\"query\" : {\n" +
				"        \"match\" : {\n" +
				"            \"last_name\" : \"Smith\"\n" +
				"        }\n" +
				"    }";
		Search search = new Search.Builder(json).addIndex("caychen").addType("emp").build();

		SearchResult execute = jestClient.execute(search);
		System.out.println(execute.getTotal());
	}

}

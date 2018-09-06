package org.com.cay.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支持两种技术来与ES交互：
 *      1、Jest（默认不支持）
 *          需要导入jest的工具包(io.searchbox.client.JestClient)
 *      2、Spring Data ElasticSearch
 *          1）、Client节点信息clusterNodes，clusterName
 *          2）、ElasticsearchTemplate模板操作ES
 *          3）、编写ElasticsearchRepository的子接口操作ES
 */
@SpringBootApplication
public class SpringBoot10ElasticsearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot10ElasticsearchApplication.class, args);
	}
}

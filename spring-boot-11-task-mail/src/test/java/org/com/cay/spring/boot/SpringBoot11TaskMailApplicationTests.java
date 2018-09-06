package org.com.cay.spring.boot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot11TaskMailApplicationTests {

	@Autowired
	private JavaMailSenderImpl javaMailSender;

	@Value("${mail.from}")
	private String from;
	@Value("${mail.to}")
	private String to;

	@Test
	public void test1() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setSubject("集会");
		message.setText("晚上6点整开会");
		message.setFrom(from);
		message.setTo(to);
		javaMailSender.send(message);
	}

	@Test
	public void test2() throws MessagingException {
		//创建复杂邮件
		MimeMessage mimeMessage = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);

		helper.setSubject("紧急会议");
		helper.setText("<b style='color:red;'>今天7点半开会</b>", true);
		helper.setFrom(from);
		helper.setTo(to);

		helper.addAttachment("1.jpg", new File("C:\\Users\\Cay\\Desktop\\笔记\\images\\Docker.png"));

		javaMailSender.send(mimeMessage);
	}
}

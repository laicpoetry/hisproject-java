package com.neuedu.hisproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer{
	/*
	* addMapping：配置可以被跨域的路径，可以任意配置，可以具体到直接请求路径。 
	* allowCredentials：是否开启Cookie
	* allowedMethods：允许的请求方式，如：POST、GET、PUT、DELETE等。
	* allowedOrigins：允许访问的url，可以固定单条或者多条内容
	* allowedHeaders：允许的请求header，可以自定义设置任意请求头信息。 
	* maxAge：配置预检请求的有效时间
	*/

		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**")
			.allowedOrigins("*")
			.allowedMethods("*")
			.allowedHeaders("*")
			.allowCredentials(true)
			.maxAge(36000);
		}

}

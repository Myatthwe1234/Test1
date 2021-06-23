package co.jp.socio.diversity.vos;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import java.util.Collections;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.JspConfigDescriptorImpl;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroup;
import org.apache.tomcat.util.descriptor.web.JspPropertyGroupDescriptorImpl;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SagaBankCrmRootApplication.class);
	}

	@Bean
	public ConfigurableServletWebServerFactory configurableServletWebServerFactory() {
	    return new TomcatServletWebServerFactory() {
	        @Override
	        protected void postProcessContext(Context context) {
	            super.postProcessContext(context);
	            JspPropertyGroup jspPropertyGroup = new JspPropertyGroup();
	            jspPropertyGroup.setElIgnored("false");
	            jspPropertyGroup.addUrlPattern("*.jsp");
	            jspPropertyGroup.setPageEncoding("UTF-8");
	            jspPropertyGroup.addIncludePrelude("/WEB-INF/view/common/common.jsp");
	            JspPropertyGroupDescriptorImpl jspPropertyGroupDescriptor =
	                    new JspPropertyGroupDescriptorImpl(jspPropertyGroup);
	            // jsp-property-group list and taglib list
	            context.setJspConfigDescriptor(
	            new JspConfigDescriptorImpl(Collections.singletonList(jspPropertyGroupDescriptor),
	                    Collections.emptyList()));
	        }
	    };
	}
	
	
	
	/*
	 * @Bean public ConfigurableServletWebServerFactory
	 * configurableServletWebServerFactory() { return new
	 * TomcatServletWebServerFactory() {
	 * 
	 * @Override protected void postProcessContext(Context context) {
	 * super.postProcessContext(context); JspPropertyGroup jspPropertyGroup = new
	 * JspPropertyGroup(); jspPropertyGroup.addUrlPattern("*.jsp");
	 * jspPropertyGroup.setPageEncoding("UTF-8");
	 * //jspPropertyGroup.setScriptingInvalid("true");
	 * jspPropertyGroup.addIncludePrelude("/WEB-INF/view/common/common.jsp");
	 * jspPropertyGroup.setTrimWhitespace("true");
	 * jspPropertyGroup.setDefaultContentType("text/html");
	 * JspPropertyGroupDescriptorImpl jspPropertyGroupDescriptor = new
	 * JspPropertyGroupDescriptorImpl( jspPropertyGroup);
	 * context.setJspConfigDescriptor(new JspConfigDescriptorImpl(
	 * Collections.singletonList(jspPropertyGroupDescriptor),
	 * Collections.emptyList())); } }; }
	 */

}

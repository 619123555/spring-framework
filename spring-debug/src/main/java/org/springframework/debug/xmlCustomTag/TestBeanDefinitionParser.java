package org.springframework.debug.xmlCustomTag;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/2
 * @description:
 */
public class TestBeanDefinitionParser implements BeanDefinitionParser {

	@Override
	public BeanDefinition parse(Element element,
			ParserContext parserContext) {
		System.out.println("custom tag parser start");
		System.out.println(element.getAttribute("id"));
		System.out.println(element.getAttribute("userName"));
		System.out.println("custom tag parser end");
		return null;
	}
}

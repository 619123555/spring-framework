package org.springframework.debug.xmlCustomTag;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @auther: 胡鹏祥
 * @date: 2021/2/2
 * @description:
 */
public class TestNamespaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		// elementName要跟xml的标签名一致,不然解析的时候找不到
		registerBeanDefinitionParser("testCustomTagObject", new TestBeanDefinitionParser());
	}
}

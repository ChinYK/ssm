package com.hbjc.util;

import java.util.*;
import java.io.File;

import javax.xml.parsers.*;

import org.apache.commons.lang.StringUtils;
import org.w3c.dom.*;

public class XmlReader {
	
	public static List<String> readXml(String nodeName,String soureFile) throws Exception {
		
		DocumentBuilder db = DocumentBuilderFactory.newInstance()
				.newDocumentBuilder();
		Document document = db.parse(new File(soureFile));// 把XML文件解析成DOCUMENT类型
		Element root = document.getDocumentElement();
		
		String NodeName=nodeName;                  	//自选XML中的节点名
		NodeList list = null;
		if(StringUtils.isNotBlank(nodeName)){
			list = root.getElementsByTagName(NodeName);// 获得page元素
		}else{
			list = root.getChildNodes();
		}
		List<String> list2=showElem(list);
		return list2;
	}
	
	
	public static List<String> showElem(NodeList nl) {
		
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < nl.getLength(); i++) {
			Node n = nl.item(i);// 得到父节点
			// 子节点
			NodeList childList = n.getChildNodes();
			for (int x = 0; x < childList.getLength(); x++) {
				Node childNode = childList.item(x);
				// 判断取出的值是否属于Element元素,目的是过滤掉
				if (childNode instanceof Element) {
					// 得到子节点的名字
					//String childNodeName = childNode.getNodeName();
					//System.out.print("节点名:" + childNodeName);
					// 得到子节点的值
					String childNodeValue = childNode.getTextContent();
					
					list.add(childNodeValue);
				}
			}
		}
		return list;
	}
	
	public static void main(String[] args) throws Exception {
		List<String> list = XmlReader.readXml("dailyreport","d:/test.xml");
		System.out.println(list);//输出列表。
	}
}

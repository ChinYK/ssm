package com.hbjc.webservice.impl;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.swing.filechooser.FileFilter;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.hbjc.util.Decompression;
import com.hbjc.util.UrlUtil;
import com.hbjc.util.XmlReader;
import com.hbjc.webservice.TestWebservice;
import com.hbjc.dao.WebserviceDTODao;

/**
 * com.hbjc.webservice.impl
 *
 * @author wangx 2018年6月27日下午2:55:00
 * @version v1.0
 */
@WebService
@SOAPBinding(style = Style.RPC)
@SuppressWarnings("deprecation")
public class TestWebserviceImpl implements TestWebservice {

	@Value("${downloadPath}")
	private String downloadPath;
	
	private final Logger log = Logger.getLogger(TestWebserviceImpl.class);
	

	@Override
	public Boolean getUcUser(String query) throws Exception {
		UrlUtil.downloadFileFromUrl(query,downloadPath);
		File f = new File(downloadPath);
		File[] flist = f.listFiles();
		for(File file:flist){
			if(file.getName().toString().indexOf(".zip")>0){
				 Decompression.uncompress(new File(downloadPath+file.getName()), new File(downloadPath));  
			}
		}
		File[] xlist = f.listFiles();
		List<String> list = new ArrayList<String>();
		for(File file:xlist){
			if(file.getName().toString().indexOf(".xml")>0){
				list.addAll(XmlReader.readXml("", downloadPath+file.getName()));
			}
		}
		for(String s:list){
			System.out.println(s);
		}
		return true;
	}
}

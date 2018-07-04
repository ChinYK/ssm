package com.hbjc.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;


public class UrlUtil {
	
	/***
	 * 下载到本地
	 * @param imgUri
	 * @param fileName
	 * @return 
	 */
	public static void downloadFileFromUrl(String fileUrl,String downPath) throws Exception {
        //获取连接
        URL url=new URL(fileUrl);
        HttpURLConnection connection=(HttpURLConnection)url.openConnection();
        connection.setConnectTimeout(3*1000);
        //设置请求头
        connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/57.0.2987.110 Safari/537.36");
        //获取输入流
        InputStream in=connection.getInputStream();

        File saveDir=new File(downPath);
        if(!saveDir.exists()){
            saveDir.mkdirs();
        }
        File file=new File(downPath+UUID.randomUUID()+".zip");
        OutputStream out=new FileOutputStream(file);
        byte[] bytes=new byte[1024];
        int len=0;
        while((len=in.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        out.close();
        in.close();
    }

}

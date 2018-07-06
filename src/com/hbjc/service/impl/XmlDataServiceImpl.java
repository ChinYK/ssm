package com.hbjc.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hbjc.service.XmlDataService;
import com.hbjc.util.JdbcConnection;

@Service("xmlDataService")
public class XmlDataServiceImpl implements XmlDataService {

	@Override
	public int jdbcPerBatchInsert(List<String> list) throws Exception {
		 int flag=0;
	     Connection conn= JdbcConnection.getConn();
	     PreparedStatement pstm= null;
	     long stime=System.currentTimeMillis();
	     try {

	            String sql= "insert into xmldata(xml_value) values(?)";
	            conn.setAutoCommit(false);
	            for (int i = 0;i < list.size();i++) {
	                pstm = conn.prepareStatement(sql);
	                pstm.setString(1, list.get(i));// WESI_CARRIER_CODE
	                pstm.executeUpdate();
	            }
	            conn.commit();// 手动提交事务
	        }catch(Exception e) {
	            e.printStackTrace();
	            flag=2;
	            throw new RuntimeException();
	        }finally{
	            if (pstm != null) {
	                try {
	                    pstm.close();
	                }catch(SQLException e) {
	                    e.printStackTrace();
	                }
	            }
	            if (conn != null) {
	                conn.close();
	                long etime=System.currentTimeMillis();
	                System.out.println("数据插入完成："+(etime-stime)+"ms!");
	            }
	        }
	        return flag;

	    }

}

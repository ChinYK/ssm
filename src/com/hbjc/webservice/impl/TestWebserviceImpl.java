package com.hbjc.webservice.impl;

import java.util.List;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hbjc.webservice.TestWebservice;
import com.hbjc.domain.Users;
import com.hbjc.dao.WebserviceDTODao;
import com.hbjc.domain.Users;
import com.hbjc.webservice.TestWebservice;

/**
 * com.hbjc.webservice.impl
 *
 * @author wangx 2018年6月27日下午2:55:00
 * @version v1.0
 */
@Service("testWebserviceImpl")
@WebService
public class TestWebserviceImpl implements TestWebservice {

	/*
	 * (non-Javadoc)
	 *
	 * @see com.hbjc.webservice.TestWebservice#getUcUser(com.hbjc.domain.Users)
	 */

	private final Logger log = Logger.getLogger(TestWebserviceImpl.class);
	// @Autowired
	// private WebserviceDTOManager webserviceDTOManager;
	@Autowired
	private WebserviceDTODao webserviceDTODao;

	@Override
	public List<Users> getUcUser(String query) {
		HashMap map = new HashMap();
		map.put("id", "12383");
		map.put("lineNo", "TG001");
		List<Users> users = webserviceDTODao.getMyAll();
		return users;
	}
}

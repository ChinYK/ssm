package com.hbjc.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * com.hbjc.util
 *
 * @author wangx 2018年4月27日下午5:56:37
 * @version v1.0
 */
@Service("gerValueUtil")
public class GetValueUtil {

	/*@Value("${server.url}")
	private static String serverUrl;*/

	public static String getServerUrl() {

		return "http://localhost:8080/ssm";

	}

}

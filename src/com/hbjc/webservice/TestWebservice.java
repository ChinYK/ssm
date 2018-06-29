package com.hbjc.webservice;

/**
 * com.hbjc.webservice
 * @author wangx
 * 2018年6月27日下午2:53:21
 * @version v1.0
 */

import java.util.List;
import com.hbjc.domain.Users;
import javax.jws.WebService;
@WebService// @WebService用于定义webservice对外开放的接口
public interface TestWebservice {
    public List<Users> getUcUser(String query);
}

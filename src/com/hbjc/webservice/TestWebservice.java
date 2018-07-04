package com.hbjc.webservice;

/**
 * com.hbjc.webservice
 * @author wangx
 * 2018年6月27日下午2:53:21
 * @version v1.0
 */

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
@WebService
@SOAPBinding(style = Style.RPC)
public interface TestWebservice {
    public Boolean getUcUser(String query) throws Exception ;
}

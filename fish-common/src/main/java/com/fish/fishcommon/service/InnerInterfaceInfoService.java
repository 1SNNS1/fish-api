package com.fish.fishcommon.service;

import com.fish.fishcommon.model.entity.InterfaceInfo;

/**
* @author fishLight
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-06-13 15:31:51
*/
public interface InnerInterfaceInfoService {

    /**
     * getInterfaceInfo
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path,String method);

}

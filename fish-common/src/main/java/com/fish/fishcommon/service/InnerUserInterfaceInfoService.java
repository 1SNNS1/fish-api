package com.fish.fishcommon.service;

/**
 * @author fishLight
 * @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
 * @createDate 2023-07-06 05:49:52
 */
public interface InnerUserInterfaceInfoService {

    /**
     * invokeCount
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}

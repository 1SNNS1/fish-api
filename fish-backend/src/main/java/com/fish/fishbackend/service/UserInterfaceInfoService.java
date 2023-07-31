package com.fish.fishbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fish.fishcommon.model.entity.UserInterfaceInfo;



/**
 * @author fishLight
 * @description 针对表【user_interface_info(用户调用接口关系表)】的数据库操作Service
 * @createDate 2023-07-06 05:49:52
 */
public interface UserInterfaceInfoService extends IService<UserInterfaceInfo> {

    /**
     * 校验
     *
     * @param userInterfaceInfo
     * @param add               是否为创建校验
     */
    void validUserInterfaceInfo(UserInterfaceInfo userInterfaceInfo, boolean add);

    boolean invokeCount(long interfaceInfoId, long userId);
}

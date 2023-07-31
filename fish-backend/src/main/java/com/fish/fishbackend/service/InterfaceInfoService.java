package com.fish.fishbackend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fish.fishcommon.model.entity.InterfaceInfo;

/**
* @author fishLight
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-06-13 15:31:51
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    /**
     * 校验
     *
     * @param interfaceInfo
     * @param add           是否为创建校验
     */
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}

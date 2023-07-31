package com.fish.fishcommon.service;

import com.fish.fishcommon.model.entity.User;

/**
 * 用户服务
 *
 * @author fishapi
 */
public interface InnerUserService {

    /**
     * getInvokeUser
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);
}

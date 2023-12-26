package com.aquarius.usercenter.service;

import com.aquarius.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 用户服务
 *
* @author aquarius
*/
public interface UserService extends IService<User> {

    /**
     *  用户注册
     * @param userAccount 用户账号
     * @param userPassword 用户密码
     * @param checkPassword 确认密码
     * @return 新户用 id
     */
    Long userRegister(String userAccount, String userPassword, String checkPassword);

}

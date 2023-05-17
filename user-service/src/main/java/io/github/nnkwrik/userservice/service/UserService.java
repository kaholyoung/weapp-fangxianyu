package io.github.nnkwrik.userservice.service;

import io.github.nnkwrik.common.dto.SimpleUser;
import io.github.nnkwrik.userservice.model.User;

import java.util.List;
import java.util.Map;

/**

 */
public interface UserService {

    void register(User user);

    SimpleUser getSimpleUser(String openId);

    Map<String, SimpleUser> getSimpleUserList(List<String> openIdList);
}

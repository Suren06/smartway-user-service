package com.api.smartwayuser.service;

import com.api.smartwayuser.VO.ResponseTemplateVO;
import com.api.smartwayuser.model.User;

public interface UserService {

    User save(User department);

    ResponseTemplateVO getUserWithDepartment(Long userId);
}

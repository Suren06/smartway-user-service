package com.api.smartwayuser.serivceImpl;

import com.api.smartwayuser.VO.Department;
import com.api.smartwayuser.VO.ResponseTemplateVO;
import com.api.smartwayuser.model.User;
import com.api.smartwayuser.repository.UserRepository;
import com.api.smartwayuser.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    @Transactional
    public User save(User user){
        User newUser = userRepository.save(user);
        return newUser;
    }

    @Override
    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        ResponseTemplateVO responseTemplateVO = new ResponseTemplateVO();
        User user = userRepository.findByUserId(userId);
        Department department = restTemplate.getForObject("http://localhost:8686/v1/api/"+ user.getUserId(), Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}

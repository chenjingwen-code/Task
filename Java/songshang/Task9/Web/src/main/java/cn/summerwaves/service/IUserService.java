package cn.summerwaves.service;

import cn.summerwaves.model.User;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Service
public interface IUserService {

    void insertUser(User user);

    User selectUserByName(String username);

    List<User> selectIdAvatarUsernameFromAllUser();

    List<User> selectAllUser();

    User selectUserById(int id);

    void updateUser(User user);

    String getCookieValueByName(HttpServletRequest request, String name) throws UnsupportedEncodingException;

    String setPasswordBySalt(String username, String password);
}

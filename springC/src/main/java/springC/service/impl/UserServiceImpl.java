package springC.service.impl;

import lombok.Setter;
import springC.dao.UserDao;
import springC.dao.impl.UserDaoImpl;
import springC.service.UserService;

@Setter
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public void query() {
        userDao.find();
    }

    @Override
    public void upgrade() {
        userDao.update();
    }
}

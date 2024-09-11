package hiber.dao;

import com.mysql.cj.Query;
import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   List<User> listUsers();
   List<User> getUserByCar(String model, int series);

}
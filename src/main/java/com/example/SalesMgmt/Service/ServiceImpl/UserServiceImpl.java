package com.example.SalesMgmt.Service.ServiceImpl;

import com.example.SalesMgmt.DTO.UserDTO;
import com.example.SalesMgmt.Entity.User;
import com.example.SalesMgmt.Repository.UserRepository;
import com.example.SalesMgmt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(UserDTO user) {
        User user1 = new User();
        user1.setFirstname(user.getFirstname());
        user1.setUsername(user.getUsername());
        user1.setLastname(user.getLastname());
        user1.setMobile_no(user.getMobile_no());
        user1.setIs_active(user.getIs_active());
        user1.setPassword(user.getPassword());
        user1.setIs_deleted(user.getIs_deleted());
        try {
            userRepository.save(user1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }



    @Override
    public List<User> listAllDetails() {

        return userRepository.findAll();
    }

    @Override
    public UserDTO updateProductDetails(UserDTO user) {
        User user1 = new User();
        user1.setId(user.getId());
        user1.setFirstname(user.getFirstname());
        user1.setUsername(user.getUsername());
        user1.setLastname(user.getLastname());
        user1.setMobile_no(user.getMobile_no());
        user1.setIs_active(user.getIs_active());
        user1.setPassword(user.getPassword());
        user1.setIs_deleted(user.getIs_deleted());
        userRepository.save(user1);
        return null;
    }
    public User getProductDetailsByID(int userid) {
        Optional<User> user = userRepository.findById(userid);
        return user.get();
    }
        @Override
    public String deleteDetailsById(int id) {
        userRepository.deleteById(id);
        return "successfully deleted";
    }
}

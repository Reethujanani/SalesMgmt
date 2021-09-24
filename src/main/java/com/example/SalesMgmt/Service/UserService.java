package com.example.SalesMgmt.Service;

import com.example.SalesMgmt.DTO.UserDTO;
import com.example.SalesMgmt.Entity.User;
import com.example.SalesMgmt.Repository.UserRepository;

import java.util.List;

public interface UserService {

    UserDTO addUser(UserDTO user);

    List<User> listAllDetails();

    User getProductDetailsByID(int id);

    UserDTO updateProductDetails(UserDTO product);

    String deleteDetailsById(int id);
}

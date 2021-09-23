package com.example.SalesMgmt.Controller;

import com.example.SalesMgmt.DTO.UserDTO;
import com.example.SalesMgmt.Entity.User;
import com.example.SalesMgmt.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")

public class UserController {

    @Autowired
    private UserService UserService;
    private Object User;

    //Post Method
    @PostMapping("/post")
    public UserDTO addUser( @RequestBody UserDTO user  ){
        return UserService.addUser(user);
    }
    //read method
    @GetMapping("/get")
    public List<UserDTO> getAllDetails(){
        return UserService.listAllDetails();
    }
    //read method by ID
    @GetMapping("/getById/{id}")
    public UserDTO getDetailsByID(@PathVariable int id){

        return UserService.getProductDetailsByID(id);
    }

    //update method
    @PutMapping("/update")
    public UserDTO updateStudent(@RequestBody UserDTO product) {
        return UserService.updateProductDetails(product);
    }


    //delete method+
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return UserService.deleteDetailsById(id);
    }
}


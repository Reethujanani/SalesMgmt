package com.example.SalesMgmt.Controller;

import com.example.SalesMgmt.DTO.OrderDTO;
import com.example.SalesMgmt.Entity.Order;
import com.example.SalesMgmt.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    //Post Method
    @PostMapping("/post")
    public OrderDTO addOrder(@RequestBody OrderDTO order){
        return orderService.addOrder(order);
    }
 @PostMapping("/createList")
    public List<Order> saveStudent(@RequestBody List<Order> product){
        return orderService.saveAllDetails(product);
    }

    //read method
    @GetMapping("/get")
    public List<Order> getAllDetails(){
        return orderService.listAllDetails();
    }
    //read method by ID
    @GetMapping("/getById/{id}")
    public Order getDetailsByID(@PathVariable int id){

        return orderService.getProductDetailsByID(id);
    }

/*    @PutMapping("/update")
    public Order updateStudent(@RequestBody Order product) {
        return orderService.updateProductDetails(product);
    }*/



    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return orderService.deleteDetailsById(id);
    }

}



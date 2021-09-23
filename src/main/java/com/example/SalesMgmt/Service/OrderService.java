package com.example.SalesMgmt.Service;

import com.example.SalesMgmt.DTO.OrderDTO;
import com.example.SalesMgmt.Entity.Order;

import java.util.List;

public interface OrderService {



    OrderDTO addOrder(OrderDTO order);

  /*  List<OrderDTO> saveAllDetails(List<OrderDTO> product);

    List<OrderDTO> listAllDetails();

    OrderDTO getProductDetailsByID(int id);

    OrderDTO updateProductDetails(OrderDTO product);

    String deleteDetailsById(int id);*/
}
    
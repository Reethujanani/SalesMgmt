package com.example.SalesMgmt.Service;

import com.example.SalesMgmt.DTO.Spare_partsDTO;
import com.example.SalesMgmt.Entity.Spare_parts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface  Spare_parts_Service {

    Spare_partsDTO addSpare_parts(Spare_partsDTO spare_parts);

    List<Spare_parts> listAllDetails();

    Spare_parts getProductDetailsByID(int id);

    Spare_partsDTO updateProductDetails(Spare_partsDTO spare_parts);

    String deleteDetailsById(int id);
}

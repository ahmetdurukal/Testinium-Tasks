package kodlamaio.northwind.api.controllers;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.core.utilities.results.DataResult;
import kodlamaio.northwind.core.utilities.results.Result;
import kodlamaio.northwind.entities.concretes.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
//kodlama.io/api/products
public class ProductsController {
    private final ProductService productService;

    @GetMapping("/getall")
    public DataResult<List<Product>> getAll(){
        //kodlama.io/api/products/getall
        return this.productService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }

}


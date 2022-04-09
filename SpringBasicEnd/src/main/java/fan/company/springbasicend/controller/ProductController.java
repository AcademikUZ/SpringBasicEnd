package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Product;
import fan.company.springbasicend.payload.ProductDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService service;

    @PostMapping("/add")
    public Result add(@RequestBody ProductDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody ProductDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Product getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Product> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }


}

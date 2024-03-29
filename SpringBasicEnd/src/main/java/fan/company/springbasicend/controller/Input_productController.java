package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Client;
import fan.company.springbasicend.entity.Input_product;
import fan.company.springbasicend.payload.ClientDto;
import fan.company.springbasicend.payload.Input_productDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.ClientService;
import fan.company.springbasicend.services.Input_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/input_product")
public class Input_productController {

    @Autowired
    Input_productService service;

    @PostMapping("/add")
    public Result add(@RequestBody Input_productDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody Input_productDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Input_product getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Input_product> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }




}

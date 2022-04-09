package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Category;
import fan.company.springbasicend.entity.Supplier;
import fan.company.springbasicend.payload.SupplierDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.payload.SupplierDto;
import fan.company.springbasicend.services.CategoryService;
import fan.company.springbasicend.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @Autowired
    SupplierService service;

    @PostMapping("/add")
    public Result add(@RequestBody SupplierDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody SupplierDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Supplier getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Supplier> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }


}

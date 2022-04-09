package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Category;
import fan.company.springbasicend.payload.CategoryDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService service;

    @PostMapping("/add")
    public Result add(@RequestBody CategoryDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody CategoryDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Category getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Category> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }

}

package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Client;
import fan.company.springbasicend.entity.Input;
import fan.company.springbasicend.payload.InputDto;
import fan.company.springbasicend.payload.Input_productDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.InputService;
import fan.company.springbasicend.services.Input_productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/input")
public class InputController {

    @Autowired
    InputService service;

    @PostMapping("/add")
    public Result add(@RequestBody InputDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody InputDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Input getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Input> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }



}

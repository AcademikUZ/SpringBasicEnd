package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Client;
import fan.company.springbasicend.entity.Users;
import fan.company.springbasicend.payload.UsersDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UsersController {

    @Autowired
    UsersService service;

    @PostMapping("/add")
    public Result add(@RequestBody UsersDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody UsersDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Users getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Users> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }



}

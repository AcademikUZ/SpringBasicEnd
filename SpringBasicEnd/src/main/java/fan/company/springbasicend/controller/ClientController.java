package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Client;
import fan.company.springbasicend.entity.Supplier;
import fan.company.springbasicend.payload.ClientDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.payload.SupplierDto;
import fan.company.springbasicend.services.ClientService;
import fan.company.springbasicend.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService service;

    @PostMapping("/add")
    public Result add(@RequestBody ClientDto dto){
        return service.add(dto);
    }

    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody ClientDto dto){
        return service.update(id, dto);
    }

    @GetMapping("/getById/{id}")
    public Client getById(@PathVariable Long id){
        return service.getById(id);
    }

    @GetMapping("/getall")
    public Page<Client> getAll(@RequestParam Integer page){
        return service.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return service.delete(id);
    }



}

package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Warehouse;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.payload.WarehouseDto;
import fan.company.springbasicend.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/warehouse")
public class WarehouseController {

    @Autowired
    WarehouseService warehouseService;

    @PostMapping("/add")
    public Result add(@RequestBody WarehouseDto warehouseDto){
        return warehouseService.add(warehouseDto);
    }


    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody WarehouseDto warehouseDto){
        return warehouseService.update(id, warehouseDto);
    }

    @GetMapping("/getById/{id}")
    public Warehouse getById(@PathVariable Long id){
        return warehouseService.getById(id);
    }

    @GetMapping("/getall")
    public Page<Warehouse> getAll(@RequestParam Integer page){
        return warehouseService.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return warehouseService.delete(id);
    }







}

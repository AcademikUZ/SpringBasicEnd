package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Measurement;
import fan.company.springbasicend.payload.MeasurementDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.MeasurementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {
    
    @Autowired
    MeasurementService measurementService;
    
    @PostMapping("/add")
    public Result add(@RequestBody MeasurementDto measurementDto){
        return measurementService.add(measurementDto);
    }


    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody MeasurementDto measurementDto){
        return measurementService.update(id, measurementDto);
    }

    @GetMapping("/getById/{id}")
    public Measurement getById(@PathVariable Long id){
        return measurementService.getById(id);
    }

    @GetMapping("/getall")
    public Page<Measurement> getAll(@RequestParam Integer page){
        return measurementService.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return measurementService.delete(id);
    }

    
    
    
    
    
}

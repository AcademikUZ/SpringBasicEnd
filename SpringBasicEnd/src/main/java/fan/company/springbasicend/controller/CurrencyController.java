package fan.company.springbasicend.controller;

import fan.company.springbasicend.entity.Currency;
import fan.company.springbasicend.entity.Measurement;
import fan.company.springbasicend.payload.CurrencyDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/currency")
public class CurrencyController {

    @Autowired
    CurrencyService currencyService;

    @PostMapping("/add")
    public Result add(@RequestBody CurrencyDto currencyDto){
        return currencyService.add(currencyDto);
    }


    @PutMapping("/update/{id}")
    public Result add(@PathVariable Long id, @RequestBody CurrencyDto currencyDto){
        return currencyService.update(id, currencyDto);
    }

    @GetMapping("/getById/{id}")
    public Currency getById(@PathVariable Long id){
        return currencyService.getById(id);
    }

    @GetMapping("/getall")
    public Page<Currency> getAll(@RequestParam Integer page){
        return currencyService.getAll(page);
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Long id){
        return currencyService.delete(id);
    }





}

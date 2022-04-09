package fan.company.springbasicend.services;

import fan.company.springbasicend.entity.Product;
import fan.company.springbasicend.entity.Users;
import fan.company.springbasicend.entity.Warehouse;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.payload.UsersDto;
import fan.company.springbasicend.repository.UsersRepository;
import fan.company.springbasicend.repository.UsersRepository;
import fan.company.springbasicend.repository.WareHouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class UsersService {

    @Autowired
    UsersRepository repository;
    @Autowired
    WareHouseRepository wareHouseRepository;


    public Result add(UsersDto dto) {
        try {


            Users users = new Users();
            users.setFirstName(dto.getFirstName());
            users.setLastName(dto.getLastName());
            users.setActive(dto.isActive());
            users.setPassword(dto.getPassword());
            Users findTopByOrderByIdDesc = repository.findTopByOrderByIdDesc();
            String code;
            if (findTopByOrderByIdDesc.getId() != null) {
                code = String.valueOf(findTopByOrderByIdDesc.getId() + 1);
            } else {
                code = "1";
            }
            users.setCode(code);
            users.setPhoneNumber(dto.getPhoneNumber());
            Optional<Warehouse> wareHouseRepositoryById = wareHouseRepository.findById(dto.getWarehousesId());
            if (wareHouseRepositoryById.isPresent())
                return new Result("Bunday idlik Warehouse ma'lumot yo'q", false);
            Set<Warehouse> warehouses = users.getWarehouses();
            warehouses.add(wareHouseRepositoryById.get());
            users.setWarehouses(warehouses);
            repository.save(users);
            return new Result("Ma'lumot saqlandi", true);

        } catch (Exception e) {
            return new Result("Xatolik yuz berdi", false);
        }

    }

    public Result update(Long id, UsersDto dto) {
        try {

            Optional<Users> optionalUsers = repository.findById(id);
            if (!optionalUsers.isPresent())
                return new Result("Bunday idlik ma'lumot yo'q", false);
            Users users = optionalUsers.get();
            users.setFirstName(dto.getFirstName());
            users.setLastName(dto.getLastName());
            users.setActive(dto.isActive());
            users.setPassword(dto.getPassword());
            Users findTopByOrderByIdDesc = repository.findTopByOrderByIdDesc();

            String code;
            if (findTopByOrderByIdDesc.getId() != null) {
                code = String.valueOf(findTopByOrderByIdDesc.getId() + 1);
            } else {
                code = "1";
            }
            users.setCode(code);
            users.setPhoneNumber(dto.getPhoneNumber());

            Optional<Warehouse> wareHouseRepositoryById = wareHouseRepository.findById(dto.getWarehousesId());
            if (wareHouseRepositoryById.isPresent())
                return new Result("Bunday idlik Warehouse ma'lumot yo'q", false);
            Set<Warehouse> warehouses = users.getWarehouses();
            warehouses.add(wareHouseRepositoryById.get());
            users.setWarehouses(warehouses);

            repository.save(users);
            return new Result("Ma'lumot o'zgartirildi", true);

        } catch (Exception e) {
            return new Result("Xatolik yuz berdi", false);
        }

    }

    public Page<Users> getAll(Integer page) {
        Pageable pageable = PageRequest.of(page, 10);
        return repository.findAll(pageable);
    }


    public Users getById(Long id) {
        Optional<Users> byId = repository.findById(id);
        if (!byId.isPresent())
            return new Users();
        return byId.get();
    }

    public Result delete(Long id) {
        Optional<Users> byId = repository.findById(id);
        if (!byId.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);
        repository.deleteById(id);
        return new Result("Ma'lumot o'chirildi", true);
    }


}

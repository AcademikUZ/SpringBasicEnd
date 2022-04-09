package fan.company.springbasicend.services;

import fan.company.springbasicend.entity.Client;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.payload.ClientDto;
import fan.company.springbasicend.repository.ClientRepository;
import fan.company.springbasicend.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;


    public Result add(ClientDto dto) {
        Client client = new Client();
        client.setName(dto.getName());
        client.setActive(dto.isActive());
        client.setPhoneNumber(dto.getPhoneNumber());
        repository.save(client);
        return new Result("Ma'lumot saqlandi", true);
    }

    public Result update(Long id, ClientDto dto) {
        Optional<Client> optionalClient = repository.findById(id);
        if (!optionalClient.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);
        Client client = optionalClient.get();
        client.setName(dto.getName());
        client.setActive(dto.isActive());
        client.setPhoneNumber(dto.getPhoneNumber());
        repository.save(client);
        return new Result("Ma'lumot o'zgartirildi", true);
    }

    public Page<Client> getAll(Integer page) {
        Pageable pageable = PageRequest.of(page, 10);
        return repository.findAll(pageable);
    }


    public Client getById(Long id) {
        Optional<Client> byId = repository.findById(id);
        if (!byId.isPresent())
            return new Client();
        return byId.get();
    }

    public Result delete(Long id) {
        Optional<Client> byId = repository.findById(id);
        if (!byId.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);
        repository.deleteById(id);
        return new Result("Ma'lumot o'chirildi", true);
    }

}

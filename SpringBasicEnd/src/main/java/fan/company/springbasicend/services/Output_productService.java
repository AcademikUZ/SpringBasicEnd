package fan.company.springbasicend.services;

import fan.company.springbasicend.entity.Output;
import fan.company.springbasicend.entity.Output_product;
import fan.company.springbasicend.entity.Product;
import fan.company.springbasicend.payload.Output_productDto;
import fan.company.springbasicend.payload.Result;
import fan.company.springbasicend.repository.OutputRepository;
import fan.company.springbasicend.repository.Output_productRepository;
import fan.company.springbasicend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Output_productService {


    @Autowired
    ProductRepository productRepository;
    @Autowired
    OutputRepository outputRepository;
    @Autowired
    Output_productRepository repository;


    public Result add(Output_productDto dto) {
        Optional<Product> productRepositoryById = productRepository.findById(dto.getProductId());
        if (!productRepositoryById.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);
        Optional<Output> outputRepositoryById = outputRepository.findById(dto.getOutputId());
        if (!outputRepositoryById.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);

        Output_product output_product = new Output_product();
        output_product.setProduct(productRepositoryById.get());
        output_product.setOutput(outputRepositoryById.get());
        output_product.setAmount(dto.getAmount());
        output_product.setPrice(dto.getPrice());
        repository.save(output_product);
        return new Result("Ma'lumot saqlandi", true);
    }

    public Result update(Long id, Output_productDto dto) {
        Optional<Product> productRepositoryById = productRepository.findById(dto.getProductId());
        if (!productRepositoryById.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);
        Optional<Output> outputRepositoryById = outputRepository.findById(dto.getOutputId());
        if (!outputRepositoryById.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);

        Optional<Output_product> repositoryById = repository.findById(id);
        if (!repositoryById.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);

        Output_product output_product = new Output_product();
        output_product.setProduct(productRepositoryById.get());
        output_product.setOutput(outputRepositoryById.get());
        output_product.setAmount(dto.getAmount());
        output_product.setPrice(dto.getPrice());
        repository.save(output_product);
        return new Result("Ma'lumot o'zgartirildi", true);
    }

    public Page<Output_product> getAll(Integer page) {
        Pageable pageable = PageRequest.of(page, 10);
        return repository.findAll(pageable);
    }


    public Output_product getById(Long id) {
        Optional<Output_product> byId = repository.findById(id);
        if (!byId.isPresent())
            return new Output_product();
        return byId.get();
    }

    public Result delete(Long id) {
        Optional<Output_product> byId = repository.findById(id);
        if (!byId.isPresent())
            return new Result("Bunday idlik ma'lumot yo'q", false);
        repository.deleteById(id);
        return new Result("Ma'lumot o'chirildi", true);
    }

}

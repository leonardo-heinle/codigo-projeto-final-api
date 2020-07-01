package heinle.leonardo.projetofinalapi.controller;

import heinle.leonardo.projetofinalapi.model.StockEntity;
import heinle.leonardo.projetofinalapi.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/stocks")
public class StockController {


    @Autowired
    private StockFindAllService stockFindAllService;

    @Autowired
    private StockFindByIdService stockFindByIdService;

    @Autowired
    private StockSaveService stockSaveService;

    @Autowired
    private StockUpdateService stockUpdateService;

    @Autowired
    private StockDeleteService stockDeleteService;

    // buscar todos no banco
    @GetMapping
    public ResponseEntity<List<StockEntity>> findAll() {
        return  new ResponseEntity<List<StockEntity>>(this.stockFindAllService.findAll(),
                new HttpHeaders(),
                HttpStatus.OK);
    }

    // buscar 1 objeto no banco
    @GetMapping(path = "/{id}")
    public ResponseEntity<StockEntity> findById(@PathVariable("id") long id) {

        StockEntity stockEntity = this.stockFindByIdService.findById(id);
        if (stockEntity != null){
            return new ResponseEntity<StockEntity>(
                    stockEntity,
                    new HttpHeaders(),
                    HttpStatus.OK);
        }
        return new ResponseEntity<StockEntity>(HttpStatus.NOT_FOUND);
    }



    //cadastrar 1 objeto no banco por json
    @PostMapping
    public ResponseEntity<StockEntity> save(@Valid @RequestBody StockEntity stockEntity) {
        return new ResponseEntity<StockEntity>(
                this.stockSaveService.save(stockEntity),
                new HttpHeaders(),
                HttpStatus.CREATED);
    }

    //alterar 1 objeto no banco json
    @PutMapping
    public ResponseEntity<StockEntity> update(@RequestBody StockEntity stockEntity)  {
        return new ResponseEntity<StockEntity>(
                this.stockUpdateService.update(stockEntity),
                new HttpHeaders(),
                HttpStatus.OK);
    }


    //excluir 1 objeto no banco
    @DeleteMapping(path = "/{id}")
    public  ResponseEntity<StockEntity> delete(@PathVariable("id") long id){
        this.stockDeleteService.delete(id);
        return new ResponseEntity<StockEntity>(new HttpHeaders(), HttpStatus.OK);
    }

}

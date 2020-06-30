package heinle.leonardo.projetofinalapi.service;

import heinle.leonardo.projetofinalapi.model.StockEntity;
import heinle.leonardo.projetofinalapi.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockFindAllService {

    @Autowired
    private StockRepository stockRepository;

    public List<StockEntity> findAll() {
        return (List<StockEntity>) this.stockRepository.findAll();
    }
}

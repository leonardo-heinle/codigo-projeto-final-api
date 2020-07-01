package heinle.leonardo.projetofinalapi.service;

import heinle.leonardo.projetofinalapi.model.StockEntity;
import heinle.leonardo.projetofinalapi.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockUpdateService {

    @Autowired
    private StockRepository stockRepository;

    public StockEntity update(StockEntity stockEntity) {
        return this.stockRepository.save(stockEntity);
    }
}

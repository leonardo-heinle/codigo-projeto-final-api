package heinle.leonardo.projetofinalapi.service;

import heinle.leonardo.projetofinalapi.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockDeleteService {

    @Autowired
    private StockRepository stockRepository;

    public void delete(long id) {
        this.stockRepository.deleteById(id);
    }
}

package heinle.leonardo.projetofinalapi.repository;

import heinle.leonardo.projetofinalapi.model.StockEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<StockEntity, Long> {
}

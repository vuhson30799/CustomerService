package cms.repository;

import cms.model.Customer;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CustomerRepository extends PagingAndSortingRepository<Customer,Long> {
}

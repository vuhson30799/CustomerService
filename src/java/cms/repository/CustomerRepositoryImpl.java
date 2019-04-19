//package cms.repository;
//
//import cms.model.Customer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.Page;
//import org.springframework.data.domain.Pageable;
//import org.springframework.data.domain.Sort;
//
//import javax.persistence.EntityManager;
//import javax.persistence.NoResultException;
//import javax.persistence.PersistenceContext;
//import javax.persistence.TypedQuery;
//import java.util.List;
//
//public class CustomerRepositoryImpl implements CustomerRepository {
//    @Autowired
//    private CustomerRepository customerReository;
//    @Override
//    public Iterable<Customer> findAll(Sort sort) {
//        return null;
//    }
//
//    @Override
//    public Page<Customer> findAll(Pageable pageable) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> S save(S s) {
//        return null;
//    }
//
//    @Override
//    public <S extends Customer> Iterable<S> save(Iterable<S> iterable) {
//        return null;
//    }
//
//    @Override
//    public Customer findOne(Long aLong) {
//        return null;
//    }
//
//    @Override
//    public boolean exists(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Customer> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Customer> findAll(Iterable<Long> iterable) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void delete(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Customer customer) {
//
//    }
//
//    @Override
//    public void delete(Iterable<? extends Customer> iterable) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
////    @PersistenceContext
////    private EntityManager em;
////
////    @Override
////    public List<Customer> findAll() {
////        TypedQuery<Customer> query = em.createQuery("select c from Customer c", Customer.class);
////        return query.getResultList();
////    }
////
////    @Override
////    public Customer findById(Long id) {
////        TypedQuery<Customer> query = em.createQuery("select c from Customer c where  c.id=:id", Customer.class);
////        query.setParameter("id", id);
////        try {
////            return query.getSingleResult();
////        }catch (NoResultException e){
////            return null;
////        }
////    }
////
////    @Override
////    public void save(Customer model) {
////        if(model.getId() != null){
////            em.merge(model);
////        } else {
////            em.persist(model);
////        }
////    }
////
////    @Override
////    public void remove(Long id) {
////        Customer customer = findById(id);
////        if(customer != null){
////            em.remove(customer);
////        }
////    }
//}

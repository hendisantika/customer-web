package id.my.hendisantika.customer.repository;

import id.my.hendisantika.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA.
 * Project : customer-web
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 18/04/25
 * Time: 10.51
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

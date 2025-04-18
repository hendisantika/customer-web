package id.my.hendisantika.customer.controller;

import id.my.hendisantika.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by IntelliJ IDEA.
 * Project : customer-web
 * User: hendisantika
 * Link: s.id/hendisantika
 * Email: hendisantika@yahoo.co.id
 * Telegram : @hendisantika34
 * Date: 18/04/25
 * Time: 10.57
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;
}

package id.my.hendisantika.customer.controller;

import id.my.hendisantika.customer.model.Customer;
import id.my.hendisantika.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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

    @GetMapping
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerRepository.findAll());
        return "customers/list";
    }

    @GetMapping("/new)")
    public String showCreateForm(Model model) {
        model.addAttribute("customer", new Customer());
        return "customers/form";
    }

    @PostMapping("/save")
    public String saveCustomer(Customer customer, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "customers/form";
        }
        customerRepository.save(customer);
        return "redirect:/customers";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        Customer customer = customerRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid customer Id:" + id));
        model.addAttribute("customer", customer);
        return "customers/form";
    }

}

package com.example.secsectionthree.config;

import com.example.secsectionthree.model.Customer;
import com.example.secsectionthree.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProjectUserDetails implements UserDetailsService {

    @Autowired
    CustomerRepository customerRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        List<Customer> customer = customerRepository.findByEmail(username);
        if(customer.size()==0){
            System.out.println("user not found");
            throw new UsernameNotFoundException("user details ot found for : "+username);
        }

        return new SecurityCustomer(customer.get(0));
    }
}

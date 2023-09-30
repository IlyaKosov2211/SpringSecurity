package ru.netology.SpringSecurity.repository;

import javax.persistence.*;
import ru.netology.SpringSecurity.model.Contact;
import ru.netology.SpringSecurity.model.Person;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataEntity implements CommandLineRunner {
    @PersistenceContext
    EntityManager entityManager;
    @Override
    @Transactional
    public void run(String... args) throws Exception {

        Person ivan = Person.builder().contact(Contact.builder()
                        .name("Ivan")
                        .surname("Petrov")
                        .age(25)
                        .build())
                .phoneNumber("+7 (123) 456-78-90")
                .cityOfLiving("Moscow")
                .build();

        Person petr = Person.builder().contact(Contact.builder()
                        .name("Petr")
                        .surname("Ivanov")
                        .age(38)
                        .build())
                .phoneNumber("+7 (789) 456-12-30")
                .cityOfLiving("Moscow")
                .build();

        Person vasya = Person.builder().contact(Contact.builder()
                        .name("Vasiliy")
                        .surname("Sidorov")
                        .age(37)
                        .build())
                .phoneNumber("+7 (809) 765-43-21")
                .cityOfLiving("Orel")
                .build();

    }
}
package com.poc;

import com.poc.domain.Computer;
import com.poc.domain.MobilePhone;
import com.poc.repository.ComputerRepository;
import com.poc.repository.MobilePhoneRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Slf4j
@SpringBootApplication
@EnableJpaAuditing
public class MainApplication implements ApplicationRunner {

    @Autowired
    private ComputerRepository computerRepository;

    @Autowired
    private MobilePhoneRepository mobilePhoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("############################   RUN   ############################");

        var testComputer = Computer.builder()
                .brand("Lenovo")
                .name("LP-0201")
                .oS("Ubuntu 22.04")
                .build();
        computerRepository.save(testComputer);

        var testMobilePhone = MobilePhone.builder()
                .brand("Google Pixel 3")
                .name("Pixel-Darvin")
                .color("Grey")
                .build();
        mobilePhoneRepository.save(testMobilePhone);
    }

}

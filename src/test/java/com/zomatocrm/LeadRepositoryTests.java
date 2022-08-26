package com.zomatocrm;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.zomatocrm.entities.Lead;
import com.zomatocrm.repositories.LeadRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class LeadRepositoryTests {
	
	@Autowired
	LeadRepository leadRepo;
	
	@Test
	public void saveOneLead() {
    	Lead l = new Lead("mike","m","mike@gmail.com","9833224433","online");
    	leadRepo.save(l);
    	assertThat(l.getId()).isGreaterThan(0);
		}
	@Test
	public void saveRestLead() {
    	Lead l1 = new Lead("stallin","s","stallin@gmail.com","9833887766","radio");
    	Lead l2 = new Lead("pankaj","m","pankaj@gmail.com","9632008866","online");
    	leadRepo.save(l1);
    	leadRepo.save(l2);

    	assertThat(l1.getId()).isGreaterThan(0);
    	assertThat(l2.getId()).isGreaterThan(0);

		}


}

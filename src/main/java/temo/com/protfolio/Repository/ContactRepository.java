package temo.com.protfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import temo.com.protfolio.Entity.Contact;
@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {
}

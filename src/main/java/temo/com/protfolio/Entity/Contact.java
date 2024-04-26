package temo.com.protfolio.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import temo.com.protfolio.Dto.ContactDto;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private String phoneNo;
    private String email;

    public ContactDto getDto() {
        ContactDto contactDto = new ContactDto();
        contactDto.setId(id);
        contactDto.setAddress(address);
        contactDto.setEmail(email);
        contactDto.setPhoneNo(phoneNo);
        return contactDto;
    }
}

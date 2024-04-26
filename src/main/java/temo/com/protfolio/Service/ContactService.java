package temo.com.protfolio.Service;

import temo.com.protfolio.Dto.ContactDto;
import temo.com.protfolio.Entity.Contact;

import java.util.List;

public interface ContactService {

    List<ContactDto> getAllContacts();
    ContactDto saveContact(ContactDto contactDto);
    Contact getContactById(Long id);
}

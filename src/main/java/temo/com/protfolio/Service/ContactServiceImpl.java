package temo.com.protfolio.Service;

import org.springframework.stereotype.Service;
import temo.com.protfolio.Dto.ContactDto;
import temo.com.protfolio.Entity.Contact;
import temo.com.protfolio.Repository.ContactRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    ContactRepository contactRepository;

    public ContactServiceImpl(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public List<ContactDto> getAllContacts() {
        List<Contact> contacts = contactRepository.findAll();
        return contacts.stream().map(Contact::getDto).collect(Collectors.toList());
    }

    @Override
    public ContactDto saveContact(ContactDto contactDto) {
        Contact contact = new Contact();
        contact.setEmail(contactDto.getEmail());
        contact.setPhoneNo(contactDto.getPhoneNo());
        contact.setAddress(contactDto.getAddress());
        return contactRepository.save(contact).getDto();
    }

    @Override
    public Contact getContactById(Long id) {
        return contactRepository.findById(id).orElse(null);
    }
}

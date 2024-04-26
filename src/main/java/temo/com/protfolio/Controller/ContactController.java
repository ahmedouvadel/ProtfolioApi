package temo.com.protfolio.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temo.com.protfolio.Dto.ContactDto;
import temo.com.protfolio.Service.ContactService;
@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ContactController {

    ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    @PostMapping("/createc")
    public ResponseEntity<ContactDto> createContact(@RequestBody ContactDto contactDto){
        ContactDto contactDto1 = contactService.saveContact(contactDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(contactDto1);
    }
}

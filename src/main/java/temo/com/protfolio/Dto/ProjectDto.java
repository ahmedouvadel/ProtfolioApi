package temo.com.protfolio.Dto;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
    private Long id;
    private String title;
    private String description;
    private List<String> technologies;
    private byte[] byteImg;
    private MultipartFile image;
}

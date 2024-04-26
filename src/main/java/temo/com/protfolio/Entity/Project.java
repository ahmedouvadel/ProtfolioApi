package temo.com.protfolio.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import temo.com.protfolio.Dto.ProjectDto;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Lob
    @Column(length = 1000) // Adjust length based on your description length
    private String description;

    @ElementCollection
    private List<String> technologies;
    @Lob
    private byte[] image; // Store image path or URL

    public ProjectDto getDto(){
        ProjectDto projectDto = new ProjectDto();
        projectDto.setId(id);
        projectDto.setTitle(title);
        projectDto.setByteImg(image);
        projectDto.setDescription(description);
        projectDto.setTechnologies(technologies);
        return projectDto;
    }
}

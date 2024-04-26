package temo.com.protfolio.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import temo.com.protfolio.Dto.ProjectDto;
import temo.com.protfolio.Repository.ProjectRepository;
import temo.com.protfolio.Service.ProjectService;

import java.io.IOException;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProjectController {

    ProjectService projectService;
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }
    @PostMapping("/createp")
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto) throws IOException {
        ProjectDto projectDto1 = projectService.saveProject(projectDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(projectDto1);
    }

}

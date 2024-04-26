package temo.com.protfolio.Service;

import org.springframework.stereotype.Service;
import temo.com.protfolio.Dto.ProjectDto;
import temo.com.protfolio.Entity.Project;
import temo.com.protfolio.Repository.ProjectRepository;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProjectServiceImpl implements ProjectService {

    private ProjectRepository projectRepository;

    public ProjectServiceImpl(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    @Override
    public List<ProjectDto> getAllProjects() {
        List<Project> projects = projectRepository.findAll();
        return projects.stream().map(Project::getDto).collect(Collectors.toList());
    }

    @Override
    public ProjectDto saveProject(ProjectDto projectDto) throws IOException {
        Project project = new Project();
        project.setTitle(projectDto.getTitle());
        project.setDescription(projectDto.getDescription());
        project.setTechnologies(projectDto.getTechnologies());

        // Check if the image is not null before getting bytes
        if (projectDto.getImage() != null) {
            project.setImage(projectDto.getImage().getBytes());
        }

        return projectRepository.save(project).getDto();
    }

    @Override
    public Project getProjectById(Long id) {
        return projectRepository.findById(id).orElse(null);
    }

}

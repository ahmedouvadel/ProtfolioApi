package temo.com.protfolio.Service;

import temo.com.protfolio.Dto.ProjectDto;
import temo.com.protfolio.Entity.Project;

import java.io.IOException;
import java.util.List;

public interface ProjectService {

    List<ProjectDto> getAllProjects();
    ProjectDto saveProject(ProjectDto projectDto) throws IOException;
    Project getProjectById(Long id);
}

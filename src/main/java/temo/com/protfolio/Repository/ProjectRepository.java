package temo.com.protfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import temo.com.protfolio.Entity.Project;
@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
}

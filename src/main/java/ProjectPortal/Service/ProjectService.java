package ProjectPortal.Service;

import ProjectPortal.Model.Project;
import ProjectPortal.Model.Subproject;
import ProjectPortal.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.*;

@Service
public class ProjectService {
    private final ProjectRepository projectRepository;

    @Autowired
    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public void createProject(Project project){
        projectRepository.createProject(project);
    }

    public Project readProject(int projectId){
        return projectRepository.readProject(projectId);
    }

    public List<Project> readAllProjects(){
        return projectRepository.readAllProjects();
    }

    public void updateProject(Project project, int projectId){
        projectRepository.updateProject(project, projectId);
    }

    public void deleteProject(int projectId){
        projectRepository.deleteProject(projectId);
    }

    public  int calculateTotalAvailableEmployees(List<Subproject> listOfSubprojects, Project project){
        return projectRepository.calculateTotalAvailableEmployees(listOfSubprojects, project);
    }

    public double calculateTotalActualCost(List<Subproject> listOfSubprojects){
        return projectRepository.calculateTotalActualCost(listOfSubprojects);
    }

    public String formatForJavaScript(LocalDate date){
        return projectRepository.formatForJavaScript(date);
    }
}

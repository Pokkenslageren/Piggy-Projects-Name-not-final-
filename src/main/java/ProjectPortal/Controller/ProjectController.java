package ProjectPortal.Controller;

import ProjectPortal.Model.Project;
import ProjectPortal.Model.User;
import ProjectPortal.Service.ProjectService;
import ProjectPortal.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("")
public class ProjectController {

    private final ProjectService projectService;
    private final UserService userService;
    public ProjectController(ProjectService projectService, UserService userService) {
        this.projectService = projectService;
        this.userService = userService;
    }

    @GetMapping("/{user}/home/createproject")
    public String createProject(@PathVariable("user") int userId, Model model){
        User user = userService.readUserById(userId);
        Project project = new Project();
        project.setCompanyId(user.getCompanyId());
        project.setComplete(false);
        model.addAttribute("project", project);
        return "create-project";
    }

    @PostMapping("/{user}/home/createproject")
    public String createProject(@PathVariable("user") int userId, @ModelAttribute Project project){
        projectService.createProject(project);
        return "redirect:/home";
    }

}

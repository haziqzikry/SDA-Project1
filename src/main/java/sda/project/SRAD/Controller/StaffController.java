package sda.project.SRAD.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {
    
    @GetMapping("/")
    public String index() {
        return "Staff/StaffMenu";
    }

    @GetMapping("/student-applications")
    public String studentApplications() {
        return "Staff/StudentApplications";
    }

    @GetMapping("/agent-applications")
    public String agentApplications() {
        return "Staff/AgentApplications";
    }

    @GetMapping("/statistics")
    public String statistics() {
        return "Staff/Statistics";
    }
}

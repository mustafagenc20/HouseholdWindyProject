package be.intecbrussel.householdwindyproject.service;

import be.intecbrussel.householdwindyproject.service.enums.Tool;

import javax.annotation.PostConstruct;
import java.util.List;

public class CleaningRobot {
    List<Tool> tools;

/*    public CleaningRobot(List<Tool> tools) {
        this.tools = tools;
    }*/

    @PostConstruct
    public void clean() {

    }

}

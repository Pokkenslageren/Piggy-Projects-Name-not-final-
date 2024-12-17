package ProjectPortal.Model;

import java.time.LocalDate;
import java.util.*;

public class Subproject {
    private int projectId;
    private String subprojectName;
    private int subprojectId;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalEstimatedCost;
    private double totalActualCost;  // Added to match DB
    private int totalAssignedEmployees;
    private boolean isComplete;
    private String subprojectDescription;
    private int hoursAllocated;
    private Priority priority;
    private List<Task> tasks;
    private int totalActualHours;

    /**
     * Default constructor for the Subproject class.
     * Initializes a new instance of Subproject without setting any properties.
     */
    public Subproject() {}

    /**
     * Constructs a new Subproject instance with the provided details.
     * @param projectId the unique identifier for the main project
     * @param subprojectName the name of the subproject
     * @param subprojectId the unique identifier for the subproject
     * @param startDate the start date of the subproject
     * @param endDate the end date of the subproject
     * @param totalEstimatedCost the total estimated cost for the subproject
     * @param totalActualCost the total actual cost incurred for the subproject
     * @param totalAssignedEmployees the total number of employees assigned to the subproject
     * @param isComplete indicates whether the subproject is complete or not
     * @param subprojectDescription a detailed description of the subproject
     * @param hoursAllocated the number of hours allocated to the subproject
     * @param priority the priority level of the subproject
     */
    public Subproject(int projectId, String subprojectName, int subprojectId,
                      LocalDate startDate, LocalDate endDate, double totalEstimatedCost,
                      double totalActualCost, int totalAssignedEmployees, boolean isComplete,
                      String subprojectDescription, int hoursAllocated, Priority priority) {
        this.projectId = projectId;
        this.subprojectName = subprojectName;
        this.subprojectId = subprojectId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalEstimatedCost = totalEstimatedCost;
        this.totalActualCost = totalActualCost;
        this.totalAssignedEmployees = totalAssignedEmployees;
        this.isComplete = isComplete;
        this.subprojectDescription = subprojectDescription;
        this.hoursAllocated = hoursAllocated;
        this.priority = priority;
    }
    /**
     * Retrieves the ID of the associated project.
     * @return the project ID as an integer
     */
    public int getProjectId() {
        return projectId;
    }

    /**
     * Retrieves the name of the subproject.
     * @return the subproject name as a String
     */
    public String getSubprojectName() {
        return subprojectName;
    }

    /**
     * Retrieves the unique identifier of the subproject.
     * @return the subproject ID as an integer
     */
    public int getSubprojectId() {
        return subprojectId;
    }

    /**
     * Retrieves the start date of the subproject.
     * @return the start date of the subproject as a LocalDate
     */
    public LocalDate getStartDate() {
        return startDate;
    }

    /**
     * Retrieves the total estimated cost of the subproject.
     * @return the total estimated cost as a double
     */
    public double getTotalEstimatedCost() {
        return totalEstimatedCost;
    }

    /**
     * Retrieves the total actual cost incurred for the sub-project.
     * @return the total actual cost as a double
     */
    public double getTotalActualCost() {
        return totalActualCost;
    }

    /**
     * Retrieves the total number of employees assigned to the subproject.
     * @return the total number of assigned employees as an integer
     */
    public int getTotalAssignedEmployees() {
        return totalAssignedEmployees;
    }

    /**
     * Retrieves the end date of the subproject.
     * @return the end date of the subproject as a LocalDate
     */
    public LocalDate getEndDate() {
        return endDate;
    }

    /**
     * Checks if the subproject is marked as complete.
     * @return true if the subproject is complete, false otherwise
     */
    public boolean isComplete() {
        return isComplete;
    }

    /**
     * Retrieves the description of the subproject.
     * @return the subproject description as a String
     */
    public String getSubprojectDescription() {
        return subprojectDescription;
    }

    /**
     * Retrieves the priority level associated with the subproject.
     * @return the priority of the subproject as an instance of the Priority enumeration
     */
    public Priority getPriority(){
        return priority;
    }

    /**
     * Retrieves the number of hours allocated to the subproject.
     * @return the allocated hours as an integer
     */
    public int getHoursAllocated(){
        return hoursAllocated;
    }

    /**
     * Retrieves the list of tasks associated with the subproject.
     * @return a list of Task objects representing the tasks in the subproject
     */
    public List<Task> getTasks() { return tasks; }

    /**
     * Retrieves the total actual hours spent on the subproject.
     * @return the total actual hours as an integer
     */
    public int getTotalActualHours() {
        return totalActualHours;
    }

    /**
     * Sets the project ID associated with the subproject.
     * @param projectId the unique identifier of the project to set
     */
    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    /**
     * Sets the name of the subproject.
     * @param subprojectName the name to be assigned to the subproject
     */
    public void setSubprojectName(String subprojectName) {
        this.subprojectName = subprojectName;
    }

    /**
     * Sets the unique identifier for the subproject.
     * @param subprojectId the ID of the subproject to be assigned
     */
    public void setSubprojectId(int subprojectId) {
        this.subprojectId = subprojectId;
    }

    /**
     * Sets the start date for the subproject.
     * @param startDate the LocalDate value representing the start date of the subproject
     */
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    /**
     * Sets the total estimated cost for the subproject.
     * @param totalEstimatedCost the total estimated cost of the subproject
     */
    public void setTotalEstimatedCost(double totalEstimatedCost) {
        this.totalEstimatedCost = totalEstimatedCost;
    }

    /**
     * Updates the total actual cost associated with the subproject.
     * @param totalActualCost the total actual cost to set for the subproject
     */
    public void setTotalActualCost(double totalActualCost) {
        this.totalActualCost = totalActualCost;
    }

    /**
     * Sets the priority of the subproject based on the given priority string.
     * @param priority the priority level to set, represented as a string.
     *                 Must match the name of one of the constants in the {@code Priority} enum.
     *                 Valid values are "LOW", "MEDIUM", or "HIGH".
     * @throws IllegalArgumentException if the given string does not match any constant in the {@code Priority} enum.
     */
    public void setPriority(String priority){
        this.priority =Priority.valueOf(priority);
    }

    /**
     * Sets the number of hours allocated to the subproject.
     * @param hoursAllocated the number of hours to allocate
     */
    public void setHoursAllocated(int hoursAllocated){
        this.hoursAllocated = hoursAllocated;
    }

    /**
     * Sets the total number of employees assigned to the subproject.
     * @param totalAssignedEmployees the total number of employees to be assigned
     */
    public void setTotalAssignedEmployees(int totalAssignedEmployees) {
        this.totalAssignedEmployees = totalAssignedEmployees;
    }

    /**
     * Sets the end date of the subproject.
     * @param endDate the end date to set for the subproject
     */
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * Sets the completion status of the subproject.
     * @param isComplete the completion status to set for the subproject;
     *                   true if the subproject is complete, false otherwise
     */
    public void setComplete(boolean isComplete) {
        this.isComplete = isComplete;
    }

    /**
     * Sets the description of the subproject.
     * @param subprojectDescription the description of the subproject to set
     */
    public void setSubprojectDescription(String subprojectDescription) {
        this.subprojectDescription = subprojectDescription;
    }

    /**
     * Sets the list of tasks associated with the subproject.
     * @param tasks the list of Task objects to be associated with the subproject
     */
    public void setTasks(List<Task> tasks) { this.tasks = tasks; }

    /**
     * Sets the total actual hours for the subproject.
     * @param totalActualHours the total actual hours worked on the subproject
     */
    public void setTotalActualHours(int totalActualHours) {
        this.totalActualHours = totalActualHours;
    }

    /**
     * Calculates and returns the progress percentage of the subproject based on the
     * total actual hours worked and the allocated hours.
     * If no hours are allocated, the progress percentage defaults to 0.
     * @return the progress percentage as a double value. The percentage is calculated
     *         as the ratio of total actual hours to allocated hours multiplied by 100.
     *         Returns 0 if hoursAllocated is 0.
     */
    public double getProgressPercentage() {
        if (hoursAllocated == 0) return 0;
        return (double) totalActualHours / hoursAllocated * 100;
    }
}

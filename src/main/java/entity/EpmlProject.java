package entity;

public class EpmlProject {
    private long employeeId;
    private long projectId;

    public EpmlProject() {
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

    @Override
    public String toString() {
        return "EpmlProject{" +
                "employeeId=" + employeeId +
                ", projectId=" + projectId +
                '}';
    }
}

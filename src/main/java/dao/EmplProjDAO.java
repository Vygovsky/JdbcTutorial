package dao;

import entity.EpmlProject;

import java.util.List;

public interface EmplProjDAO {
    //create
    void add(EpmlProject emplProject);

    //read

    EpmlProject getByEmployProjectId(EpmlProject employeeId, EpmlProject projectId);

    //update
    void update(EpmlProject project);

    //delete
    void remove(EpmlProject address);
}

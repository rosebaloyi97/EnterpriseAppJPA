/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.session;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import za.ac.tut.employee.EmployeeDTO;

/**
 *
 * @author falcorp
 */
@Stateless
public class EmployeeBean implements EmployeeInterface {
    
    @PersistenceContext(unitName = "EmpUnit")
    private EntityManager entity;

    @Override
    public void addEmp(EmployeeDTO emp) {
        entity.persist(emp);
    }

    @Override
    public void updateEmp(EmployeeDTO emp) {
        
        EmployeeDTO empObj = null;
         empObj = findEmp(emp.getEmpId());
         
         if(empObj != null){
             entity.merge(emp);
         }
         
    }

    @Override
    public void deleteEmp(Long empId) {
        
        EmployeeDTO empObj = null;
        empObj = findEmp(empId);
        
        if(empObj != null){
            entity.remove(empObj);
        }
         
    }

    @Override
    public EmployeeDTO findEmp(Long empId) {
        
        EmployeeDTO emp = entity.find(EmployeeDTO.class, empId);
        
        return emp;
    }

    @Override
    public EmployeeDTO findAllEmp(Long empId) {
        
    }
    
}

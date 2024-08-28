/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.session;

import jakarta.ejb.Local;
import za.ac.tut.employee.EmployeeDTO;



/**
 *
 * @author RoseBaloyi
 */
@Local
public interface EmployeeInterface {
    
    public void addEmp(EmployeeDTO emp);
    public void updateEmp(EmployeeDTO emp);
    public void deleteEmp(Long empId);
    public EmployeeDTO findEmp(Long empId);
    public EmployeeDTO findAllEmp(Long empId);
    
}

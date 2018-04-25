package com.org;

import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("employeeService")
public class EmployeRestWebservices {

	 	private static EmployeeDAO employeeDAO = new EmployeeDAO();
	 	@Path("/store")
	 	@POST
	 	@Consumes(MediaType.APPLICATION_XML)
	 	public Response storeEmployeeService(Employee employee) {
	 		boolean status = employeeDAO.storeEmployee(employee);
	 		if(status) {
	 			return Response.status(Status.CREATED).entity("EMployee id"+employee.getEmpId()+"Created").build();
	 		}
	 		else {
	 			return Response.status(Status.CONFLICT).entity("Employee with an id"+employee.getEmpId()+"exists").build();
	 		}
	 	}
	 	
	 	@Path("/get/{empId}")
	 	@GET
	 	@Produces(MediaType.APPLICATION_XML)
	 	public Employee getEmployee(@PathParam("empId")int id) {
	 		Employee employee = employeeDAO.getEmployee(id);
	 				return employee;
	 	}
	 	
	 
	 	@Path("/modify/{empId}/{salary}")
	 	@PUT
	 	@Produces(MediaType.APPLICATION_XML)
	 	public Employee updateEmployeeSalary(@PathParam("empId")int id,@PathParam("salary")double salary) {
	 		return employeeDAO.updateEmployeeSalary(id, salary);
	 	}
	 
	 	
	 	@Path("delete/{empId}")
	 	@DELETE
	 	@Produces(MediaType.APPLICATION_XML)
	 	public Response removeEmployee(@PathParam("empId") int id) {
	 		boolean status = employeeDAO.removeEmployee(id);
	 		if(status){
	 			return Response.status(Status.OK).entity("Employe with an id"+id+"deleted").build();
	 		}else {
	 			return Response.status(Status.NO_CONTENT).entity("Employee "+id+"Exist").build();
	 		}
	 		
	 	}
	 	@Path("/getAllEmployee")
	 	@Produces(MediaType.APPLICATION_XML)
	 	@GET
	 	public Set<Employee> getAllEmployee(){
	 		return employeeDAO.getAllEmployee();
	 	}

}
package com.labs;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.LinkedHashSet;

@WebService(serviceName = "FindStudentsService")
public class StudentWebService {
    @WebMethod(operationName = "getStudentsByFields")
    public LinkedHashSet<Student> getStudentsByFields(@WebParam(name = "fieldValue") String[] searchArgs) {
        PostgreSQLDAO dao = new PostgreSQLDAO();
        return dao.getStudentsByFields(searchArgs);
    }
}
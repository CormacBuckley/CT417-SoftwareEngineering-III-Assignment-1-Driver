package com.mycompany.studentregdriver;

import com.mycompany.studentregistraionsystem.*;
import java.util.ArrayList;
import org.joda.time.DateTime;

/**
 *
 * @author I342042
 */
public class Driver {

    public static void main(String[] args) {

        ArrayList<Module> moduleList = new ArrayList<Module>();

        Module module = null;
        Student student;
        CourseProgramme cp;

        Student[] stud = new Student[10];

        cp = new CourseProgramme("BCT", module, new DateTime("2012-08-16"), new DateTime("2013-08-16"));;
        student = new Student("John Smith", 35, "01/01/2000", "1234", cp);
        module = new Module("CT414", student, cp);

        Module CompScience = new Module("CT414", student, cp);

        student.setName("John Smith");

        stud[0] = student;
        
        moduleList.add(CompScience);

       
            System.out.println("Modules:");
            System.out.println(moduleList.get(0).getName());
            System.out.println("Students registered for module:");
            System.out.println(moduleList.get(0).getStudents()[0].getName());

        

    }

}

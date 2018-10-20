package com.mycompany.studentregdriver;


import com.mycompany.studentregistraionsystem.*;
import org.joda.time.DateTime;

/**
 *
 * @author I342042
 */
public class Driver {
     public static void main(String[] args) {
   
         CourseProgramme cp = new CourseProgramme("BCT", module, new DateTime("2012-08-16"), new DateTime("2013-08-16"));;
         Student student = new Student("John Smith", 35, "01/01/2000", "1234", cp);
         Module module = new Module("CT414", student, cp);
    }
    
}

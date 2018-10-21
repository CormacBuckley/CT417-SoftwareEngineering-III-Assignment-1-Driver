package com.mycompany.studentregdriver;

import com.mycompany.studentregistraionsystem.*;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTime;

/**
 *
 * @author I342042
 */
public class Driver {

    public static void main(String[] args) {

        ArrayList<Module> moduleList = new ArrayList<Module>();
        ArrayList<CourseProgramme> CourseList = new ArrayList<CourseProgramme>();

        ///Course/////////////
        CourseProgramme CSIT = new CourseProgramme("BCT", new DateTime("2015-08-16"), new DateTime("2019-08-16"));
        CourseProgramme ECE = new CourseProgramme("ECE", new DateTime("2015-08-16"), new DateTime("2019-08-16"));

        ///////////////////////////////////////////////
        Student JohnSmith = new Student("John Smith", 35, "01/01/2000", "1835", CSIT);
        Student JaneDoe = new Student("Jane Doe", 28, "07/06/1988", "4308", CSIT);
        Student BillJones = new Student("Bill Jones", 35, "01/01/2000", "1675", CSIT);
        Student TomGreene = new Student("Tom Greene", 35, "01/01/2000", "3496", ECE);
        Student JenLawrence = new Student("Jen Lawrence", 35, "01/01/2000", "5587", ECE);

        ///////////Module Setup/////////////
        Module SoftwareEng = new Module("CT417", JenLawrence, CSIT);
        Module MachineLearning = new Module("CT475", JaneDoe, CSIT);
        Module AI = new Module("CT421", TomGreene, CSIT);
        Module Modelling = new Module("CT561", JenLawrence, ECE);
        Module ProfessionalSkills = new Module("CT436", JenLawrence, ECE);    
        Module SignalProcessing = new Module("EE445", JenLawrence, ECE);

        SoftwareEng.setStudents(new Student[]{JohnSmith, JaneDoe});
        MachineLearning.setStudents(new Student[]{TomGreene, JenLawrence});
        ProfessionalSkills.setStudents(new Student[]{TomGreene});
        AI.setStudents(new Student[]{BillJones});
        
        

        moduleList.add(SoftwareEng);
        moduleList.add(MachineLearning);
        moduleList.add(AI);
           
        moduleList.add(Modelling);
        moduleList.add(ProfessionalSkills);
        moduleList.add(SignalProcessing);
      
        //////////////////////////////////////////////////////   

        CSIT.setModules(new Module[] {SoftwareEng,MachineLearning,AI});
     
        
        
        ECE.setModules(new Module[] {Modelling,ProfessionalSkills,SignalProcessing});
        CourseList.add(CSIT);
        CourseList.add(ECE);
        
        System.out.println("Courses:");
        System.out.println("---------------------------");
        for (int i = 0; i < CourseList.size(); i++) {
            System.out.println(CourseList.get(i).getName() + ":");
            System.out.println("-----");
            System.out.println("Modules in this Course:");
            System.out.println("---------------------------");
            for (int x = 0; x < CourseList.get(i).getModules().length; x++) {
                System.out.println(CourseList.get(i).getModules()[x].getName() + ":");
                System.out.println("-----");
                System.out.println("Students registered for this module:");
                for (Student j : moduleList.get(x).getStudents()) {
                    System.out.print("Name: " + j.getName());
                     System.out.println(" ID: " + j.getUsername());
                }
                System.out.println("---------------------------");
            }
        }
        System.out.println("---------------------------");

    }

}

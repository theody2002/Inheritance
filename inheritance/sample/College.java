package com.inheritance.sample;

public class College extends Subject {

    private String designation;
    String College;
    String collegeName;
    String strAction;
    Subject subObj = new Subject();

    public College(String designation, String collegeName, String subjectName,String College) {
        super();

        this.College = College;
        this.designation = designation;
        this.collegeName = collegeName;
        subObj.setSubject(subjectName);
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }
    public String getSubjectName() {
        return subObj.subject;
    }
    public String getCollege() {
        return College;
    }
    void does(){
        System.out.println("Teaching");
    }

    private void does(String strAction){
        this.strAction = strAction;
        System.out.println("Teaching - " + strAction);
    }
}
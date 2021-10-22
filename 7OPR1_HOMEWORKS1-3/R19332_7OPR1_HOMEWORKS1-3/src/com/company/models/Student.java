package com.company.models;

public class Student extends Person{
    private String universityName;
    private String branchOfStudy;


    public Student(String name, char sex, Address address, BirthDate birthDate, String universityName, String branchOfStudy) {
        super(name, sex, address, birthDate);
        this.universityName = universityName;
        this.branchOfStudy = branchOfStudy;
    }



    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getBranchOfStudy() {
        return branchOfStudy;
    }

    public void setBranchOfStudy(String branchOfStudy) {
        this.branchOfStudy = branchOfStudy;
    }

    @Override
    public String toString() {
        return String.format("Student:%s\nName of university: %s\nBranch Of Study: %s",
                super.toString(), getUniversityName(), getBranchOfStudy());
    }
}

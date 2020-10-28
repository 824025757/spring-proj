package com.qk.beans;

public class StudentC {
    private StudentA studentA ;
    private String tgg="abc";

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {
    }

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}

package com.qk.beans;

public class StudentC {
    private StudentA studentA ;
    private double pi=3.14;

    public void setStudentA(StudentA studentA) {
        this.studentA = studentA;
    }

    public StudentC() {
    }

    public StudentC(StudentA studentA) {
        this.studentA = studentA;
    }
}

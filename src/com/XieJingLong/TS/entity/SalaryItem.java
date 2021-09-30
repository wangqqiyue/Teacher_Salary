package com.XieJingLong.TS.entity;

/**
 * 工资项目
 * @author 王启越
 * @date 2021/9/30
 */
public class SalaryItem {

    /**
     * 五险比例和住房公积金比例，都作为静态成员变量，不用再多此一举，做一次查询了。
     */
    public static double insuranceRate = 0.1;
    public static double publicReserveFundsRate=0.12;

    public static double getInsuranceRate() {
        return insuranceRate;
    }

    public static void setInsuranceRate(double insuranceRate) {
        SalaryItem.insuranceRate = insuranceRate;
    }

    public static double getPublicReserveFundsRate() {
        return publicReserveFundsRate;
    }

    public static void setPublicReserveFundsRate(double publicReserveFundsRate) {
        SalaryItem.publicReserveFundsRate = publicReserveFundsRate;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public double getPostSalary() {
        return postSalary;
    }

    public void setPostSalary(double postSalary) {
        this.postSalary = postSalary;
    }

    public double getTitleSalary() {
        return titleSalary;
    }

    public void setTitleSalary(double titleSalary) {
        this.titleSalary = titleSalary;
    }

    public double getTotalPayAmount() {
        return totalPayAmount;
    }

    public void setTotalPayAmount(double totalPayAmount) {
        this.totalPayAmount = totalPayAmount;
    }

    public double getInsurance() {
        return insurance;
    }

    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    public double getPublicReserveFunds() {
        return publicReserveFunds;
    }

    public void setPublicReserveFunds(double publicReserveFunds) {
        this.publicReserveFunds = publicReserveFunds;
    }

    public double getFinalPayAmount() {
        return finalPayAmount;
    }

    public void setFinalPayAmount(double finalPayAmount) {
        this.finalPayAmount = finalPayAmount;
    }

    int teacherId;
    String teacherName;
    double postSalary;
    double titleSalary;
    double totalPayAmount;
    double insurance;
    double publicReserveFunds;
    double finalPayAmount;

    public SalaryItem(int teacherId, String teacherName, double postSalary, double titleSalary, double totalPayAmount, double insurance, double publicReserveFunds, double finalPayAmount) {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.postSalary = postSalary;
        this.titleSalary = titleSalary;
        this.totalPayAmount = totalPayAmount;
        this.insurance = insurance;
        this.publicReserveFunds = publicReserveFunds;
        this.finalPayAmount = finalPayAmount;
    }

}

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

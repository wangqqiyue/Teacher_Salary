package com.XieJingLong.TS.entity;

/**
 * @author 王启越
 * @date 2021/9/30
 */
public class Post {
    private int post_id;
    private double salary;
    private String post;

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }
}

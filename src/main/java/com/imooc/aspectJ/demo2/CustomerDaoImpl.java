package com.imooc.aspectJ.demo2;

public class CustomerDaoImpl implements CustomerDao{
    public void save(){
        System.out.println("保存客户...");
    }
    public void delete(){
        System.out.println("删除客户...");
    }
    public String update(){
        System.out.println("更新客户...");
        return "Spring";
    }
    public void findOne(){
        System.out.println("查询一个客户...");
         int i=1/0;
    }
    public void findAll(){
        System.out.println("查询所有客户...");
        int i=1/0;
    }
}

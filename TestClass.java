package com.chinasofti.test;

import org.junit.Test;


import java.text.SimpleDateFormat;
import java.util.Date;

/*
*user wawa
*/
public class TestClass {

    @Test
    public void weilang(){
        System.out.println("姓名：卫朗");
        System.out.println("性别：男");
        System.out.println("年龄："+new SimpleDateFormat("yyyy-MM-dd").format(new Date(1993-1900, 0, 10)));
        System.out.println("工作地点：上海");
        System.out.println("电话：13437271171");
        System.out.println("邮箱：a2413478071@163.com\n");
        System.out.println("专业技能：");
        System.out.println("1、熟悉mysql，oracle，redis等数据库，tomcat web服务器的使用；\n" +
                "2、熟悉JavaScript，jquery，HTML，css，jstl，Ajax，Bootstrap等web前端技术；\n" +
                "3、熟练Spring，SpringMVC，mybatis，hibernate，Structs2等框架；\n" +
                "4、熟练掌握java基础，具有面向对象编程开发思想；\n" +
                "5、熟练掌握J2EE应用服务开发，mvc开发模式；\n" +
                "6、熟练掌握eclipse，tst，idea，HBuilder等开发工具的使用；\n" +
                "7、熟悉apache集群服务器，了解Java分布式开发；\n" +
                "8、熟练maven构建工具，svn版本控制工具的使用；\n" +
                "9、掌握项目在Windows上的部署，熟悉Linux上的部署，熟悉基本Linux命令；\n" +
                "10、熟悉webservice通讯技术，了解easyui；\n");
        System.out.println("工作经验：");
        long time = new Date(2017 - 1900, 6-1, 20).getTime();
        long time1 = new Date(2016 - 1900, 3-1, 1).getTime();
        Date date = new Date(time - time1);
        System.out.println("上海茁云科技服务有限公司：工作时间："+(date.getYear()-70)+"年"+date.getMonth()+"月"+date.getDay()+"天\n");
        System.out.println("教育经历:\n" +
                "2012年9月-2016年6月         湖北银河信息技术学院      网络安全全科\n" +
                "2014年3月-至今              华中农业大学             信息管理与信息系统\n");
        System.out.println("自我评价:\n" +
                "本人性格沉稳开朗，乐观向上\n" +
                "学习能力强，新事物上手快，适应性强\n" +
                "喜欢研究新的知识和技术，乐于学习新知识\n" +
                "具有良好的团队协作能力\n");
    }
}

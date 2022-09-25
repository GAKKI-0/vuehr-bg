package com.example.vuehr.config.mybatis;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

public class MybatisGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://47.111.3.127:3306/vhr?serverTimezone=UTC", "lottery_use", "lottery_use")
                .globalConfig(builder -> {
                    builder.author("wildfire") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("C:\\Developments\\Codes\\JavaCode\\vuehr\\src\\main\\java"); // 指定输出目录
                })
                .packageConfig(builder -> {
                    builder.parent("com.example.vuehr") // 设置父包名
                            .moduleName("mybatis") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "C:\\Developments\\Codes\\JavaCode\\vuehr\\src\\main\\resources\\mapper")); // 设置mapperXml生成路径
                })
                .strategyConfig(builder -> {
                    builder.enableCapitalMode()
                            .addInclude("adjustsalary")
                    .addInclude("appraise")
                    .addInclude("department")
                    .addInclude("employee")
                    .addInclude("employeeec")
                    .addInclude("employeeremove")
                    .addInclude("employeetrain")
                    .addInclude("empsalary")
                    .addInclude("hr")
                    .addInclude("hr_role")
                    .addInclude("joblevel")
                    .addInclude("mail_send_log")
                    .addInclude("menu")
                    .addInclude("menu_role")
                    .addInclude("msgcontent")
                    .addInclude("nation")
                    .addInclude("oplog")
                    .addInclude("politicsstatus")
                    .addInclude("position")
                    .addInclude("role")
                    .addInclude("salary")
                    .addInclude("sysmsg")
                    ; // 设置需要生成的表名
//                            .addTablePrefix("t_", "c_"); // 设置过滤表前缀
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();

    }
}

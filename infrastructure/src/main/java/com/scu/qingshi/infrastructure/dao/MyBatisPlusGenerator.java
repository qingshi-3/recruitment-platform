package com.scu.qingshi.infrastructure.dao;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * @author qingshi
 * @Classname MyBatisPlusGenerator
 * @Description MyBatisPlus代码生成器
 * @Data 2021/4/25
 * @Created by qingshi
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        // 构建一个代码自动生成器的对象
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig globalConfig = new GlobalConfig();
        // 获取当前项目路径
        String property = System.getProperty("user.dir");
        globalConfig.setOutputDir(property+"/src/main/java");
        globalConfig.setAuthor("青时");
        globalConfig.setOpen(false);
        globalConfig.setFileOverride(true);
        globalConfig.setServiceName("%sService");
        globalConfig.setIdType(IdType.AUTO);
        globalConfig.setDateType(DateType.ONLY_DATE);
        globalConfig.setSwagger2(true);
        mpg.setGlobalConfig(globalConfig);

        // 设置数据源
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/recruitment_platform?useSSL=false&serverTimezone=GMT%2B8&useUnicode=true&characterEncoding=utf-8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("1234");
        dataSourceConfig.setDbType(DbType.MYSQL);
        mpg.setDataSource(dataSourceConfig);

        // 包的配置
        PackageConfig packageConfig = new PackageConfig();
        // 在com.qingshi下新建目录,当不设置时，不新建目录，直接生成mapper、controller、service文件
        //packageConfig.setModuleName("mbp");
        packageConfig.setEntity("po");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        packageConfig.setController("controller");
        packageConfig.setParent("com.scu.qingshi.infrastructure.dao");
        mpg.setPackageInfo(packageConfig);

        //4、策略配置
        StrategyConfig strategy = new StrategyConfig();
        // 设置要映射的表名
        strategy.setInclude("user","email","node","interview_process","announcement");
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        // 自动lombok
        strategy.setEntityLombokModel(true);
        strategy.setLogicDeleteFieldName("deleted");
        // 自动填充配置
        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(gmtCreate);
        tableFills.add(gmtModified);
        strategy.setTableFillList(tableFills);
        // 乐观锁
        strategy.setVersionFieldName("version");
        strategy.setRestControllerStyle(true);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
        mpg.execute();
        //执行

    }
}

package lab.zlren.xunwu.config.mybatis;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @author zlren
 * @date 2018-01-03
 */
public class Generator {

    public static void main(String[] args) {

        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        gc.setOutputDir("/Users/zlren/Documents/work_space/lab/xunwu/src/main/java");
        gc.setFileOverride(true);
        gc.setActiveRecord(false);
        // XML 二级缓存
        gc.setEnableCache(false);
        gc.setBaseResultMap(false);
        gc.setBaseColumnList(false);
        // .setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor("zlren");

        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL);
        dsc.setTypeConvert(new MySqlTypeConvert() {
            // 自定义数据库表字段类型转换【可选】
            @Override
            public DbColumnType processTypeConvert(String fieldType) {
                System.out.println("转换类型：" + fieldType);
                // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
                return super.processTypeConvert(fieldType);
            }
        });

        dsc.setDriverName("com.mysql.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        dsc.setUrl("jdbc:mysql://127.0.0.1:3306/xunwu?characterEncoding=utf8");
        mpg.setDataSource(dsc);

        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        strategy.setTablePrefix(new String[]{});// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        // strategy.setInclude(new String[] { "user" }); // 需要生成的表
        // strategy.setExclude(new String[]{"test"}); // 排除生成的表
        // 自定义实体父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义实体，公共字段
        // strategy.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 service 实现类父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(true);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName(String name) {this.name = name; return this;}
        // strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("lab.zlren.xunwu");
        pc.setModuleName("");
        mpg.setPackageInfo(pc);

        // // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        // InjectionConfig cfg = new InjectionConfig() {
        //     @Override
        //     public void initMap() {
        //         // Map<String, Object> map = new HashMap<String, Object>();
        //         // map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
        //         // this.setMap(map);
        //     }
        // };
        //
        // // 自定义 xxList.jsp 生成
        // List<FileOutConfig> focList = new ArrayList<FileOutConfig>();
        // focList.add(new FileOutConfig("/template/list.jsp.vm") {
        //     @Override
        //     public String outputFile(TableInfo tableInfo) {
        //         // 自定义输入文件名称
        //         return "D://my_" + tableInfo.getEntityName() + ".jsp";
        //     }
        // });
        // cfg.setFileOutConfigList(focList);
        // mpg.setCfg(cfg);

        // 调整 xml 生成目录演示
        // focList.add(new FileOutConfig("/mapper_xml") {
        //     @Override
        //     public String outputFile(TableInfo tableInfo) {
        //         return tableInfo.getEntityName() + "Mapper.xml";
        //     }
        // });
        // cfg.setFileOutConfigList(focList);
        // mpg.setCfg(cfg);server:
        //   port: 8090
        //
        // logging:
        //   level.lab.zlren.op.mis.mapper: debug
        //   level: info
        //
        // spring:
        //   datasource:
        //     driver-class-name: com.mysql.jdbc.Driver
        //     type: com.zaxxer.hikari.HikariDataSource
        //     url: jdbc:mysql://10.109.246.35:3306/zlren?useUnicode=true&characterEncoding=utf-8&useSSL=false
        //     username: root
        //     password: Lab2016!
        //     hikari:
        //       connection-timeout: 60000
        //       maximum-pool-size: 5
        //
        // mybatis-plus:
        //   configuration:
        //     cache-enabled: false
        //     map-underscore-to-camel-case: true
        //   global-config:
        //     db-column-underline: true
        //     field-strategy: 2
        //     id-type: 2
        //     refresh-mapper: false
        //   typeAliasesPackage: lab.zlren.op.mis.entry

        // 关闭默认 xml 生成，调整生成 至 根目录
        // TemplateConfig tc = new TemplateConfig();
        // tc.setXml(null);
        // mpg.setTemplate(tc);

        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称
        TemplateConfig tc = new TemplateConfig();
        tc.setController(null);
        // tc.setEntity("entity");
        // tc.setMapper("mapper");
        tc.setXml(null);
        tc.setService(null);
        tc.setServiceImpl(null);
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        mpg.setTemplate(tc);

        // 执行生成
        mpg.execute();

        // 打印注入设置【可无】
        // System.err.println(mpg.getCfg().getMap().get("abc"));
    }
}


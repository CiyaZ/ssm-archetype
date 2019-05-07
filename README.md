# 我的SSM项目骨架

这是一个最简单的Maven单模块SSM项目骨架，用于搭建小型项目，以及实验时快速创建Demo。

## 主要依赖

* Spring
* Thymeleaf
* Slf4j/Logback
* Mybatis
* MySQL
* Lombok

## 使用方式

### 安装到本地

```
mvn clean install
```

### 调用模板

```
mvn archetype:generate \
-DarchetypeCatalog=local \
-DarchetypeGroupId=com.ciyaz \
-DarchetypeArtifactId=ssm-archetype \
-DarchetypeVersion=1.0-SNAPSHOT \
-DgroupId=<项目组名> \
-DartifactId=<项目名> \
-DinteractiveMode=false
```

## 测试

默认`doc`下有一个数据库建表SQL文件，可供自动生成的持久层组件访问，以进行测试，不需要删了就行。
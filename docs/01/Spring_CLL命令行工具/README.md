## 使用命令行工具（Spring CLI）

Spring提供了一个命令行接口（CLI），可以快速生成Spring Boot项目结构。

- **安装Spring CLI**：

  - 可以从[Spring官网](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started-installing-the-cli)下载并安装。

- **创建项目**：

  - 使用如下命令生成项目：

    ```bash
    spring init --dependencies=web myproject
    ```

  - 这条命令会创建一个名为`myproject`的基础Spring Boot项目，其中包含了`spring-boot-starter-web`依赖。

### 手动创建

虽然不推荐初学者使用这种方式，但了解手动创建过程对于深入理解Spring Boot是有帮助的。

- **步骤**：
  - 创建一个新的Maven或Gradle项目。
  - 在`pom.xml`（对于Maven）或`build.gradle`（对于Gradle）文件中添加Spring Boot父POM及所需的依赖。
  - 创建一个包含`@SpringBootApplication`注解的主类，并实现`public static void main(String[] args)`方法来启动应用。
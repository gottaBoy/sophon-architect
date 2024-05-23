# 🥤 sophon
外部不同端的适配层，例如：Mobile（APP）、Wap（H5）、Web（PC Web）等不同的客户端的支持

适配层（Adapter Layer）：负责对前端展示（web，wireless，wap）的路由和适配，对于传统B/S系统而言，adapter就相当于MVC中的controller；

应用层（Application Layer）：主要负责获取输入，组装上下文，参数校验，调用领域层做业务处理，如果需要的话，发送消息通知等。层次是开放的，应用层也可以绕过领域层，直接访问基础实施层；

领域层（Domain Layer）：主要是封装了核心业务逻辑，并通过领域服务（Domain Service）和领域对象（Domain Entity）的方法对App层提供业务实体和业务逻辑计算。领域是应用的核心，不依赖任何其他层次；

基础实施层（Infrastructure Layer）：主要负责技术细节问题的处理，比如数据库的CRUD、搜索引擎、文件系统、分布式服务的RPC等。此外，领域防腐的重任也落在这里，外部依赖需要通过gateway的转义处理，才能被上面的App层和Domain层使用


## 生成web项目
```bash
mvn archetype:generate \
    -DgroupId=com.zeron.sophon \
    -DartifactId=workorder \
    -Dversion=1.0.0-SNAPSHOT \
    -Dpackage=com.zeron.sophon.workorder \
    -DarchetypeArtifactId=sophon-framework-archetype-web \
    -DarchetypeGroupId=com.zeron.sophon \
    -DarchetypeVersion=3.0.0-SNAPSHOT \
    -DarchetypeCatalog=internal
```

## [生成接口服务]() pdm
```bash
mvn archetype:generate \
    -DgroupId=com.zeron.sophon \
    -DartifactId=pdmapi \
    -Dversion=1.0.0-SNAPSHOT \
    -Dpackage=com.zeron.sophon.pdm \
    -DarchetypeArtifactId=sophon-framework-archetype-service \
    -DarchetypeGroupId=com.zeron.sophon \
    -DarchetypeVersion=3.0.0-SNAPSHOT \
    -DarchetypeCatalog=internal
```

<strong>sophon 是 Clean Object-Oriented and Layered Architecture的缩写，代表“整洁面向对象分层架构”。
目前sophon已经发展到[sophon v1](https://blog.csdn.net/significantfrank/article/details/110934799)。</strong>

> - 想了解更多sophon信息，请关注微信公众号：  
> ![qrcode_60.jpg](https://img-blog.csdnimg.cn/2020110314110321.png#pic_center)
> - 想了解更多sophon背后的故事，请支持我的新书[《程序员的底层思维》](https://item.jd.com/13652002.html)

sophon分为两个部分，sophon架构和sophon组件。

# 一、sophon架构

## sophon 概述

**架构**的**意义** 就是 要素结构：

- 要素 是 组成架构的重要元素；
- 结构 是 要素之间的关系。

而 **应用架构**的**意义** 就在于

- 定义一套良好的结构；
- 治理应用复杂度，降低系统熵值；
- 从随心所欲的混乱状态，走向井井有条的有序状态。

![archWhy](https://img-blog.csdnimg.cn/e27c22d706084ead900c8838326135f3.png)

sophon架构就是为此而生，其核心职责就是定义良好的应用结构，提供最佳应用架构的最佳实践。通过不断探索，我们发现良好的分层结构，良好的包结构定义，可以帮助我们治理混乱不堪的业务应用系统。

![cure](https://img-blog.csdnimg.cn/2020120918285068.png)

经过多次迭代，我们定义出了相对稳定、可靠的应用架构：sophon v4

![sophon](https://img-blog.csdnimg.cn/6549230c6723448fb3ab51ca74829e80.png)

## sophon Archetypes

好的应用架构，都遵循一些共同模式，不管是六边形架构、洋葱圈架构、整洁架构、还是sophon架构，**都提倡以业务为核心，解耦外部依赖，分离业务复杂度和技术复杂度等**。

sophon架构区别于这些架构的地方，在于除了思想之外，我们还提供了可落地的工具和实践指导。

为了能够快速创建满足sophon架构的应用，我们提供了两个`archetype`，位于[`sophon-archetypes`目录](sophon-archetypes)下：

1. `sophon-archetype-service`：用来创建纯后端服务的`archetype`。
2. `sophon-archetype-web`：用来创建`adapter`和后端服务一体的`web`应用`archetype`。

# 二、sophon组件

此外，我们还提供了一些非常有用的通用组件，这些组件可以帮助我们提升研发效率。

这些功能组件被收拢在[`sophon-components`目录](sophon-components)下面。到目前为止，我们已经沉淀了以下组件：

组件名称 | 功能 | 依赖
------ | ---- | ----
`sophon-component-dto` | 定义了`DTO`格式，包括分页 |无
`sophon-component-exception` | 定义了异常格式，<br>主要有`BizException`和`SysException` |无
`sophon-component-statemachine` | 状态机组件 | 无
`sophon-component-domain-starter` | `Spring`托管的领域实体组件 | 无
`sophon-component-catchlog-starter` | 异常处理和日志组件 | `exception`、`dto`组件
`sophon-component-extension-starter` | 扩展点组件 | 无
`sophon-component-test-container` | 测试容器组件 | 无

# 三、如何使用sophon

## 1. 创建应用

执行以下命令：

```bash
mvn archetype:generate \
    -DgroupId=com.zeron.sophon.demo.web \
    -DartifactId=demo-web \
    -Dversion=1.0.0-SNAPSHOT \
    -Dpackage=com.zeron.sophon.demo \
    -DarchetypeArtifactId=sophon-framework-archetype-web \
    -DarchetypeGroupId=com.zeron.sophon \
    -DarchetypeVersion=4.3.1
```

命令执行成功的话，会看到如下的应用代码结构：

![demo](https://img-blog.csdnimg.cn/20201209192258840.png)

注：也可以使用阿里云的应用生成器：https://start.aliyun.com/bootstrap.html 生成sophon应用。

## 2. 运行应用

- 在`项目`目录下运行`mvn install`（如果不想运行测试，可以加上`-DskipTests`参数）。
- 进入`start`目录，执行`mvn spring-boot:run`。  
  运行成功的话，可以看到`SpringBoot`启动成功的界面。
- 生成的应用中，已经实现了一个简单的`Rest`请求，可以在浏览器中输入 http://localhost:8080/helloworld 进行测试。

如果要生成不是`web`工程而是`service`工程也类似，执行的是下面的命令：

```bash
mvn archetype:generate \
    -DgroupId=com.zeron.sophon.demo.service \
    -DartifactId=demo-service \
    -Dversion=1.0.0-SNAPSHOT \
    -Dpackage=com.zeron.sophon.demo \
    -DarchetypeArtifactId=sophon-framework-archetype-service \
    -DarchetypeGroupId=com.zeron.sophon \
    -DarchetypeVersion=4.3.1
```

# 版本迭代

## 1.0.0 版本

# 相关链接
COLA 4.0：应用架构的最佳实践 https://blog.csdn.net/significantfrank/article/details/110934799
【架构设计】阿里开源架构Cola4.0的项目实践：订单系统 https://blog.csdn.net/qq_42985872/article/details/130723381
最佳实践 https://github.com/charles0719/smile-cola
Mavan：自定义骨架及工程初始化 https://cloud.tencent.com/developer/article/2183022
Maven私服搭建及自定义Archetype(骨架) https://cloud.tencent.com/developer/article/1915522?areaId=106001
详解通过 Nexus3.x 搭建 Maven 私服 https://cloud.tencent.com/developer/article/2031304?areaId=106001
基于领域模型构建多模块项目骨架 https://cloud.tencent.com/developer/article/1749671?areaId=106001
架构师工具箱（二）Maven——Maven生成Archetype https://blog.csdn.net/cyl101816/article/details/105080982
COLA 4.0：直击应用架构本质的最佳实践 https://developer.aliyun.com/article/913708
使用Maven Archetype来生成项目框架 https://www.shenyanchao.cn/blog/2013/05/21/use-maven-archetype-to-generate-project-architecture/
Maven多Module自定义archetype https://perkins4j2.github.io/posts/72500/
Maven Archetype 模板开发详解 https://blog.51cto.com/u_15127629/2883893
IDEA自定义Maven的archetype https://terwergreen.com/post/idea-zi-ding-yimaven-archetype.html#%E6%B7%BB%E5%8A%A0%E9%AA%A8%E6%9E%B6
Maven Archetype 多 Module 自定义代码脚手架 https://juejin.cn/post/7052965570660007967
IDEA必备插件、阿里巴巴规范插件（代码格式化，注释模板化）的安装及使用和快捷键设置 https://www.cnblogs.com/LucasMeng/p/17090334.html
基于DDD的cola架构的改进（面向微服务） https://www.cnblogs.com/yu007/p/18034207
领域驱动设计菜鸟 cola实践篇 http://xinyeshuaiqi.cn/2020/01/09/ddd-cola/
demo https://github.com/shiyindaxiaojie/eden-demo-cola
architect https://github.com/shiyindaxiaojie/eden-architect
DDD领域驱动工程落地实战 http://www.uml.org.cn/sjms/202302224.asp
领域驱动模型VO，BO，PO，DO，DTO概念及其区别 https://www.jianshu.com/p/6ea81cad1a22

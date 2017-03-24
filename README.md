# demoProject
#### 1
官网demo (spring boot + mybatis)
http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/
https://github.com/mybatis/spring-boot-starter/tree/master/mybatis-spring-boot-samples/mybatis-spring-boot-sample-xml
#### 2
参考项目：
http://blog.csdn.net/isea533/article/details/50359390  （Spring Boot 集成MyBatis ）
https://github.com/abel533/MyBatis-Spring-Boot  (Spring Boot 集成 MyBatis, 分页插件 PageHelper, 通用 Mapper)
mvn mybatis-generator:generate

#### 3 kafka
https://git.oschina.net/gm100861/spring-boot-kafka
注意topic 和 group的含义。   （一个topic可以有多个 消费者。  而一组消费者 使用一个group表示 这组消费者 消费的是同一个序列。
而这个序列可以有 多个partion， 如果配置这组消费者的个数和partion相同， 则每个partion被分配到了一个消费者，从而实现了负荷分担。
如果 消费者个数比partion多， 则有些消费者不能获取到数据。如果消费者比partion少， 则需要将消费者的消费者线程配置多个，从而实现
每个partion分配到一个消费者的目的----但要避免partion过少， 消费者线程过多， 而某些消费者线程集中到一个server上的情况）

#### 4 spring integration
https://www.oschina.net/translate/spring-integration-40-complete-xml-free  (Spring Integration 4.0: 一个完全无需 XML 的示例)

#### 5 blur-admin
增加blur-admin，作为前端界面基础。
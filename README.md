# springboot2-log4j2-demo
springboot2+log4j2简单demo,以后开发，需要用到哪种配置，或者需要集成log，直接使用demo的代码就可以了。
而且本demo对新手友好，简单的配置不会删除。也同时保有略复杂的配置
##v1.0 因为springboot2的log4j2自动集成了Slf4j，所以配置起来十分方便，只需要配置log4j2就可以了。
第一版为简单配置
第二版配置更加全面
#第二版第一次提交，梳理了日志输入是逻辑，可以只输入info日志，或者输入info级别以上日志。
#增加了包级别设置


配置Log4j2异步日志：
1. 添加JVM参数：-DLog4jContextSelector=org.apache.logging.log4j.core.async.AsyncLoggerContextSelector
2. 添加Disruptor依赖：
   <dependency>
   <groupId>com.lmax</groupId>
   <artifactId>disruptor</artifactId>
   <version>3.3.7</version>
   </dependency>
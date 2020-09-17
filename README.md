## 使用步骤
1、 下载 RocketMQ 和 RocketMQ Console <br/>
    http://rocketmq.apache.org/docs/quick-start <br/>
    https://github.com/apache/rocketmq-externals/tree/master/rocketmq-console <br/> 

2、 启动 nameserver
```text
cd /Users/liuyanzhao/Documents/JavaStudy/rocketmq-all-4.4.0
nohup sh bin/mqnamesrv &
tail -f ~/logs/rocketmqlogs/namesrv.log
```
备注：修改修改路径为您的电脑上的路径

3、 启动broker
```text
nohup sh bin/mqbroker -n localhost:9876 &
tail -f ~/logs/rocketmqlogs/namesrv.log
``` 

4、 启动rocketmq-console <br/>
下载 rocketmq-console 后自行修改 `application.properties` 里端口为9999，然后 `mvn clean install`

```text
cd /Users/liuyanzhao/Documents/JavaStudy/rocketmq-externals-rocketmq-console-1.0.0/rocketmq-console/target
nohup java -jar rocketmq-console-ng-1.0.0.jar &
```
访问 `http://localhost:9999` <br/>
创建 Topic：`T_DEMO_PROJECT`    <br/>
创建 Consumer：`CID_DEMO_PROJECT`   <br/>

5、启动项目  <br/>
先后启动 `rocketmq-consumer-demo` 和 `rocketmq-producer-demo` 项目 <br/>
地址栏每访问一次 `http://localhost:8080/testAddUser` 或 `http://localhost:8080/testAddOrder`
都可以生产一条MQ消息

观察`rocketmq-consumer-demo` 项目的控制台，可以看到消费了消息。
 
## 联系方式
微信 847064370
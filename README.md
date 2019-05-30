# spring-cloud-zookeeper
使用zookeeper作为spring cloud的服务注册管理中心

## 环境
* spring boot使用2.1.4版本
* spring cloud使用Greenwich.SR1
* zookeeper集群使用3.4.14

## 简介
* gateway使用 spring cloud gateway作为网关服务
* provider 使用 netty 作为内嵌web服务

## 启动说明
1. 启动zookeeper集群
2. 启动provider微服务程序
3. 启动gateway网关程序
4. 使用http://127.0.0.1:8080/provider/hello 访问REST接口

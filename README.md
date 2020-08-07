# Monitoring apps using prometheus operator

[![license](https://img.shields.io/github/license/Shenmiu/k8s-prometheus-demo.svg)](LICENSE)


[![standard-readme compliant](https://img.shields.io/badge/readme%20style-standard-brightgreen.svg?style=flat-square)](https://github.com/RichardLitt/standard-readme)

这个 demo 包含了 app 的源文件、Dockerfile 以及 k8s 的 spec

## Background

基于已经部署好 Prometheus 的 K8s 集群，构建应用镜像并上传到 Harbor 镜像仓库。应用 spec，创建 Deployment、Service 以及 ServiceMonitor

## Usage

### 构建并上传镜像

```shell
$ docker build -t harbor.edu.cn/library/k8s-prometheus-demo:1.0 
$ docker login harbor.edu.cn
$ docker push harbor.edu.cn/library/k8s-prometheus-demo:1.0
```

### 应用 spec

```shell
$ kubectl apply demo.yml
$ kubect apply service_monitor.yml
```

**注意:** spec 中的 namespace, app name, label 以及 image 都需要改为自己的内容

Prometheus 的 Targets 界面看见抓取到了对应应用的 endpoint，则表示配置成功

<img src="https://shenmiu.oss-cn-hangzhou.aliyuncs.com/uPic/2020-08-08-mdfpMu.png" style="zoom:30%">


## License

[MIT © Shenmiu.](LICENSE)

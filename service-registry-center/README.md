# Service Registry Center

Service Registry Center is a service providing `Service Discovery`, `Service Registry` etc.

[TOC]

# How to Deploy Micro-service on Docker

For example, the default environment is `development (dev)`. 

1. Maven clean, validate, compile, package

2. Run Maven plugin: dockerfile:build

3. Run Docker compose

   ```shell
   docker-compose.dev.yml up -d
   ```

   


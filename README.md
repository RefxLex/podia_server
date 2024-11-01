# podia_server
Server for podia-clone website

1. Логин в Docker
```shell script
docker login
```

2. Сборка
```shell script
docker build --progress=plain -t refxlexj/podia-server:1.0.0 .
```

3. 
```shell script
docker run -d -p 8081:8081 --name podia-server refxlexj/podia-server:1.0.0
```

4. 
```shell script
docker push refxlexj/podia-server:1.0.0
